class Viechle {
    var brand: String = "brand"

    // use inner keyword to access attributes on outer classes
    inner class Motor{
        var name = "MOTOR"
        fun info(): String = "name of this motor = $name in a vehicle with brand: $brand"
    }

}