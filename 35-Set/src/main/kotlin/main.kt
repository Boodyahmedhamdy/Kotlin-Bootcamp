fun main() {

    separate("normal set")
    var mySet: Set<String> = setOf( "ahmed", "somaa", "hamdy", "hassan", "ahmed")
    println(mySet)

    separate("mutable set")
    var anotherSet = mutableSetOf<String>("boody", "hassan", "koka")
    anotherSet.add("koky")
    println(anotherSet)

    separate("set with objects")
    var p1 = Person("ahmed")
    var p2 = Person("boody")
    var p3 = p1
    var p4 = Person("ahmed")


    // if Person was data class only unique values will be added
    var personsSet: Set<Person> = mutableSetOf(p1, p2, p3, p4)
    println(personsSet)





}

fun separate(title: String = "") {
    println("-----------------$title--------------------")
}