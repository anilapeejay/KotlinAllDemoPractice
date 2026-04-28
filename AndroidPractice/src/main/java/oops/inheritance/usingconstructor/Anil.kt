package oops.inheritance.usingconstructor

/*
* A child class must implement the base class constructor
* */
class Anil(age: Int) : Student(age) {
    override fun age() {
        super.age()
        println("Age is $age")
    }
}

fun main(){
        val anil = Anil(25)
        anil.age()
}