package oops.inheritance.multilevelinheritance

// Parent class
open class Animal {
    fun eat(){
        println("Animal is eating")
    }

    // This color method is open and ready to override in child class
    open fun color(){
        println("Animal is of black color")
    }
}