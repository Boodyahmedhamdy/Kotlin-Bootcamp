fun main() {
    var list = mutableListOf<String>("boody", "ahmed", "hamdy", "ahmed", "hassan")
    var newList = list.map {
        it.substring(0, 3).uppercase() // the line here will be returned
    }
    println(newList)
}