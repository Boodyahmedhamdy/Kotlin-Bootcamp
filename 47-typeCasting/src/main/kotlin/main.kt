fun main() {
    var some: Any = "2"

    var number = some as? Int // if it could cast it to int will return the value else null
//    println(number::class) // illegal becuase number is nullable
    println(number)

    var name = some as String
    println(name)



}