class User {
    // i will initialize it later in the program
    lateinit var name: String

    // lateinit works only with var
    // because val is constant and can't be changed once it is declared
    // so it must be initialized
//    lateinit val age: Int

    override fun toString(): String {
        this.name = "name"
        return """
            name = ${this.name}
        """.trimIndent()
    }
}