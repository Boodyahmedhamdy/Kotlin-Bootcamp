fun main() {
    var user = User("boody")
    println(user)
    user.upgradeAccountTo(AccountType.SILVER)
    println(user)

    separate("loop over enum members")
    // loop over enum members
    for (item in AccountType.values()) {
        println(item)
    }

    separate("static methods in enum")
    println(AccountType.getAccountTypeByName("broNZE"))
}




fun separate(title: String = "") {
    println("-------------$title--------------")
}