# Silent NumberFormatException Handling in Kotlin

This example demonstrates a common, yet problematic, way to handle `NumberFormatException` in Kotlin.  The `processData` function attempts to convert a string to an integer. If the conversion fails (due to invalid input), it catches the exception and returns a default value (0 in this case).  While this prevents the program from crashing, it silently ignores potentially important error conditions, making debugging harder.

**Problem:** The function doesn't provide any indication that the input string was invalid.  This can lead to unexpected behavior further down the line.

**Solution:** The improved version logs an error message or throws a custom exception, giving more context about the failure.