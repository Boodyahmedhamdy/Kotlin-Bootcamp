fun main() {
    // one byte space
    val myByte: Byte = 12 // 8-bits signed integer -128:127

    // two bytes space
    val myShort: Short = 543 // 16-bits signed integer

    // four bytes space
    val myInt: Int = 21321231 // 32-bits signed integer

    // eight bytes space
    // underscores are to make large numbers more readable
    val myLong: Long = 999_212_323 // 64-bits signed integer


    // 4 bytes space
    val myFloat: Float = 32.00f // 32-bits --> f is required in the end of number

    // 8 bytes space
    val myDouble: Double = 64.0 // 64-bits

    // 0------------------------------
    var name: String = "boody"

    println(name.length)
    println(name[0])
    println(name.uppercase())
    println(name.lowercase())

    println("hello, $name")
    println("hello, $name your name also is ${name.uppercase()}")

    var message: String = """
        hello, 
        my name is $name
        i am from cairo and i am learning kotlin
    """
    println(message)

    // usage of trimIndent() method
    var newMessage: String = message.trimIndent()
    println(newMessage)

    // Boolean
    var isFull: Boolean = true;
    println(isFull)
    println(isFull.not())

    








}