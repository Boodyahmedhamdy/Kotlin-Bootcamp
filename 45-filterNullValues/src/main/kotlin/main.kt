fun main() {

    var myList: List<String?> = listOf("ahmed", "hamdy", null, "boody", null, "null", "abbas")
    println(myList)

    var namesList = myList.filterNotNull()
    println(namesList)

    


}