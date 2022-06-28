class Admin(var email: String = USER_NAME,
            var password: String = PASSWORD,
            var name: String = "name",
            var age: Int = 0) {
    companion object {
        const val USER_NAME = "admin@admin.com"
        const val PASSWORD = "password"
    }

    constructor(email: String, password: String):
            this(email, password, "name", 0) {}

}