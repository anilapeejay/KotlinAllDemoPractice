package oops.inheritance.realworldexample

class CallingClass

fun main(){
    val car = Car()
    car.start() // Inherited
    car.fuelType() // Overriden

    val bike = Bike()
    bike.start() // Inherited
    bike.fuelType() // Overriden

}