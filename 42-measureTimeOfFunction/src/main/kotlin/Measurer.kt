import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

class Measurer {


    fun measure(function: () -> Unit): Long{
        return TimeUnit.NANOSECONDS.toMillis(measureNanoTime(function))
    }
}