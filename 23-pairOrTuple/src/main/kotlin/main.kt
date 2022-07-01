fun main() {
    separate("usign pair")
    var pair = Pair(22, 4)
    pair = 22 to 4 // another way to create pair
    println(pair)
    println(pair.first)
    println(pair.second)

    separate("using triple")
    var triple: Triple<Int, Int, String> = Triple(22, 55, "boody")
    


}
fun separate(title: String = "") {
    println("----------------$title--------------------")
}