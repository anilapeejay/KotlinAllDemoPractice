package oops.inheritance.realworldexample

/*
* Base Class
* use open keyword to allow child class to override this method
*use open keyword before method to override
* */
open class Vehicle {

    fun start(){
        println("Vehicle Started")
    }

    fun stop(){
        println("Vehicle Stopped")
    }

    open fun fuelType(){
        println("Generic Fuel!!")
    }

}