package oops.abstraction.realexample

class CardPayment : Payment() {
    override fun pay(amount: Double) {
        println("Paid $amount using Card Payment.")
    }
}