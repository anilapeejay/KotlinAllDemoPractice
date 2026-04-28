package oops.inheritance.usingmethods

class Dog : Animal() {

    // Child class method
    fun bark(){
        println("Barking...")
    }
}

fun main(){
    val dog = Dog()
    dog.eat() // Inherited method
    dog.bark() // Own method
}