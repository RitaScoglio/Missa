package sk.missa.ui.components

data class LiturgyAlternative(val title: String, val select: () -> Unit)
data class LiturgyControl(val title: String, val select: () -> Unit, val alternatives: List<LiturgyAlternative> = emptyList())
