fun main() {
    val day: Days = Days.SUNDAY
    when (day) {
        Days.FRIDAY -> {
            println("holiday")
        }
        Days.MONDAY -> {
            println("go work")
        }
        // must be provided when returning a value from when block
        else -> {
            println("normal day")
        }
    }


}