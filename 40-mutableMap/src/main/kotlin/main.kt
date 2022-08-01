fun main() {

    var theMap: MutableMap<Int, String> = mutableMapOf(
        1 to "boody",
        3 to "ahmed",
        5 to "hamdy"
    )

    separate("printing the map")
    println(theMap)

    separate("added value")
    theMap.put(7, "hassan")
    println(theMap)


    separate("removed item")
    // this means remove 7 if it's key is hassan
    // - if we passed another value except 'hassan' it won't work
    var s = theMap.remove(7, "hassan") // returns boolean
    // if passed only the key will return value or null
    println(theMap)
    println(s)

    separate("changed value")
    theMap[9] = "nasr"
    println(theMap)

    separate("added value")
    theMap.put(1, "someone")
    println(theMap) // override value

    separate("put if absent")
    // to prevent overriding
    theMap.putIfAbsent(1, "boody")
    println(theMap)

    separate("check if empty")
    // to check if the map is empty
    if(!theMap.any()) {
        println("this map is empty")
    } else {
        println("the map is $theMap")
    }


    separate("clear")
    // to clear the map and make it empty
    theMap.clear()
    println(theMap)

    separate("another way to check if empty")
    // another way to check emptiness
    if(theMap.none()) {
        println("this map is empty")
    } else {
        println("the map is $theMap")
    }



}

fun separate(title: String = "") {
    println("----------------$title---------------")
}