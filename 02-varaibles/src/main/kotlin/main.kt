import kotlin.math.ln

fun main() {
    // var for changeable values
    var firstName = "boody";

    // val is for constant variable
    val lastName = "ahmed";

    // the value here could be changed
    firstName = "hassan"
    var emptyString = ""

    // illegal statement
    // lastName = "anotherName"

    println(firstName + lastName)

    // how to check if string is empty or not
    println("using method check if string is empty or not, " +
            "so \'" + firstName + "\' is empty = " + firstName.isEmpty())
    println("using method check if string is empty or not, " +
            "so \'" + emptyString + "\' is empty = " + emptyString.isEmpty())

    // how to get type of variable
    println("type of " + firstName + " is " + firstName::class)

    var thisIsString: String = "string"
    var thisISInt: Int = 32

    println(thisISInt::class.toString() + " and " + thisIsString::class)




}