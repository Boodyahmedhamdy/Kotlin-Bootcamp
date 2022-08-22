fun main() {

    someFunction(1)
    someFunction("name")
//    someFunction(null)


}

fun <T: Any> someFunction(param: T) : T {
    println(param)
    println(param::class)
    return param
}