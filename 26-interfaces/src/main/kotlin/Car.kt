class Car : Movable {
    override var isMoving: Boolean = false
        get() = field
        set(value) {
            val fieldBefore = field
            if(value == field) {
                println("the passed value is the same -- no need to change")
                return
            }
            field = value
            println("value has changed successfully from '$fieldBefore' to '$value'")
        }

    override fun move() {
        println("car is moving")
        this.isMoving = true
    }

}