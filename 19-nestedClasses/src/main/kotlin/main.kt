fun main() {
    var car: Viechle = Viechle()
    car.brand = "BMW"
    var motor: Viechle.Motor = car.Motor()

    println(motor.info())
}