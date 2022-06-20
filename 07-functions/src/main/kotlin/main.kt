fun main() {

    separate("return nothing")
    sayHelloReturnNothing()
    var returnUnit = sayHelloReturnNothing() // it's type should be Unit
    println(returnUnit::class) // Unit


    separate("return String")
    sayHelloReturnString()
    var returnString: String = sayHelloReturnString()
    println(returnString::class)
    println("${sayHelloReturnString()} ")


    separate("inner functions")
    parent()


    separate("single line functions")
    sayHi()


    separate("function with parameters")
    sayHelloTo(name = "boody")
    sayHelloTo("ahmed")


}

// function to separate things in console
fun separate(title: String = "") {
    println("\n-----------------$title------------------------")
}



// this is how to create simple function
// default return type of all functions is Unit
fun sayHelloReturnNothing(): Unit { // also no need for return type Unit -- it automatically happens
    println("say hello function")
    return Unit; // no need for this line
}

// function with return
fun sayHelloReturnString(): String {
    val string: String = "someString"
    return string
}

// inner functions
fun parent(){
    println("i am a parent")
    fun child() {
        println("i am a child")
        fun grandChild() {
            println("i am a grand child")
        }
        grandChild()
    }
    child()
}


// single line function
fun sayHi() = println("Hi")

// function with parameters
fun sayHelloTo(name: String) {
    println("hello, ${name.uppercase()}")
}






