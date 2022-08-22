class EBook : Book() {
    var wordCount: Int = 0
    override fun readPage() {
        this.wordCount = this.wordCount + 250
    }
    
}