import java.util.*

fun main() {

    dayOfWeek()

}

fun dayOfWeek() {
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var theDay = ""
    theDay = when (day) {
        1 -> "sunday"
        2 -> "monday"
        3 -> "tusday"
        4 -> "wendsday"
        5 -> "thursday"
        6 -> "friday"
        7 -> "saturday"
        else -> "unknown day"
    }

    println(theDay)
}

fun randomDay(): String {
    val weekDays = listOf<String>("sunday", "monday",
                        "tusday", "wendsday",
                        "thursday", "friday",
                        "saturday")
    return weekDays.random()

}