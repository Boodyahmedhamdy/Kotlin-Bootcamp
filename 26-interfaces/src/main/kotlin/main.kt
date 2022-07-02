fun main() {
    var person = Person()
    var car  = Car()
    car.isMoving = false
    makeMove(car)
    makeMove(person)

}
fun makeMove(movable: Movable) {
    if (movable.isMoving == false) {
        movable.move()
    }

}