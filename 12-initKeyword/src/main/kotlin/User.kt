class User
constructor(var name: String = "name",
            var age: Int = 0,
            var location: String = "nowhere") {
    ////////////////////////////////////////////////////////////
    // init is called after the primary constructor happen
    // in other words body of primary constructor
    init {
        println("this is called after primary constructor is called")
    }

    // i can have more than one init
    // they will be excuted as they were written
    init {
        println("the second init block")
    }

    // location constructor
    constructor(location: String): this("name", 0, location) {
        println("this is location constructor")
    }




}