fun main() {
    printPeople("boody", "ahmed", "hamdy")
}

fun printPeople(vararg people: String) {
    people.forEach { println(it) }
}

fun printName(name: String) {
    println("Name: $name")
}
fun printName(name: String, age: Int) {
    println("Name: $name, Age: $age")
}