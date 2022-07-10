fun main() {
    var list = mutableListOf("boody", "ahmed", "hamdy", "hassan", "nasr")

    var filterdList: List<String> = list.filter { it.startsWith('h') }
    separate("filter with one line")
    println(list)
    println(filterdList)


    separate("filter with function")
    val ages: List<Int> = listOf(13, 55, 24, 21, 4, 64)
    val filterdAges = ages.filter {isAdult(it)}
    println(filterdAges)
    

}

fun isAdult(age: Int): Boolean {
    return age >= 18
}

fun separate(title: String = "") {
    println("------------$title------------")
}