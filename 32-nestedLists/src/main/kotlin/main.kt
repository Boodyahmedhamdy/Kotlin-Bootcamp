fun main() {
    var myList: MutableList<String> = mutableListOf("koky", "esmail")
    var hisList: MutableList<String> = mutableListOf("hassan", "saad")
    var herList: MutableList<String> = mutableListOf("zahra", "amina")

    var ourFriends = mutableListOf<List<String>>(myList, hisList, herList)
    println(ourFriends)
    println(ourFriends.size)
    println(ourFriends[0][0])
    separate("using flatten")
    println(ourFriends.flatten())

    separate("using plus method")
    // to make them all one list
    var allInOne = myList.plus(hisList).plus(herList)
    println(allInOne)

    

}
fun separate(title: String = "") {
    println("---------------$title----------------")
}