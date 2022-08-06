fun main() {

    // list
    val list = listOf<Int>(1, 2, 3, 4, 5)
    var mutableList = mutableListOf<String>("boody", "ahmed")

    separate("list")
    println(list)
    println(mutableList)


    // set --> only unique
    val set = setOf<Int>(1, 2, 2, 3, 4, 5, 5, 5)
    var mutableSet = mutableSetOf<String>("boody", "ahmed")

    separate("set")
    println(set)
    println(mutableSet)


    // map --> key to value
    val map: Map<String, Int> = mapOf(
        "one" to 1,
        "two" to 2
    )
    var mutableMap: MutableMap<String, Int> = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3
    )


    separate("map")
    println(map)
    println(mutableMap)



    // sequence --> for high performance
    val sequence = sequenceOf(1, 2, 3, 4, 5)

    // turn list, map into a sequence
    list.asSequence()
    map.asSequence()

    



}

fun separate(title: String = "") {
    println("-------------- $title ------------")
}