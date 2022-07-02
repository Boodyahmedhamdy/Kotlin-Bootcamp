class Person(override var isMoving: Boolean = false) : Movable {
    override fun move() {
        println("i am moving")
        this.isMoving = true
    }
}