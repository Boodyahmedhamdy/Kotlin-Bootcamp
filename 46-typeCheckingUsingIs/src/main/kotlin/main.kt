fun main() {

    // all datatypes are Any even custom classes
    var n: Any = 12
    if(n is String) {
        println("n is a String")
    } else {
        println("n isn't a String")
    }

    if(someFun("hello") is Any) {
        println("it works")
    }


}

fun someFun(data: String): Any {
    return when(data) {
        "1" -> {
            1
        }
        "2" -> "two"
        else -> false
    }
}