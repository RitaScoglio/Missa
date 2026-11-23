package sk.missa.data

import android.content.res.AssetManager
import android.app.Application
import android.util.Log
import java.util.WeakHashMap
import sk.missa.calendar.LiturgicalCalendar
import sk.missa.calendar.celebration.DatasetCelebrationCatalog
import sk.missa.data.assets.DatasetAssets
import sk.missa.data.assets.ValidatedDatasetCache
import java.io.File
import sk.missa.liturgy.document.LiturgyDocuments
import sk.missa.liturgy.mass.CalendarMassSelection
import sk.missa.liturgy.mass.MassContentResolver

/** Loads bundled liturgical content once for the application session. Called on the IO dispatcher. */
class LiturgyRepository private constructor(assets: AssetManager, cache: ValidatedDatasetCache?) {
    constructor(assets: AssetManager) : this(assets, null)

    private val startedAt = System.nanoTime()
    private val items = DatasetAssets.read(assets, cache)
    val documents = LiturgyDocuments(items)
    val calendar = LiturgicalCalendar(DatasetCelebrationCatalog.fromItems(items))
    val selector = CalendarMassSelection(items)
    val resolver = MassContentResolver(items)

    init {
        Log.i("MissaStartup", "Liturgical corpus ready in ${(System.nanoTime() - startedAt) / 1_000_000} ms")
    }

    companion object {
        private val sessions = WeakHashMap<AssetManager, LiturgyRepository>()

        /** The corpus and resolvers are immutable; screen choices stay in each ViewModel. */
        @Synchronized
        fun shared(assets: AssetManager): LiturgyRepository = sessions.getOrPut(assets) { LiturgyRepository(assets) }

        @Synchronized
        @Suppress("DEPRECATION")
        fun shared(application: Application): LiturgyRepository = sessions.getOrPut(application.assets) {
            val revision = application.packageManager.getPackageInfo(application.packageName, 0).lastUpdateTime
            val cache = ValidatedDatasetCache(File(application.cacheDir, "liturgy-v1.bin"), revision)
            LiturgyRepository(application.assets, cache)
        }
    }
}
