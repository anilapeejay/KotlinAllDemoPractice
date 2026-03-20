package oops.initblock

/*
* use init block to initialize the properties of class
* */
class InitBlockDemo {

    init {
        println("I' m in Init Block.")
    }
}

fun main(){
    val obj = InitBlockDemo()
    println("I' m in main function.")
}
