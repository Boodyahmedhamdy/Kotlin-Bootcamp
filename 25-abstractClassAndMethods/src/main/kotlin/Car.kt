

class Car(val model: String,
          override var numberOfDoors: Int) : Vehicle(0){

    override fun drive() {
        println("car with ID = ${this.ID} is driving")
    }


}