package oops.inheritance.usingfinalkeyword

class Car : Vehical() {

    override fun speed(speed: Double) {
        super.speed(speed)
        println("Car Speed : $speed")
    }

    override fun color(color: String) {
        super.color(color)
        println("Car Color : $color")
    }

    fun model(model: String){
        println("Car Model : $model")
    }

}

fun main(){
    val car = Car()
    car.speed(100.0)
    car.color("Red") // Inherited method
    car.brand("BMW") // Inherited method
    car.model("X5") // Own method
    car.start() // Inherited method
    car.stop() // Inherited method
    car.run() // Inherited method
    car.drive() // Inherited method
    car.park() // Inherited method
    car.turn() // Inherited method
    car.accelerate() // Inherited method
    car.brake() // Inherited method
    car.turnLeft() // Inherited method
    car.turnRight() // Inherited method
    car.reverse() // Inherited method
    car.honk() // Inherited method
    car.refuel() // Inherited method
    car.charge() // Inherited method

}
