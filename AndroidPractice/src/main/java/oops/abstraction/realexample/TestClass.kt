package oops.abstraction.realexample

class TestClass
fun main(){
    val payment: Payment = UpiPayment()
    payment.paymentStarted() // Payment Started from parent class
    payment.pay(100.89) //

    val cardPayment: Payment = CardPayment()
    cardPayment.paymentStarted() // Payment Started from parent class
    cardPayment.pay(1334.87) //

}