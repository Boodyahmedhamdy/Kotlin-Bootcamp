// apply singleton Design Pattern in kotlin using object keyword
object Admin {
    var name: String = "AdminName"

    fun login() {
        println("${this.name} logged in")
    }
}