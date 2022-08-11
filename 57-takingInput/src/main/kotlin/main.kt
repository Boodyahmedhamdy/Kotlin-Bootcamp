fun main(vararg args: String) {

    print("enter your name: ")
    // will be null if we reached the end of a file that we read lines from it
    val name: String = readLine() ?: "defultName"
    println("hello, $name")



}