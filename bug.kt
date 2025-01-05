```kotlin
fun processData(input: String): String {
    val parts = input.split(',')
    if (parts.size < 2) {
        return "Invalid input"
    }
    val first = parts[0].toIntOrNull()
    val second = parts[1].toIntOrNull()
    return if (first != null && second != null) {
        (first + second).toString()  // Potential error here
    } else {
        "Invalid input"
    }
}
```