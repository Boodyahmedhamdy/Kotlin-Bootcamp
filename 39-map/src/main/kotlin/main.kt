fun main() {

    // this is immutable map
    var theMap: Map<String, String> = mapOf(
        "name" to "boody",
        "age" to "10",
        "address" to "Egypt"
    )

    println(theMap)
    separate()

    var status: Map<String, String> = mapOf(
        "NY" to "newYork",
        "LA" to "losAngles"
    )
    status.forEach { key, value ->
        println("theKey: $key, theValue: $value")
    }

    separate()
    // get value using key
    // if key was wrong will return null -- so we use getOrDefault
    println(status.getOrDefault("NY", "default"))
    println(status.get("NY"))
    println(status["NY"])

    separate()
    // check containing values or key
    println(status.containsKey("LA"))
    println(status.containsValue("ahmed"))
}

fun separate(title: String = "") {
    println("------------$title---------------------")
}