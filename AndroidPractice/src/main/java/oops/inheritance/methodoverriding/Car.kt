package oops.inheritance.methodoverriding

class Car : Vehical() {
    override fun start() {
        super.start()
        println("Car Started")
    }
}

fun main() {
    val car = Car()
    val car1 = Vehical()
    car.start() // Call the overridden method
    car1.start() // Call parent class method
}
