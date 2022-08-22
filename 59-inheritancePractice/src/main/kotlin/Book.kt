open class Book(val title: String = "bookTitle", val author: String = "bookAuthor") {

    private var currentPage: Int = 0

    open fun readPage() {
        this.currentPage++
    }

}

