fun main() {
    var person = Person()
    var car  = Car()
    car.isMoving = false
    makeMove(car)
    makeMove(person)

    // inline interface
    makeMove(object: Movable {
        override var isMoving: Boolean = false
            get() = field
            set(value) {field = value}

        override fun move() {
            println("inline is moving")
        }
    })

}
fun makeMove(movable: Movable) {
    if (movable.isMoving == false) {
        movable.move()
    }

}