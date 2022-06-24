fun main() {
    var user: User = User("boody", 22, 100.0)

    println(user.data)
    user.data = "another value"

    println(user.location)
    user.location = "Egypt"
    println(user.location)


    println(user)
}