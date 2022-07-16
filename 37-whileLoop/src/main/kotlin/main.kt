fun main() {

    separate("simple while loop")
    var i = 0
    while(i < 10) {
        println(i++) // will print even only
        i++
    }


}



fun separate(title: String = "") {
    println("------------------$title----------------")
}