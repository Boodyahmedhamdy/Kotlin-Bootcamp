import kotlin.Exception

fun main() {

    var p = Person(age = 103)
    if(p.age < 18) {
        throw Exception("user isn't old enough")
    } else {
        throw MyOwnException("this is my own exception")
    }



}

// my own exception
class MyOwnException(override val message: String): Exception(message)

data class Person(var name: String = "name",
                  var age: Int = 0)