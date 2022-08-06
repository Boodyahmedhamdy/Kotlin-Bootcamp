import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {

//    measureTime {
//        val list = generateSequence(1, {it + 1}).take(10_000_000).toList()
//    }

//    measureTime {
//        val sequence = generateSequence(1, {it + 1}).take(10_000_000)
//    }


    // original list
    measureTime {
        val list:List<Int> = generateSequence(1, {it + 1}).take(10_000_000).toList()
        list.map {
            it * 3
        }.filter {
            it % 2 == 0
        }.average()
    }

    // list as sequence
    measureTime {
        val list:List<Int> = generateSequence(1, {it + 1}).take(10_000_000).toList()

        list.asSequence().map {
            it * 3
        }.filter {
            it % 2 == 0
        }.average()
    }

    // original sequence
    measureTime {
        val list: Sequence<Int> = generateSequence(1, {it + 1}).take(10_000_000)

        list.map {
            it * 3
        }.filter {
            it % 2 == 0
        }.average()
    }

}

fun measureTime(block: ()->Unit) {
    var timeTaken = TimeUnit.NANOSECONDS.toMillis(measureNanoTime(block))
    println("the block took $timeTaken ms")

}