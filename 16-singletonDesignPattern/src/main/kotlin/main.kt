fun main() {
    var theAdmin = Admin
    println(theAdmin.name)
    println(theAdmin)
    theAdmin.name = "boody"

    println(theAdmin.name)
    println(theAdmin)

    var anotherAdmin = Admin

    println(anotherAdmin.name)
    println(anotherAdmin)

    println(theAdmin == anotherAdmin)
    println(theAdmin === anotherAdmin)
}