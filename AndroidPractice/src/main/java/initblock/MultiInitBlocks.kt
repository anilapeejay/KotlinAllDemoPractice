package initblock

class MultiInitBlocks {

    init {
        println("I' m in first init block.")
    }

    init {
        println("I' m in second init block.")
    }

    init {
        println("I' m in third init block")
    }
}

fun main(){
    MultiInitBlocks()
}
