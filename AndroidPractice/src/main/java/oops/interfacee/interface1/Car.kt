package oops.interfacee.interface1

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
}
/*
* main function to create object of Car class
* */
fun main() {
    val car = Car() // Create object of Car class
    car.start() // Call start() method
    car.stop() // Call stop() method
}
