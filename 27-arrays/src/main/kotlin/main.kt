fun main() {
    var numbers = arrayOf(1, 3, 4, 6, 7)
    numbers.forEach { println(it) }

    // array of Strings
    var names: Array<String> = arrayOf("boody", "ahmed", "hamdy")

    // without datatype you can add any data types together
    var collectionOfDataTypes = arrayOf("String", 22, 1.3, 'c')
    collectionOfDataTypes.forEach {
        println("$it is ${it::class}")
    }

    // size of the array
    println(names.size)

    // how to add new item
    names.plus("newItem")
    names.forEach {
        println(it)
    }
    println(names.size)// size didn't change

    // get item with index
    val theFirstName = names.get(0)
    println(theFirstName)


// throws an exception .. not like js
//    names[names.size] = "newName"
//    println(names)
//    println(names.size)

}