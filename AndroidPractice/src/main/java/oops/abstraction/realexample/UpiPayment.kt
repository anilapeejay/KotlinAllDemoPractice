package oops.abstraction.realexample

// Child class
class UpiPayment : Payment() {

    override fun pay(amount: Double) {
        println("Paid $amount using UPI Payment.")
    }
}