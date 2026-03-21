package oops.interfacee.interfacewithdefaultmethod

class Bike : Vehicle{
    override fun start() {
        println("Bike is started")
    }

    override fun stop() {
    println("Bike is stopped")
    }

    override fun color(color: String) {
        super.color(color)
        println("Color is : $color in implementation class")
    }
}

fun main() {
    val bike = Bike() // Create object of Car class
    bike.start() // Call start() method
    bike.stop()
    bike.color("Red")

    println()

    val car = Car()
    car.start()
    car.stop()
    car.color("Blue")
}