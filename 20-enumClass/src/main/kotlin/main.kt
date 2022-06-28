fun main() {
    var user = User("boody")
    println(user)
    user.upgradeAccountTo(AccountType.SILVER)
    println(user)
}