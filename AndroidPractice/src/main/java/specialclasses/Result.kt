package specialclasses

/*
* A sealed class in Kotlin is a special type of class used to represent a restricted hierarchy—meaning all possible subclasses are known at compile time.
*  It’s very useful when you want type-safe handling of states or results (like success/error/loading).
*
* Why use Sealed Class?
All subclasses must be defined in the same file
Helps the compiler know all possible cases
Works perfectly with when expressions (no need for else)
*
*No else needed because Kotlin knows all subclasses of Result.
* */
sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()

}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
    }
}
