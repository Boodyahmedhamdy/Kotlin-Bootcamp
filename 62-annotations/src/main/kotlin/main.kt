import kotlin.reflect.full.functions

fun main() {

    val obj = myClass()
    println(obj::class.annotations)
    println(obj::class.functions)
    for(method in obj::class.functions) {
        println(method.name)
    }

}

annotation class myAnno

@myAnno
class myClass {
    fun eat() {}
    fun drink() {}
}