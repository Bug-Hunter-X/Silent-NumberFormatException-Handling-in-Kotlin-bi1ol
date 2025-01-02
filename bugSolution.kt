```kotlin
fun processData(data: String): Int {
    return try {
        data.toInt()
    } catch (e: NumberFormatException) {
        // Log the error or throw a custom exception for better error handling.
        println("Error converting '$data' to Int: ${e.message}")
        //throw IllegalArgumentException("Invalid input: $data", e)
        0 //Or throw exception for better error handling
    }
}
```