fun generate() {
    generateSequence(1) {it + 1}.take(2000).toList()
}