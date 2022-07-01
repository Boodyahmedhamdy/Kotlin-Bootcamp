import people.Driver
import people.Human
import people.Manager

fun main() {
    // protected attributes are available on the parent and his children only

    var human: Human = Human()
    var driver: Driver = Driver()
    var manager: Manager = Manager()
    // i can't call method eat because it is protected
    driver.driveAndEat()
}