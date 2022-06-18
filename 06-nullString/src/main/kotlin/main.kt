fun main() {
    // null isn't allowed
    var name1: String = "boody"
    // this is safe because name1 can't be null by Kotlin
    var len1: Int = name1.length
//    name1 = null <-- illegal command

    // allow null with '?'
    var name2: String? = "ahmed"

    // ? after name2 means if name2 is null return null to len2
    // so ? is needed in len2 to allow null if name2 was null
    var len2: Int? = name2?.length

    // all ok
    println("$len1, $len2")

    // make name2 == null
    name2 = null

    // retake value of len2
    len2 = name2?.length

    // print both
    println("$name1, $name2")
    println("$len1, $len2")



    // ------------------------------
    var s1: String? = null

    // if anything on left of ' ?: ' is null return value on right side
    var n1: Int = s1?.length ?: -1
    println(n1)




}
