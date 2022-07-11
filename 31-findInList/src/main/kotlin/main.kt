fun main() {
    val names: List<String> = listOf("boody", "ahmed", "hamdy", "hassan")
    // if found will return the name
    var myName: String = names.find {it == "boody"} ?: "notFound"
    // if not found will return null

    println(myName)

}