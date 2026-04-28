package oops.inheritance.multilevelinheritance

class TestClass

fun main(){
    val puppy = Puppy()
    puppy.eat() // Animal se
    puppy.bark() // Dog se
    puppy.weep() // Apna khud
    puppy.color()  // it will call from last overriden class
}