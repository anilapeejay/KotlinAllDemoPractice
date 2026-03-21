package oops.interfacee.interfacewithdefaultmethod

/*
* Interface in kotlin
* use interface keyword to create interface
* use val or var keyword to create properties
* use override keyword to override the properties
* An Interface have abstract or non abstract methods but have atleat one abstract method
* A Class can implement multiple interfaces
*
* */
interface Vehicle {
    // val name: String // Abstract Property and need implementation in child class
    fun start() // Abstract Method and need implementation in child class
    fun stop() // Abstract Method and need implementation in child class

    /*
    *override color if you want to change the default implementation otherwise
    * use default implementation
    */

    fun color(color: String) {
        println("Color is : $color")
    }
}
