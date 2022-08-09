fun main() {

    var person: Person = Person(10)

    try {
        checkAge(person)
    } catch (exception: Exception) {
        println("something went wrong '${exception.message}'")
    } finally {
        println("in all cases this line will be shown")
    }

}

fun checkAge(person: Person) {
    if (person.age < 18) {
        throw Exception("this person is so young")
    }
}

data class Person(var age: Int)