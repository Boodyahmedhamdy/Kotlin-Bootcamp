import java.lang.Thread.sleep
import kotlin.random.Random

fun main() {

    var lazyInt: Lazy<Int> = lazy { getAllData() }


    // all of that is cached data that was made once and used forever
    println(lazyInt.value)
    println(lazyInt.isInitialized())

    println(lazyInt)
    println(lazyInt)
    println(lazyInt)


}

fun getAllData(): Int {
    println("getting data from database")
    sleep(2000)

    return Random(1).nextInt()
}