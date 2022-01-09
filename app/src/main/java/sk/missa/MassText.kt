package sk.missa

class MassText {
    var text: String? = null
    var separateText: List<String> = listOf()
    var appearance: List<String> = listOf()
    var onClickOpen = 0
    var optionalTextIndex = 0
    var isBell = false
    var isDivider = false
    var isSpace = false
    var isSeparateViews = false
    var isHTML = false

    internal constructor(text: String, appearance: String) {
        this.text = checkText(text)
        this.appearance = splitAndHTML(appearance)
    }

    internal constructor(separateText: List<String>, appearance: String) {
        this.separateText = separateText
        this.appearance = splitAndHTML(appearance)
        isSeparateViews = true
    }

    internal constructor(text: String, appearance: String, onClickOpen: Int) {
        this.text = checkText(text)
        this.appearance = splitAndHTML(appearance)
        this.onClickOpen = onClickOpen
    }

    internal constructor(
        text: String,
        appearance: String,
        onClickOpen: Int,
        optionalTextIndex: Int
    ) {
        this.text = checkText(text)
        this.appearance = splitAndHTML(appearance)
        this.onClickOpen = onClickOpen
        this.optionalTextIndex = optionalTextIndex
    }

    private fun checkText(text: String): String? {
        return if (text.equals(""))
            null
        else text
    }

    fun splitAndHTML(appearance: String): List<String> {
        var splittedString = appearance.split("|")
        if (splittedString.contains("html")) {
            splittedString = splittedString.filter { it != "html" }
            this.isHTML = true
        }
        return splittedString
    }

    internal constructor(obj: String) {
        if (obj == "bell") isBell = true else if (obj == "divider") isDivider =
            true else if (obj == "space") isSpace = true
    }

    fun getSeparateTextLength(): Int {
        return separateText.size
    }
}