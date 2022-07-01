fun main() {


    val p1 = Person("boody", "ahmed")
    val p2 = Person("boody", "ahmed")

    println(p1)
    println(p2)

    println(p1 == p2) // the same value -> true
    println(p1 === p2) // the same address -> false

    println(p1.getFullName())

    separate("component methods")

    // automatically kotlin generate compontents methods -> refering to parameters list

/*    p1.component1() // firstName
    p1.component2() // lastName
    p1.component3() // age*/


    println(p1.component1()) // firstName
    println(p1.component2()) // firstName
    println(p1.component3()) // firstName

    separate("usage of component methods")
    // usage of components methods
    var (firstName: String, lastName: String, age: Int) = p1
    println("$firstName - $lastName - $age")


    separate("using copy()")
    // NOT A DEEP COPY
    var theCopy = p1.copy()
    println("$p1 --- $theCopy")

}

fun separate(title: String = "") {
    println("--------------$title-------------------")
}