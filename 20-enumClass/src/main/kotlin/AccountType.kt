enum class AccountType(val numberOfInvetitionsPerMonth: Int = 5) {
    BRONZE(5),
    SILVER(10),
    GOLD(15); // finish them by adding ;

    companion object {
        fun getAccountTypeByName(name: String): AccountType {
            return valueOf(name.uppercase())
        }
    }
}