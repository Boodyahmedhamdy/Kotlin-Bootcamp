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


    separate("filter not")
    println(list.filterNot { it.startsWith('h') })

    
    separate("filter to")
    // list of names will attend event
    var approvedList: MutableList<String> = mutableListOf("koky", "koka")

    // add elements from filter to the passed list
    list.filterTo(approvedList, {it.contains('h')})
    println(approvedList)

    separate("filter not to")
    var notApprovedList: MutableList<String> = mutableListOf<String>("koky", "koka")
    list.filterNotTo(notApprovedList, {it.contains('h')})
    println(notApprovedList)

}

fun isAdult(age: Int): Boolean {
    return age >= 18
}

fun separate(title: String = "") {
    println("------------$title------------")
}