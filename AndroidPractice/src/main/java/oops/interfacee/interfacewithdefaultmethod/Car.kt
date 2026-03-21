package oops.interfacee.interfacewithdefaultmethod

/*
* Car is class and implementing Vehicle interface
* and override the abstract method start()
* */
class Car : Vehicle {
    override fun start() {
        println("Car is started")
    }

    override fun stop() {
        println("Car is stopped")
    }

    override fun color(color: String) {
        super.color(color)
        println("Color is : $color in implementation class")
    }
}
/*
* main function to create object of Car class
* */
fun main() {
    val car = Car() // Create object of Car class
    car.start() // Call start() method
    car.stop() // Call stop() method
    car.color("White")
}
