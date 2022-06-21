fun main() {
    var user: User = User("boody", "ahmed", 1)
//    user.firstName = "boody"
//    user.lastName = "ahmed"

    println(user.fullName)
    user.printFullName()
    user.printFullNameWithPrefix("****")

}