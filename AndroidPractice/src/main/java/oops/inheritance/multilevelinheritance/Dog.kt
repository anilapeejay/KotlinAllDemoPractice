package oops.inheritance.multilevelinheritance

// Level 1 child class
open class Dog : Animal() {
    fun bark(){
        println("Dog barks")
    }

    override fun color() {
        //super.color() // uncomment this to call parent method color() from Animal class
        println("Dog is of Brown color")
    }
}