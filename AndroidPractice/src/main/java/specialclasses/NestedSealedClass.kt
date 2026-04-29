package specialclasses

/*
* Nested Sealed class demo
* */
sealed class NestedSealedClass {
    data class Success(val data: String) : NestedSealedClass()
    sealed class Error : NestedSealedClass(){
        object Network : Error()
        object Server : Error()
        data class failer(val message: String) : Error()
    }
}

fun handleResult(result: NestedSealedClass){
    when(result){
        NestedSealedClass.Error.Network -> TODO()
        NestedSealedClass.Error.Server -> TODO()
        is NestedSealedClass.Success -> TODO()
        is NestedSealedClass.Error.failer -> TODO()
    }
}