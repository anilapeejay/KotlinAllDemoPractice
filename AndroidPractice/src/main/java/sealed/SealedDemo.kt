package sealed

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
sealed class SealedDemo {
    data class Success(val data: String) : SealedDemo()
    data class Error(val message: String) : SealedDemo()

}

fun handleResult(result: SealedDemo) {
    when (result) {
        is SealedDemo.Success -> {
            println("Success: ${result.data}")
        }
        is SealedDemo.Error -> {
            println("Error: ${result.message}")
        }
    }
}
