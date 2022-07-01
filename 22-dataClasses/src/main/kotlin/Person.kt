
// depending on order of creation here components methods are ordered
data class Person(var firstName: String = "firstName",
             var lastName: String = "lastName",
             var age: Int = 0) {

    // it also can have methods
    fun getFullName(): String {
        return "${this.firstName} ${this.lastName}"
    }
}