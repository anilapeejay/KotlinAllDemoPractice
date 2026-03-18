package constructor_demo.primary

/* primary constructor
* use with class name
*use constructor keyword to create constructor
* use val or var keyword to create properties
* or ommit constructor keyword to create properties
 */
//private class Student constructor(val name: String, val age: Int){
private class Student(val name: String, val age: Int){ // ommit constructor keyword

}

fun main(){
    val obj = Student("Anil",25)
    println("Student Name is : ${obj.name}")
    println("Student Age is : ${obj.age}")

    println()

    val obj1 = Student("Rahul",30)
    println("Student Name is : ${obj1.name}")
    println("Student Age is : ${obj1.age}")

}