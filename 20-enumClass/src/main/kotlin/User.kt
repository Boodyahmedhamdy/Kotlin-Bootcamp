class User(var name: String = "name", var accountType: AccountType = AccountType.BRONZE) {

    constructor(name: String): this(name, AccountType.BRONZE) {}

    fun upgradeAccountTo(accountType: AccountType) {
        this.accountType = accountType
    }

    override fun toString(): String {
        return """
            name = ${this.name}, 
            accountType = ${this.accountType}, 
            number of invetitions per month = ${this.accountType.numberOfInvetitionsPerMonth}
        """.trimIndent()
    }

}