```kotlin
fun processData(data: String): Int {
    try {
        return data.toInt()
    } catch (e: NumberFormatException) {
        //This is a common way to handle exception but it can hide some issues
        return 0 // Or some default value
    }
}
```