fun main() {

    loopLabel@ for(i in 11 downTo 1) {
        innerLoopLabel@ for (j in 1..11) {
            if (i == j) {
                break@innerLoopLabel
            }
            println("$i, $j")
        }
    }

}
