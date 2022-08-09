class MyStack<T> {
    var data: MutableList<T> = mutableListOf<T>()

    fun push(item: T) {
        this.data.add(item)
    }

    fun pop(): T {
        return this.data.last()
    }

    fun isEmpty(): Boolean {
        return this.data.isEmpty()
    }

    override fun toString(): String {
        return this.data.toString()
    }

}