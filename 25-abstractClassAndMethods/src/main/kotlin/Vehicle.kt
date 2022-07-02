

abstract class Vehicle(val ID: Int) {

    abstract var numberOfDoors: Int

    // abstract function must be overridden
    abstract fun drive()

    // normal method
    fun turnOff() {
        println("turnoff")
    }
}