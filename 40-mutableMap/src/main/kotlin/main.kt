fun main() {

    var theMap: MutableMap<Int, String> = mutableMapOf(
        1 to "boody",
        3 to "ahmed",
        5 to "hamdy"
    )
    println(theMap)

    theMap.put(7, "hassan")

    println(theMap)

    // this means remove 7 if it's key is hassan
    // - if we passed another value except 'hassan' it won't work
    var s = theMap.remove(7, "hassan") // returns boolean
    // if passed only the key will return value or null
    println(theMap)
    println(s)

    theMap[9] = "nasr"
    println(theMap)
    //
    theMap.put(1, "someone")
    println(theMap) // override value

    // to prevent overriding
    theMap.putIfAbsent(1, "boody")
    println(theMap)

}