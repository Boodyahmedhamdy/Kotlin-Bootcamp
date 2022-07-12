fun main() {
    var list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    separate("normal loopint")
    for (i:Int in list) {
        println(i)
    }

    separate("using until") //end isn't included
    for (i in (0 until 10)) { // () is optional
        println(i)
    }
//    println((0 until 6)::class) range

    separate("using double dots") // includes the end
    for (i in 0..10) {
        println(i)
    }

    separate("using step")
    for (i in 0..10 step 2) {
        println(i)
    }

    separate("using downTo")
    for(i in 10 downTo 0) {
        println(i)
    }

    // not working -- use downTo instead
    separate("using double dots in downTo")
    for (i in 10..0) {
        println(i)
    }

}

fun separate(title: String = "") {
    println("------------------$title----------------")
}