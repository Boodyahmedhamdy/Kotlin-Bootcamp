class Person
constructor(firstName: String, lastName: String, age: Int ){

    constructor(firstName: String, lastName: String): this(firstName, lastName, 0) {
        println("first and last name constructor")
    }

    constructor(firstName: String): this(firstName, "lastName") {
        println("first name constructor the age is 0")
    }

    constructor(age: Int): this("firstName", "lastName", age) {
        println("age constructor only")
    }


}