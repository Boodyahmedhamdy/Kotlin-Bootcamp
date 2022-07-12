import kotlin.reflect.typeOf

fun main() {
    var list1: List<List<String>> = listOf(
        listOf("ahmed", "hamdy", "hassan"),
        listOf("mohamed", "saad", "mohamed"),
        listOf("esmail", "mohamed", "kotb")
    )

    // flatmap will flatten the generated list
    separate("using flatMap")
    var usingFlatMap = list1.flatMap { it }
    println(usingFlatMap)
    println(usingFlatMap[0]::class)

    // return it as normal
    separate("using normal map")
    var usingNormalMap = list1.map { it }
    println(usingNormalMap)
    println(usingNormalMap[0]::class)

}

fun separate(title: String = "") {
    println("---------------$title-----------------")
}

