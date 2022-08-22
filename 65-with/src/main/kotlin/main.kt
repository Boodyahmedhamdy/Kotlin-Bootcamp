fun main() {

    var name = "my name is boody"
    println(name)
    with(name) {
        println(this.uppercase())
    }
    println(name)

    // uses it
    myWith(name) {
        println(it.uppercase())
    }

    // for extention method use this -> but for arguments uses it
    // uses this
    myWith2(name) {
        println(this.uppercase())
    }
}

fun myWith(text: String, block: (String) -> Unit) {
    block(text)
}

fun myWith2(text: String, block: String.() -> Unit) {
    text.block()
}
