@file:JvmName("toRepeat")

class repeater {
    companion object{
        fun repeat(times: Int) {
            for (x in 0..times) {
                println(x)
            }
        }
    }
}