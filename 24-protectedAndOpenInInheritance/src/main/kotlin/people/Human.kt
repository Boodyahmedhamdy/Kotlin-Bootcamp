package people

// use open keyword to make the class able to have children
open class Human(var name: String = "HumanName",
                 var age: Int = 0){

    protected var protectedattribute: Int = -1

    // using protected methods makes it work only on this class, and it's children
    protected fun eat() {
        // open keyword in fun makes it able to be overridden
        println("${this.name} is eating")
    }


}