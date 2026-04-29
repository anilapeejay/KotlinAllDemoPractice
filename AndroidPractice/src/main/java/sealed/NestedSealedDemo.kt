package sealed

/*
* Nested Sealed class demo
* */
sealed class NestedSealedDemo {
    data class Success(val data: String) : NestedSealedDemo()
    sealed class Error : NestedSealedDemo(){
        object Network : Error() // object declaration of Error , Singleton (only one instance)
        object Server : Error()
        data class Failure(val message: String) : Error()
    }
}

fun handleResult(result: NestedSealedDemo){
    when(result){
        is NestedSealedDemo.Success ->  println("Data: ${result.data}")
        is NestedSealedDemo.Error.Network ->  println("No Internet")
        is NestedSealedDemo.Error.Server -> println("Server Error")
        is NestedSealedDemo.Error.Failure ->  println("Error: ${result.message}")
    }
}