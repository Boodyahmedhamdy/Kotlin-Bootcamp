fun main() {

    // give me sequence from seed with 100 numbers after it
    var list = generateSequence(seed = 1) {it+1}.take(100).toList()
    println(list)
    println(list.average())


//    println(list.filter { it % 3 == 0 } .average())


}

fun separate(title: String = "") {
    println("---------------$title---------------")
}