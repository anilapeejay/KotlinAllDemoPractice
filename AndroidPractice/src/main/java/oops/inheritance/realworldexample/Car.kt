package oops.inheritance.realworldexample

// Child Class
/*
* use super.methodName() of base class to call parent method
* override → parent function ko change karna
* */
class Car : Vehicle() {

    override fun fuelType() {
        //super.fuelType() // uncomment this to call parent method
        println("Car uses petrol")
    }
}