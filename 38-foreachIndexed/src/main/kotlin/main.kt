fun main() {
    val list = listOf(1, 3, 5, 7, 9)

    list.forEachIndexed { index, i ->
        println("$index --> $i")
    }
    

}