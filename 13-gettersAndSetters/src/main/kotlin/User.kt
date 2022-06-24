class User(var name: String = "name",
           var age: Int = 0,
           var salary: Double = 0.0) {
    // init block to be called after primary constructor
    init {
        println("created User object with " +
                "name: $name, " +
                "age: $age, " +
                "salary: $salary")
    }

    var data: String = "$name, $age, $salary"
        // get is called when --> user.data
        get() = "data = $field"
        // set is called when ---> user.data = something
        // field keyword points to the data field
        set(value) {
            println("\'$field\' was changed with value \'$value\'")
            field = value
        }

    var location: String? = null
        get() = "location: ${field ?: "somewhere"}"
        set(value) {
            // if passed value was null --> set field with somewhere
            field = value?:"somewhere"
        }

    override fun toString(): String {
        return """
            name: ${this.name}, 
            age: ${this.age}, 
            salary: ${this.salary}, 
            data: ${this.data}, 
            location: ${this.location}
        """.trimIndent()
    }


}