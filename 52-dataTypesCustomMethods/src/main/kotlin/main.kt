fun main() {

    var name = "boody"
    println(name.length)
    println(name.doubleLength())


}

fun String.doubleLength(): Int {
    return this.length * 2
}