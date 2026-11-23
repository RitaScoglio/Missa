package sk.missa

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.GestureDetector
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.core.view.doOnLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale
import kotlinx.coroutines.launch
import sk.missa.calendar.LiturgicalDate
import sk.missa.calendar.celebration.LiturgicalColor
import sk.missa.ui.navigation.AppDestination
import sk.missa.ui.navigation.Screen
import sk.missa.ui.components.LiturgyBlockView
import sk.missa.ui.app.ChoiceDialogState
import sk.missa.ui.app.ContentEntry
import sk.missa.ui.app.AppUiState
import sk.missa.ui.app.AppViewModel
import sk.missa.ui.components.missaDialog
import sk.missa.ui.components.MissaStyle
import sk.missa.ui.components.scaledTextSize
import sk.missa.ui.components.applyMissaTextSize

/** Android entry point: renders application state and forwards user actions to its ViewModel. */
class MainActivity : ComponentActivity() {
    private lateinit var model: AppViewModel
    private lateinit var root: FrameLayout
    private lateinit var column: LinearLayout
    private var scroll: ScrollView? = null
    private var dialog: AlertDialog? = null
    private var shownDialog: ChoiceDialogState? = null
    private var rendered: AppUiState? = null
    private var bellPlayer: android.media.MediaPlayer? = null
    private lateinit var gestures: GestureDetector
    private val locale = Locale.forLanguageTag("sk-SK")
    private val positions = object : LinkedHashMap<String, Int>(32, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<String, Int>?): Boolean = size > 32
    }
    private var pageKey: String? = null
    private var pendingTextAnchor: Pair<String, Triple<Int, Int, Int>>? = null
    private var calendarToday: View? = null
    private val style get() = MissaStyle(this, model.settings.nightMode)
    private val popups = mutableListOf<Dialog>()
    private var drawerScroll: ScrollView? = null
    private var drawerPosition = 0
    private val launchStartedAt = SystemClock.uptimeMillis()
    private var startupReported = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = ViewModelProvider(this)[AppViewModel::class.java]
        root = object : FrameLayout(this) {
            private val statusPaint = android.graphics.Paint()
            override fun onDraw(canvas: android.graphics.Canvas) {
                super.onDraw(canvas)
                statusPaint.color = style.chrome
                canvas.drawRect(0f, 0f, width.toFloat(), paddingTop.toFloat(), statusPaint)
                canvas.drawRect(0f, (height - paddingBottom).toFloat(), width.toFloat(), height.toFloat(), statusPaint)
            }
        }.apply { setWillNotDraw(false) }
        WindowCompat.setDecorFitsSystemWindows(window, false)
        ViewCompat.setOnApplyWindowInsetsListener(root) { view, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            val top = if (model.settings.fullscreen) 0 else bars.top
            view.setPadding(bars.left, top, bars.right, bars.bottom)
            insets
        }
        setContentView(root)
        root.addOnLayoutChangeListener { view, _, _, _, _, _, _, _, _ ->
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                val center = view.height / 2
                // Reserve the drawer's drag handle from Android's edge Back gesture.
                view.systemGestureExclusionRects = listOf(android.graphics.Rect(0, center - dp(100), dp(24), center + dp(100)))
            }
        }
        savedInstanceState?.getBundle("scrollPositions")?.let { saved -> saved.keySet().forEach { positions[it] = saved.getInt(it) } }
        gestures = GestureDetector(this, object : GestureDetector.SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent) = true
            override fun onDoubleTap(e: MotionEvent): Boolean {
                val state = model.state.value
                if (state.screen != Screen.MASS || state.resourceId?.startsWith("lp") == true || state.drawerOpen || state.dialog != null || state.loading) return false
                val contentScroll = scroll ?: return false
                val location = IntArray(2)
                contentScroll.getLocationOnScreen(location)
                if (e.rawY !in location[1].toFloat()..(location[1] + contentScroll.height).toFloat()) return false
                fun interactiveAt(view: View): Boolean {
                    val origin = IntArray(2)
                    view.getLocationOnScreen(origin)
                    if (view.visibility != View.VISIBLE || e.rawX < origin[0] || e.rawX > origin[0] + view.width || e.rawY < origin[1] || e.rawY > origin[1] + view.height) return false
                    if (view is ViewGroup && (0 until view.childCount).any { interactiveAt(view.getChildAt(it)) }) return true
                    return view is Button || view.hasOnClickListeners()
                }
                if (interactiveAt(column)) return false
                model.toggleFullscreen()
                return true
            }
            override fun onFling(e1: MotionEvent?, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
                if (e1 == null) return false
                val dx = e2.x - e1.x
                if (kotlin.math.abs(dx) < dp(72) || kotlin.math.abs(dx) < kotlin.math.abs(e2.y - e1.y) * 2) return false
                val state = model.state.value
                when {
                    state.drawerOpen -> model.drawer(dx > 0)
                    state.screen == Screen.CALENDAR && !state.loading && e1.x >= dp(24) -> model.moveMonth(if (dx > 0) -1 else 1)
                    dx > 0 && e1.x < dp(24) -> model.drawer(true)
                    else -> return false
                }
                return true
            }
        })
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (!model.back()) { isEnabled = false; onBackPressedDispatcher.onBackPressed() }
            }
        })
        model.start(savedInstanceState, false)
        lifecycleScope.launch { repeatOnLifecycle(Lifecycle.State.STARTED) { model.state.collect(::render) } }
    }

    override fun onResume() {
        super.onResume()
        if (::model.isInitialized) model.resume()
    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        if (::gestures.isInitialized && gestures.onTouchEvent(event) && event.action == MotionEvent.ACTION_UP) {
            val cancel = MotionEvent.obtain(event).apply { action = MotionEvent.ACTION_CANCEL }
            super.dispatchTouchEvent(cancel); cancel.recycle()
            return true
        }
        return super.dispatchTouchEvent(event)
    }

    private fun render(state: AppUiState) {
        if (shownDialog !== state.dialog) {
            dialog?.dismiss(); shownDialog = state.dialog
            state.dialog?.let(::showChoice)
        }
        val page = state.copy(dialog = null)
        if (state.loading && rendered != null || rendered == page) return
        val oldPageKey = pageKey
        val previousScreen = rendered?.screen
        val textAnchor = if (rendered?.settings?.fontSize != state.settings.fontSize && ::column.isInitialized && scroll != null) {
            val y = scroll!!.scrollY
            val index = (0 until column.childCount).firstOrNull { column.getChildAt(it).bottom > y }
            index?.let {
                val child = column.getChildAt(it)
                val offset = (y - child.top).coerceAtLeast(0)
                val textChild = child as? TextView
                val layout = textChild?.layout
                if (layout != null) {
                    val line = layout.getLineForVertical((offset - textChild!!.totalPaddingTop).coerceAtLeast(0))
                    Triple(it, layout.getLineStart(line), offset - textChild!!.totalPaddingTop - layout.getLineTop(line))
                } else Triple(it, -1, offset)
            }
        } else null
        if (textAnchor != null && oldPageKey != null) pendingTextAnchor = oldPageKey to textAnchor
        if (scroll?.isLaidOut == true) pageKey?.let { positions[it] = scroll?.scrollY ?: 0 }
        drawerScroll?.let { drawerPosition = it.scrollY }
        if (!state.drawerOpen) drawerPosition = 0
        drawerScroll = null
        rendered = page
        val mass = state.screen == Screen.MASS && (state.resourceId == null || state.resourceId?.startsWith("tr") == true)
        root.keepScreenOn = mass
        val insets = WindowCompat.getInsetsController(window, root)
        // Legacy fullscreen hides the status bar and keeps Android navigation available.
        insets.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        insets.show(WindowInsetsCompat.Type.navigationBars())
        if (state.settings.fullscreen) insets.hide(WindowInsetsCompat.Type.statusBars()) else insets.show(WindowInsetsCompat.Type.statusBars())
        ViewCompat.requestApplyInsets(root)
        insets.isAppearanceLightStatusBars = false
        insets.isAppearanceLightNavigationBars = false
        updateSystemBarColors()
        root.removeAllViews()
        root.setBackgroundColor(background())
        val pageColumn = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            importantForAccessibility = if (state.drawerOpen) View.IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS else View.IMPORTANT_FOR_ACCESSIBILITY_AUTO
        }
        root.addView(pageColumn, FrameLayout.LayoutParams(-1, -1))
        val toolbar = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL; minimumHeight = dp(56); setBackgroundColor(style.chrome) }
        toolbar.addView(ImageButton(this).apply {
            setImageResource(R.drawable.ic_menu); background = style.touch(style.chrome)
            imageTintList = android.content.res.ColorStateList.valueOf(style.chromeInk)
            setPadding(dp(16), dp(9), dp(16), dp(9))
            contentDescription = "Otvoriť menu"; setOnClickListener { model.drawer(true) }
        }, LinearLayout.LayoutParams(dp(56), dp(48)))
        toolbar.addView(text(screenTitle(state), if (state.screen == Screen.MASS) 17f else 24f, bold = true).apply {
            setTextColor(style.chromeInk); gravity = Gravity.CENTER_VERTICAL
            maxLines = if (state.settings.fontSize >= 22) Int.MAX_VALUE else 2
            ellipsize = if (state.settings.fontSize >= 22) null else android.text.TextUtils.TruncateAt.END
            setPadding(0, dp(8), dp(8), dp(8))
        }, LinearLayout.LayoutParams(0, -2, 1f))
        if (mass && !state.massOptionsOpen) toolbar.addView(chevron(false, "Zobraziť možnosti omše", model::toggleMassOptions), LinearLayout.LayoutParams(dp(48), dp(48)))
        pageColumn.addView(toolbar, LinearLayout.LayoutParams(-1, -2))
        if (mass) massBar(pageColumn, state)
        if (state.languageMode) readerSwitchBar(pageColumn, state)
        column = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), dp(12), dp(20), dp(28))
        }
        scroll = ScrollView(this).apply { isFillViewport = true; isVerticalScrollBarEnabled = false; addView(column) }
        pageColumn.addView(scroll, LinearLayout.LayoutParams(-1, 0, 1f))
        calendarToday = null
        if (state.loading) {
            column.addView(ProgressBar(this).apply { indeterminateTintList = android.content.res.ColorStateList.valueOf(style.accent) },
                LinearLayout.LayoutParams(dp(32), dp(32)).apply { gravity = Gravity.CENTER; topMargin = dp(40) })
            column.addView(text("Načítava sa…", 14f).apply { gravity = Gravity.CENTER; setPadding(0, dp(16), 0, 0) })
        }
        else if (state.error != null) {
            column.addView(text(state.error))
            row(column, "Skúsiť znova", action = model::retry)
        } else when (state.screen) {
            Screen.HOME, Screen.CALENDAR -> calendar(state)
            Screen.SPECIAL_MASSES, Screen.BLESSINGS -> {
                entries(column, state.entries) { entry -> openEntry(state.screen, entry, false) }
            }
            Screen.LANGUAGES -> column.addView(text("Najprv vyberte jazyk pomocou šípky vedľa položky Jazyk. Potom vyberte omšu pomocou šípky vedľa položky Omša. Medzi textom omše a odpoveďami v zvolenom jazyku prepínajte tlačidlami Omša a Jazyk.").apply { setPadding(0, dp(12), 0, dp(12)) })
            Screen.MASS -> {
                renderer().append(column, state.blocks, state.controls.filter { it.title !in topControls })
            }
        }
        if (!mass && !state.languageMode) bottomNavigation(pageColumn, state)
        pageKey = "${state.screen}/${if (state.screen == Screen.CALENDAR) state.calendarMonth else state.selectedDate}/${state.resourceId ?: state.title}"
        val position = positions[pageKey] ?: 0
        val contentScroll = scroll
        val contentColumn = column
        val currentPageKey = pageKey
        val todayView = calendarToday.takeIf {
            state.screen == Screen.CALENDAR && previousScreen != Screen.CALENDAR && previousScreen != Screen.MASS
        }
        contentScroll?.doOnLayout {
            if (scroll !== contentScroll || pageKey != currentPageKey) return@doOnLayout
            val anchor = pendingTextAnchor?.takeIf { it.first == currentPageKey }?.second
            val child = anchor?.let { contentColumn.getChildAt(it.first) }
            val textChild = child as? TextView
            val layout = textChild?.layout
            val restored = if (child != null) {
                val offset = if (layout != null && anchor.second >= 0) {
                    val line = layout.getLineForOffset(anchor.second.coerceAtMost(layout.text.length))
                    textChild!!.totalPaddingTop + layout.getLineTop(line) + anchor.third
                } else anchor.third.coerceAtMost(child.height)
                child.top + offset
            } else todayView?.top ?: position
            contentScroll.scrollTo(0, restored)
            contentScroll.post {
                if (scroll === contentScroll && pageKey == currentPageKey) {
                    contentScroll.scrollTo(0, restored)
                    currentPageKey?.let { positions[it] = contentScroll.scrollY }
                }
            }
            if (pendingTextAnchor?.first == currentPageKey) pendingTextAnchor = null
        }
        if (state.drawerOpen) showDrawer(state)
        if (!state.loading && state.error == null && !startupReported) {
            startupReported = true
            pageColumn.post {
                reportFullyDrawn()
                Log.i("MissaStartup", "First content ready in ${SystemClock.uptimeMillis() - launchStartedAt} ms")
            }
        }
    }

    private val topControls = setOf("Vybrať formulár", "Eucharistická modlitba", "Prefácia", "Vybrať slávenie alebo omšu", "Ďalšie možnosti omše")

    @Suppress("DEPRECATION")
    private fun updateSystemBarColors() {
        // Older Android versions color the windows; edge-to-edge versions use the root's inset backgrounds.
        window.statusBarColor = style.chrome
        window.navigationBarColor = style.chrome
        if (android.os.Build.VERSION.SDK_INT >= 28) window.navigationBarDividerColor = style.chrome
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            window.isStatusBarContrastEnforced = false
            window.isNavigationBarContrastEnforced = false
        }
        root.invalidate()
    }

    private fun chevron(expanded: Boolean, description: String, action: () -> Unit) = ImageButton(this).apply {
        setImageResource(if (expanded) R.drawable.expand_less else R.drawable.expand_more)
        background = style.touch(style.chrome, 14)
        imageTintList = android.content.res.ColorStateList.valueOf(style.chromeInk)
        setPadding(dp(12), dp(12), dp(12), dp(12))
        contentDescription = description
        isEnabled = !model.state.value.loading
        setOnClickListener { action() }
    }

    private fun monthArrow(previous: Boolean): ImageButton {
        val button = chevron(false, if (previous) "Predchádzajúci mesiac" else "Nasledujúci mesiac") { model.moveMonth(if (previous) -1 else 1) }
        button.background = style.touch(style.canvas, 14)
        button.imageTintList = android.content.res.ColorStateList.valueOf(style.accent)
        val icon = button.drawable
        button.setImageDrawable(android.graphics.drawable.RotateDrawable().apply {
            drawable = icon; fromDegrees = if (previous) 90f else 270f; toDegrees = fromDegrees; level = 10000
        })
        return button
    }

    private fun massBar(parent: LinearLayout, state: AppUiState) {
        if (!state.massOptionsOpen) return
        val buttons = listOf("Vybrať formulár" to "Formulár", "Eucharistická modlitba" to "Eucharistická modlitba", "Prefácia" to "Prefácia").mapNotNull { (key, label) ->
            val control = state.controls.firstOrNull { it.title == key } ?: return@mapNotNull null
            Button(this).apply {
                text = label; textSize = state.settings.fontSize.toFloat(); isAllCaps = false
                stateListAnimator = null; elevation = 0f
                typeface = face(true); setTextColor(style.chromeInk); background = style.touch(style.chrome, 12)
                setPadding(dp(4), dp(6), dp(4), dp(6)); minimumWidth = 0; minWidth = 0; minimumHeight = dp(48)
                contentDescription = label; setOnClickListener { control.select() }
            }
        }
        val widths = buttons.map { button ->
            button.text.toString().split(' ').maxOf { button.paint.measureText(it) } + dp(8)
        }
        val availableWidth = (root.width.takeIf { it > 0 } ?: resources.displayMetrics.widthPixels) - dp(64) - dp(8) * buttons.size
        val stacked = state.settings.fontSize >= 22 || widths.sum() > availableWidth
        val row = LinearLayout(this).apply {
            setBackgroundColor(style.chrome); setPadding(dp(8), 0, dp(8), dp(8))
            isBaselineAligned = false
            gravity = Gravity.END or if (stacked) Gravity.TOP else Gravity.CENTER_VERTICAL
        }
        val options = LinearLayout(this).apply {
            orientation = if (stacked) LinearLayout.VERTICAL else LinearLayout.HORIZONTAL
            isBaselineAligned = false
        }
        buttons.forEachIndexed { index, button ->
            options.addView(button, LinearLayout.LayoutParams(if (stacked) -1 else 0, -2, if (stacked) 0f else widths[index]).apply {
                marginStart = dp(4); marginEnd = dp(4)
            })
        }
        row.addView(options, LinearLayout.LayoutParams(0, -2, 1f))
        row.addView(chevron(true, "Skryť možnosti omše", model::toggleMassOptions), LinearLayout.LayoutParams(dp(48), dp(48)))
        parent.addView(row, LinearLayout.LayoutParams(-1, -2))
    }

    private fun readerSwitchBar(parent: LinearLayout, state: AppUiState) {
        val mass = state.screen == Screen.MASS && (state.resourceId == null || state.resourceId?.startsWith("tr") == true)
        val language = state.screen == Screen.MASS && state.resourceId?.startsWith("lp") == true
        val bar = LinearLayout(this).apply { setBackgroundColor(style.chrome); gravity = Gravity.CENTER_VERTICAL; setPadding(0, dp(8), 0, dp(8)) }
        fun tab(label: String, description: String, selected: Boolean, action: () -> Unit) {
            bar.addView(Button(this).apply {
                text = label; textSize = state.settings.fontSize.toFloat(); isAllCaps = false; minimumHeight = dp(48)
                stateListAnimator = null; elevation = 0f
                typeface = face(selected); setTextColor(if (selected) style.accent else style.chromeMuted)
                background = style.touch(if (selected) style.tint else style.chrome, 14)
                setPadding(dp(8), 0, dp(8), 0); minimumWidth = 0; minWidth = 0
                isSingleLine = false
                contentDescription = description; isSelected = selected; isEnabled = !state.loading
                setOnClickListener { action() }
            }, LinearLayout.LayoutParams(0, -2, 1f))
        }
        tab("Omša", "Späť na vybranú omšu", mass) { if (mass) model.chooseMass() else model.showMass() }
        bar.addView(chevron(false, "Vybrať slávenie alebo omšu", model::chooseMass), LinearLayout.LayoutParams(dp(48), dp(48)))
        val label = model.menuEntries(Screen.LANGUAGES).firstOrNull { it.id == state.languageId }?.title ?: "Jazyk"
        tab(label, "Zobraziť odpovede v cudzom jazyku", language, model::showLanguage)
        bar.addView(chevron(false, "Zmeniť jazyk odpovedí", model::chooseLanguage), LinearLayout.LayoutParams(dp(48), dp(48)))
        parent.addView(bar, LinearLayout.LayoutParams(-1, -2))
    }

    private fun calendar(state: AppUiState) {
        val date = if (state.screen == Screen.CALENDAR) state.calendarMonth else state.selectedDate
        date?.let {
            if (state.screen == Screen.CALENDAR) column.addView(text("LITURGICKÝ KALENDÁR", 12f, true).apply {
                setTextColor(style.accent); letterSpacing = 0.12f; setPadding(0, dp(12), 0, dp(8))
            })
            val dateRow = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL }
            if (state.screen == Screen.HOME) {
                dateRow.addView(text(dateLabel(it, "EEEE").uppercase(locale), 12f, true).apply {
                    setTextColor(style.accent); letterSpacing = 0.12f; setPadding(0, dp(12), 0, dp(8))
                }, LinearLayout.LayoutParams(0, -2, 1f))
                dateRow.addView(text("${it.dayOfMonth}. ${listOf("januára", "februára", "marca", "apríla", "mája", "júna", "júla", "augusta", "septembra", "októbra", "novembra", "decembra")[it.month - 1]}", 12f, true).apply {
                    setTextColor(foreground()); gravity = Gravity.END; setPadding(0, dp(12), 0, dp(8))
                }, LinearLayout.LayoutParams(-2, -2))
            } else {
                dateRow.addView(text(dateLabel(it, "LLLL yyyy").replaceFirstChar { c -> c.titlecase(locale) }, 24f, true), LinearLayout.LayoutParams(0, -2, 1f))
                dateRow.addView(monthArrow(true), LinearLayout.LayoutParams(dp(48), dp(48)))
                dateRow.addView(monthArrow(false), LinearLayout.LayoutParams(dp(48), dp(48)))
            }
            column.addView(dateRow, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(16) })
        }
        state.days.forEach { day ->
            if (state.screen == Screen.CALENDAR) column.addView(text("${day.date.dayOfMonth}. ${dateLabel(day.date, "EEEE").replaceFirstChar { it.titlecase(locale) }}", 14f, true).apply {
                setTextColor(style.muted); setPadding(0, dp(20), 0, dp(12))
                val today = LocalDate.now()
                if (day.date.year == today.year && day.date.month == today.monthValue && day.date.dayOfMonth == today.dayOfMonth) calendarToday = this
            })
            day.celebrations.forEach { celebration ->
                val color = when (celebration.color) {
                    LiturgicalColor.RED -> Color.rgb(214, 40, 40); LiturgicalColor.GREEN -> Color.rgb(22, 128, 61)
                    LiturgicalColor.VIOLET -> Color.rgb(120, 54, 164); LiturgicalColor.ROSE -> Color.rgb(233, 143, 177)
                    LiturgicalColor.BLACK -> Color.BLACK; LiturgicalColor.WHITE -> Color.WHITE
                }
                val item = LinearLayout(this).apply {
                    orientation = LinearLayout.HORIZONTAL; background = style.touch(style.surface, 14)
                    setPadding(dp(14), dp(12), dp(14), dp(12)); minimumHeight = dp(72)
                    contentDescription = "${dateLabel(day.date, "d. M. yyyy")}: ${celebration.title}"
                    setOnClickListener { model.openCelebration(day.date, celebration.id) }
                }
                item.addView(View(this).apply {
                    background = style.shape(color, 3).apply {
                        if (celebration.color == LiturgicalColor.WHITE) setStroke(dp(1), Color.rgb(165, 158, 137))
                    }
                }, LinearLayout.LayoutParams(dp(6), -1))
                val body = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(12), 0, 0, 0) }
                body.addView(text(celebration.title, 16f, true).apply { setLineSpacing(dp(3).toFloat(), 1f) })
                body.addView(text(listOf(celebration.detail, colorName(celebration.color)).filter { it.isNotBlank() }.joinToString("  ·  "), 13f).apply {
                    setTextColor(style.muted); setPadding(0, dp(4), 0, 0)
                })
                item.addView(body, LinearLayout.LayoutParams(0, -2, 1f))
                column.addView(item, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(8) })
            }
        }
    }

    private fun colorName(color: LiturgicalColor): String = when (color) {
        LiturgicalColor.RED -> "červená"; LiturgicalColor.GREEN -> "zelená"; LiturgicalColor.VIOLET -> "fialová"
        LiturgicalColor.ROSE -> "ružová"; LiturgicalColor.BLACK -> "čierna"; LiturgicalColor.WHITE -> "biela"
    }

    private fun bottomNavigation(parent: LinearLayout, state: AppUiState) {
        val icons = listOf(R.drawable.ic_today, R.drawable.ic_calendar, R.drawable.ic_special_mass, R.drawable.ic_blessing, R.drawable.ic_language)
        val labels = listOf("Dnes", "Kalendár", "Omše", "Požehnania", "Jazyky")
        val bottom = LinearLayout(this).apply { setBackgroundColor(style.chrome); minimumHeight = dp(72); setPadding(dp(6), dp(8), dp(6), dp(8)) }
        AppDestination.entries.forEachIndexed { index, destination ->
            val selected = destination.screen == state.screen
            val tab = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL; gravity = Gravity.CENTER; minimumHeight = dp(56)
                background = style.touch(style.chrome, 16); contentDescription = destination.title
                isSelected = selected; isEnabled = !state.loading
                setOnClickListener { if (state.screen != destination.screen) model.destination(destination) }
            }
            tab.addView(ImageView(this).apply {
                setImageResource(icons[index]); imageTintList = android.content.res.ColorStateList.valueOf(if (selected) style.accent else style.chromeMuted)
                background = style.shape(if (selected) style.tint else style.chrome, 16)
                scaleType = ImageView.ScaleType.CENTER_INSIDE; setPadding(dp(18), dp(4), dp(18), dp(4))
                importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            }, LinearLayout.LayoutParams(dp(60), dp(30)))
            tab.addView(text(labels[index], 11f, selected).apply { gravity = Gravity.CENTER; setTextColor(if (selected) style.chromeInk else style.chromeMuted); setPadding(0, dp(4), 0, 0) })
            bottom.addView(tab, LinearLayout.LayoutParams(0, -2, 1f))
        }
        parent.addView(bottom, LinearLayout.LayoutParams(-1, -2))
    }

    private fun entries(parent: LinearLayout, values: List<ContentEntry>, selected: (ContentEntry) -> Unit) {
        values.forEach { entry ->
            if (entry.heading) parent.addView(text(entry.title).apply {
                setTextColor(accent()); gravity = Gravity.CENTER; setPadding(0, 16, 0, 16)
            }, LinearLayout.LayoutParams(-1, -2))
            else row(parent, entry.title, if (model.state.value.screen == Screen.BLESSINGS) 8 else 16) { selected(entry) }
        }
    }

    private fun openEntry(screen: Screen, entry: ContentEntry, menu: Boolean) {
        if (screen == Screen.SPECIAL_MASSES && !model.entryAvailable(entry.id)) {
            @Suppress("DEPRECATION")
            val warning = Toast(this).apply {
                duration = Toast.LENGTH_LONG
                setGravity(Gravity.CENTER_VERTICAL, 0, 0)
                view = layoutInflater.inflate(R.layout.toast_layout, null)
            }
            warning.show()
        } else {
            if (menu) model.openMenuEntry(screen, entry.id) else model.openEntry(entry.id)
        }
    }

    private fun showDrawer(state: AppUiState) {
        root.addView(View(this).apply { setBackgroundColor(0x99000000.toInt()); setOnClickListener { model.drawer(false) }; contentDescription = "Zavrieť menu" },
            FrameLayout.LayoutParams(-1, -1).apply { topMargin = -root.paddingTop; bottomMargin = -root.paddingBottom })
        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(style.surface)
            isClickable = true
        }
        val header = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL; setBackgroundColor(style.chrome); setPadding(dp(20), dp(36), dp(20), dp(20)) }
        header.addView(ImageView(this).apply { setImageResource(R.drawable.missa_logo); contentDescription = "Logo" }, LinearLayout.LayoutParams(dp(48), dp(48)))
        val brand = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(16), 0, 0, 0) }
        brand.addView(text("Missa", 26f, true).apply { setTextColor(style.chromeInk) })
        brand.addView(text("Elektronický misál", 12f).apply { setTextColor(style.chromeMuted) })
        header.addView(brand)
        panel.addView(header)
        panel.addView(Space(this), LinearLayout.LayoutParams(-1, dp(8)))
        val contentMenu = state.screen == Screen.MASS && (state.resourceId == null || state.resourceId.startsWith("tr") || state.resourceId.startsWith("lp"))
        if (contentMenu) listOf(AppDestination.TODAY, AppDestination.SPECIAL_MASSES, AppDestination.CALENDAR, AppDestination.BLESSINGS, AppDestination.LANGUAGES).forEach { destination ->
            row(panel, if (destination == AppDestination.LANGUAGES) "Odpovede v cudzích jazykoch" else destination.title, 0) {
                model.drawer(false)
                val mass = state.screen == Screen.MASS && (state.resourceId == null || state.resourceId.startsWith("tr"))
                if (destination.screen in setOf(Screen.SPECIAL_MASSES, Screen.BLESSINGS, Screen.LANGUAGES) && !mass) menu(destination.screen)
                else if (destination.screen != state.screen) model.destination(destination)
            }.apply { textSize = uiTextSize(15f); typeface = face(); minimumHeight = dp(40); setPadding(dp(16), (textSize * 0.18f).toInt(), dp(16), (textSize * 0.18f).toInt()); (layoutParams as LinearLayout.LayoutParams).bottomMargin = 0; isEnabled = !state.loading }
        }
        if (contentMenu) divider(panel)
        row(panel, "Typ písma", 0) { model.drawer(false); model.chooseFont() }.apply { textSize = uiTextSize(15f); typeface = face(); minimumHeight = dp(40); setPadding(dp(16), (textSize * 0.18f).toInt(), dp(16), (textSize * 0.18f).toInt()); (layoutParams as LinearLayout.LayoutParams).bottomMargin = 0 }
        toggle(panel, "Celá obrazovka", state.settings.fullscreen) { model.applySettings(model.settings.copy(fullscreen = it)) }
        toggle(panel, "Nočný režim", state.settings.nightMode) { model.applySettings(model.settings.copy(nightMode = it)) }
        toggle(panel, "Tučné písmo", state.settings.boldText) { model.applySettings(model.settings.copy(boldText = it)) }
        toggle(panel, "Zvončeky", state.settings.bells) { model.applySettings(model.settings.copy(bells = it)) }
        toggle(panel, "Tiché modlitby kňaza", state.settings.quietPrayers) { model.applySettings(model.settings.copy(quietPrayers = it)) }
        val zoom = LinearLayout(this).apply { gravity = Gravity.CENTER_VERTICAL; setPadding(dp(16), 0, dp(16), 0) }
        zoom.addView(text("Veľkosť", 15f).apply { gravity = Gravity.CENTER_VERTICAL; minimumHeight = dp(40) }, LinearLayout.LayoutParams(0, -2, 1f))
        listOf(-2 to R.drawable.minus, 2 to R.drawable.plus).forEach { (step, icon) ->
            zoom.addView(ImageButton(this).apply {
                setImageResource(icon); scaleType = ImageView.ScaleType.CENTER
                setBackgroundColor(android.graphics.Color.TRANSPARENT); imageTintList = android.content.res.ColorStateList.valueOf(style.accent)
                contentDescription = if (step < 0) "Zmenšiť písmo" else "Zväčšiť písmo"
                setOnClickListener { model.applySettings(model.settings.copy(fontSize = model.settings.fontSize + step)) }
            }, LinearLayout.LayoutParams(dp(48), dp(48)).apply { if (step < 0) marginEnd = dp(28) })
        }
        panel.addView(zoom)
        divider(panel)
        row(panel, "O aplikácii", 0) { model.drawer(false); about() }.apply { textSize = uiTextSize(15f); typeface = face(); minimumHeight = dp(40); setPadding(dp(16), (textSize * 0.18f).toInt(), dp(16), (textSize * 0.18f).toInt()); (layoutParams as LinearLayout.LayoutParams).bottomMargin = 0 }
        val drawer = ScrollView(this).apply { addView(panel); elevation = dp(16).toFloat(); setBackgroundColor(style.surface) }
        drawerScroll = drawer
        root.addView(drawer,
            FrameLayout.LayoutParams(minOf(dp(320), resources.displayMetrics.widthPixels - dp(56)), -1, Gravity.START).apply { topMargin = -root.paddingTop; bottomMargin = -root.paddingBottom })
        drawer.post { drawer.scrollTo(0, drawerPosition) }
    }

    private fun menu(screen: Screen) {
        val content = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(24), 0, dp(24), dp(16)) }
        lateinit var popup: Dialog
        entries(content, model.menuEntries(screen)) { entry ->
            if (screen != Screen.SPECIAL_MASSES || model.entryAvailable(entry.id)) popup.dismiss()
            openEntry(screen, entry, true)
        }
        popup = missaDialog(this, when (screen) {
            Screen.SPECIAL_MASSES -> "Špeciálne omše"; Screen.LANGUAGES -> "Odpovede v cudzích jazykoch"; else -> "Požehnania"
        }, model.settings, content)
        popups.add(popup)
    }

    private fun showChoice(choice: ChoiceDialogState) {
        var selected = choice.values.indexOfFirst { it.first == choice.selectedId }.coerceAtLeast(0)
        val builder = AlertDialog.Builder(this).setCustomTitle(text(choice.title, 20f, true).apply {
            setTextColor(accent()); setPadding(dp(24), dp(20), dp(24), dp(12))
        })
        val labels = choice.values.map { it.second }.toTypedArray()
        val adapter = object : ArrayAdapter<String>(this, if (choice.confirm) android.R.layout.simple_list_item_single_choice else android.R.layout.simple_list_item_1, labels) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View = super.getView(position, convertView, parent).apply {
                (this as TextView).setTextColor(foreground()); textSize = model.settings.fontSize.toFloat(); typeface = face(); minimumHeight = dp(56)
                layoutParams = layoutParams.apply { height = ViewGroup.LayoutParams.WRAP_CONTENT }
                includeFontPadding = true; isSingleLine = false; gravity = Gravity.CENTER_VERTICAL
                if (this is CheckedTextView) checkMarkTintList = android.content.res.ColorStateList.valueOf(style.accent)
                if (choice.title == "Typ písma") typeface = Typeface.create(
                    if (choice.values[position].first == "serif") "serif" else "sans-serif", Typeface.NORMAL)
                setPadding(dp(24), dp(16), dp(24), dp(16))
            }
        }
        if (choice.confirm) {
            builder.setSingleChoiceItems(adapter, selected) { _, index -> selected = index }
                .setPositiveButton("OK") { _, _ -> choice.values.getOrNull(selected)?.let { choice.select(it.first) } }
        } else builder.setAdapter(adapter) { _, index -> choice.select(choice.values[index].first) }
        dialog = builder.setNegativeButton("Zrušiť") { _, _ -> model.dismissDialog() }
            .setOnCancelListener { model.dismissDialog() }.show().apply {
                window?.setBackgroundDrawable(style.shape(style.surface, 24))
                listView.setBackgroundColor(style.surface)
                listView.divider = null
                getButton(AlertDialog.BUTTON_POSITIVE)?.setTextColor(accent())
                getButton(AlertDialog.BUTTON_NEGATIVE)?.setTextColor(accent())
                listOf(AlertDialog.BUTTON_POSITIVE, AlertDialog.BUTTON_NEGATIVE).forEach { button ->
                    getButton(button)?.applyMissaTextSize(uiTextSize(14f))
                }
                window?.setLayout(minOf(dp(560), resources.displayMetrics.widthPixels - dp(32)), -2)
                window?.setDimAmount(0.42f)
            }
    }

    private fun about() {
        val content = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(dp(24), 0, dp(24), dp(16)) }
        listOf(
            "Aplikácia nenahrádza platne vydané a schválené liturgické texty.\nJe určená iba pre prípravu, nie je určená na slávenie svätej omše.",
            "Texty sú prevzaté z Rímskeho misála, Výňatku z Rímskeho misála, Lekcionárov a Spoločných modlitieb veriacich.\nText © Konferencia biskupov slovenska (KBS).\nTexty sú publikované s vedomím KBS ako pracovná verzia.",
            "Prosím, podeľte sa s nami o svoje skúsenosti a postrehy na adrese:\nmissa.svk@gmail.com.",
            "© 2013-${java.time.Year.now().value} Rita & Ing. Páter",
        ).forEach { content.addView(text(it).apply { setPadding(0, 16, 0, 16); android.text.util.Linkify.addLinks(this, android.text.util.Linkify.EMAIL_ADDRESSES) }) }
        popups.add(AlertDialog.Builder(this)
            .setCustomTitle(text("O aplikácii", 20f, true).apply {
                setTextColor(accent()); setPadding(dp(24), dp(20), dp(24), dp(12))
            })
            .setView(ScrollView(this).apply { addView(content) })
            .setNegativeButton("Zrušiť", null)
            .show().apply {
                window?.setBackgroundDrawable(style.shape(style.surface, 24))
                getButton(AlertDialog.BUTTON_NEGATIVE)?.apply {
                    setTextColor(accent()); applyMissaTextSize(uiTextSize(14f))
                }
                window?.setLayout(minOf(dp(560), resources.displayMetrics.widthPixels - dp(32)), -2)
                window?.setDimAmount(0.42f)
            })
    }

    private fun toggle(parent: LinearLayout, title: String, checked: Boolean, changed: (Boolean) -> Unit) {
        parent.addView(Switch(this).apply {
            text = title; textSize = uiTextSize(15f); typeface = face(); setTextColor(foreground()); minimumHeight = dp(40)
            setPadding(dp(16), (textSize * 0.18f).toInt(), dp(16), (textSize * 0.18f).toInt()); isChecked = checked
            thumbTintList = android.content.res.ColorStateList(arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()), intArrayOf(style.switchOn, style.switchOff))
            trackTintList = android.content.res.ColorStateList(
                arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
                intArrayOf(style.switchOn, style.switchOff),
            )
            setOnCheckedChangeListener { _, value -> changed(value) }
        }, LinearLayout.LayoutParams(-1, -2))
    }

    private fun divider(parent: LinearLayout) {
        parent.addView(View(this).apply { setBackgroundColor(0x22000000) }, LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(8); bottomMargin = dp(8) })
    }
    private fun row(parent: LinearLayout, title: String, padding: Int = 16, action: () -> Unit): TextView = text(title).apply {
        gravity = Gravity.CENTER_VERTICAL; minimumHeight = dp(56)
        background = style.touch(style.surface, 14); setPadding(dp(16), dp(maxOf(padding, 12)), dp(16), dp(maxOf(padding, 12)))
        val arrow = android.graphics.drawable.RotateDrawable().apply {
            drawable = getDrawable(R.drawable.expand_more)?.mutate()?.apply { setTint(style.muted) }
            fromDegrees = 270f; toDegrees = 270f; level = 10000
            setBounds(0, 0, dp(20), dp(20))
        }
        setCompoundDrawablesRelative(null, null, arrow, null); compoundDrawablePadding = dp(12)
        setOnClickListener { action() }; parent.addView(this, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(6) })
    }
    private fun uiTextSize(baseSizeSp: Float) = scaledTextSize(baseSizeSp, model.settings.fontSize.toFloat())
    private fun text(value: String, size: Float = 16f, bold: Boolean = false) = TextView(this).apply {
        text = value; textSize = uiTextSize(size); setTextColor(foreground()); typeface = face(bold); setLineSpacing(dp(2).toFloat(), 1f)
    }
    private fun face(bold: Boolean = false) = Typeface.create(if (model.settings.serif) "serif" else "sans-serif",
        if (bold || model.settings.boldText) Typeface.BOLD else Typeface.NORMAL)
    private fun screenTitle(state: AppUiState): String = when (state.screen) {
        Screen.HOME, Screen.CALENDAR -> "Missa"
        Screen.MASS -> if (state.resourceId?.startsWith("lp") == true) model.menuEntries(Screen.LANGUAGES).firstOrNull { it.id == state.resourceId }?.title ?: state.title else state.title
        Screen.LANGUAGES -> "Odpovede v cudzích jazykoch"
        Screen.BLESSINGS -> "Požehnania"
        else -> "Špeciálne omše"
    }
    private fun renderer() = LiturgyBlockView(this, model::resource, model::part, ::ring, model.settings.bells,
        model.settings.fontSize.toFloat(), model.settings.nightMode, model.settings.boldText, model.settings.serif)
    private fun dateLabel(date: LiturgicalDate, pattern: String) = LocalDate.of(date.year, date.month, date.dayOfMonth).format(DateTimeFormatter.ofPattern(pattern, locale))
    private fun ring() {
        bellPlayer?.release()
        bellPlayer = android.media.MediaPlayer.create(this, R.raw.zvoncek)?.apply { setOnCompletionListener { it.release(); bellPlayer = null }; start() }
    }
    private fun background() = style.canvas
    private fun foreground() = style.ink
    private fun accent() = style.accent
    private fun dp(value: Int) = (value * resources.displayMetrics.density).toInt()
    override fun onSaveInstanceState(outState: Bundle) {
        model.save(outState)
        pageKey?.let { positions[it] = scroll?.scrollY ?: 0 }
        outState.putBundle("scrollPositions", Bundle().apply { positions.forEach { (key, value) -> putInt(key, value) } })
        super.onSaveInstanceState(outState)
    }
    override fun onDestroy() { dialog?.dismiss(); popups.forEach { it.dismiss() }; bellPlayer?.release(); super.onDestroy() }
}
