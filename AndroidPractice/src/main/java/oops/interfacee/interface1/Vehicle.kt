package oops.interfacee.interface1

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
    fun start() // Abstract Method and need implementation in child class
    fun stop() // Abstract Method and need implementation in child class
   /* fun color(){
        println("Color is white")
    }*/

}
