fun main() {
    println(Admin.PASSWORD)
    println(Admin.USER_NAME)

    var admin: Admin = Admin()
    println(admin.email == Admin.USER_NAME)
    println(admin.password == Admin.PASSWORD)


}
