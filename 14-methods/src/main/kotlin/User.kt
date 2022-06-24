class User {
    var name: String = "name"
    var age: Int = 0

    fun getData(): String {
        return """
            ${this.name}, ${this.age}
        """.trimIndent()
    }

    


}