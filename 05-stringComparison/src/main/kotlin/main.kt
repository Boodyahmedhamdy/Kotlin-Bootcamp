fun main() {
    // kotlin and java are different in this thing
    var name1: String = "name1"
    var name2: String = "name1"

    var p1: Person = Person("boody")
    var p2: Person = Person("boody")


    // in kotlin numbers, characters (strings) and boolean are different
    // value comparison
    println(name1 == name2); println(name1.equals(name2)) // both are the same
    println(name1.compareTo(name2)) // returns 0 if they are the same
    println(p1 == p2)


    println("----------------------------")

    // reference comparison
    println(name1 === name2)
    println(p1 === p2)
    println(p1 !== p2)
    
}
class Person(var name: String)