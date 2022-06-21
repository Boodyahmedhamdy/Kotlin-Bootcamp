class User constructor(var firstName: String = "",
                       var lastName: String = "",
                       var age: Int){


    var fullName: String = "$firstName $lastName"

    fun printFullName() {
        println(fullName)
    }

    fun printFullNameWithPrefix(prefix: String) {
        println("$prefix$fullName")
    }

}