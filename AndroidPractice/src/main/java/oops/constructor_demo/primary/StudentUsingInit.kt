package oops.constructor_demo.primary

/* primary constructor
* use with class name
*use constructor keyword to create constructor
* use val or var keyword to create properties
* or ommit constructor keyword to create properties
*
* First init block call then constructor call
 */
//private class Student constructor(val name: String, val age: Int){
private class StudentUsingInit(val name: String, val age: Int){ // ommit constructor keyword
    var mname: String = name
    var mage: Int = age

    // After creating object of class an init block call
    init {
        println("In class Student Name is : $mname")
        println("In class Student Age is : $mage")
    }
}

fun main(){
    val obj = StudentUsingInit("Anil",25)
    println("Student Name is : ${obj.name}")
    println("Student Age is : ${obj.age}")

    println()

    val obj1 = StudentUsingInit("Rahul",30)
    println("Student Name is : ${obj1.name}")
    println("Student Age is : ${obj1.age}")

}