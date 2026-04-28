package oops.inheritance.usingconstructor

/*
* Base class with constructor passing age
* */
open class Student(val age: Int) {
    open fun age(){
        println("Age is $age in parent class")
    }
}