fun main() {

    // greeter's type is lambda with no parameters and returns an empty String
    var greeter: (String, Int) -> String = {
        name: String, age: Int -> "hello, $name you are $age years old"
    }

    println(greeter("boody", 2))

    val nothing: (Int) -> Unit = {
        for(x in 1..it) {
            println(x)
        }
    }

    nothing(4)

    val repeater: (Int, (() -> Unit)) -> Unit = {
        times: Int, block: ()->Unit ->
        for(x in 1..times) {
            block()
        }
    }

    repeater(3) {
        println("something")
    }


}