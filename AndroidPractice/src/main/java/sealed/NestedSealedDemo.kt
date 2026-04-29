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
        NestedSealedDemo.Error.Network -> TODO()
        NestedSealedDemo.Error.Server -> TODO()
        is NestedSealedDemo.Success -> TODO()
        is NestedSealedDemo.Error.Failure -> TODO()
    }
}