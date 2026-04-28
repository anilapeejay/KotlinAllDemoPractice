package oops.abstraction.realexample

/*
* use abstract keyword in class header
* abstract class have both methods abstract or non-abstract
* */
abstract class Payment {

    // Non abstract method
    fun paymentStarted(){
        println("Payment Started")
    }


    abstract fun pay(amount: Double) // abstract method and need to override in child class

    //abstract fun paymentCompleted()
    //abstract fun paymentFailed()

}