class Car(override var color: String): ICar {
    override val numberOfDoors: Int
        get() = 4

}