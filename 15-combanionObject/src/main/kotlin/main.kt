fun main() {
    var user = User.createUser("boody", "ahmed")
    println(user)

    var users = User.createUsers(4)
    println(users)

    println(User.numberOfUsers)

}