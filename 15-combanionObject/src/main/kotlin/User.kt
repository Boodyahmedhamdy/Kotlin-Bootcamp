class User(var firstName: String = "firstName",
           var lastName: String = "lastName") {


    // contains all static methods and attributes
    companion object {
        var numberOfUsers: Int = 0

        fun createUser(firstName: String, lastName: String): User {
            numberOfUsers++
            return User(firstName, lastName)
        }

        fun createUsers(count: Int): List<User> {
            var listOfUsers = mutableListOf<User>()

            for(i in 0..count-1) {
                listOfUsers.add(User("firstName$i", "lastName$i"))
                numberOfUsers++
            }

            return listOfUsers
        }

    }


    override fun toString(): String {
        return """
            (${this.firstName}, ${this.lastName})
        """.trimIndent()
    }
}
