package people

class Driver(var car: String = "car",
             var licenseType: licenseType = people.licenseType.BRONZE)
    : Human("driverName") {

    private var isDriving: Boolean = false

    fun driveAndEat() {
        this.isDriving = true
        println("${this.name} is driving")
        this.eat() // from the parent class --> because it is protected
    }

}