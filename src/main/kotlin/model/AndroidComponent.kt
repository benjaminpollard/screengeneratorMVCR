package model

enum class AndroidComponent(val displayName: String) {
    ACTIVITY("Activity"),
    FRAGMENT("Fragment");

    override fun toString() = displayName
}