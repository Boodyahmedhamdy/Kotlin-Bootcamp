fun main() {
    // fixed list is mutable
    // read only list
    var immutableList = listOf(2, 4, 5, "ahmed")
    println(immutableList)

    // first and last
    println(immutableList.first())
    println(immutableList.last())

    // empty list
    var theEmptyList: List<Int> = emptyList<Int>()
    // plus method returns new list with added item
//    theEmptyList.plus(3)// immutable .. can't be changed
    theEmptyList = theEmptyList.plus(3)// immutable .. can't be changed
    println(theEmptyList)

}