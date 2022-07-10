fun main() {
    // you can provide the datatype
    var theList = mutableListOf(1, 2, 3, 4, 5)

    separate("loop")
    // loop
    theList.forEach {
        println("${it}")
    }

    separate("adding in list")
    // add in kotlin is like append in python and push in js
    println(theList)
    theList.add(6) // will append
    println(theList)
    theList.add(0, 0) // will add in the beggining -> index 0
    println(theList)

    separate("size of list")
    // the size of the list
    println("the size of the list is ${theList.size}")


    separate("remove from list")
    // remove from list
    val isDeleted = theList.remove(1) // remove element 1 // returns boolean value
    println(isDeleted)
    println(theList.remove(1)) // false because 1 isn't found

    // remove using index
    theList.removeAt(0) // remove the first element
    println(theList)
    println(theList.removeAt(0)) // returns the removed element
    println(theList)

    separate("using []")
    println(theList[0])

    separate("set values")
    // the same output
    theList[0] = -1
    println(theList)
    theList.set(0, -1) // set index 0 to be -1
    println(theList)
    
}

fun separate(title: String = "") {
    println("-----------$title---------------")
}