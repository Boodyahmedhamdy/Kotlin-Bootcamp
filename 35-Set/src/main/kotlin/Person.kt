class Person(var name: String = "name"){
    companion object {
        var numberOfCreatedObjects = 0
    }

    init {
        numberOfCreatedObjects++
    }

    var number = numberOfCreatedObjects
    override fun toString(): String {
        return "name: ${this.name}|number: ${this.number}"
    }
}