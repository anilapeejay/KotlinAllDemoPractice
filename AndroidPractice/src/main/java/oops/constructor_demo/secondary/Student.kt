package oops.constructor_demo.secondary

/*
* Secondary Constructor
* use constructor keyword to create constructor
* use val or var keyword to create properties
* */
class Student{

    constructor(name: String, age: Int){
        println("Student Name is : $name")
        println("Student Age is : $age")
    }

}

fun main(){
    val obj = Student("Anil",25)
    println()
    val obj1 = Student("Rahul",30)

}
