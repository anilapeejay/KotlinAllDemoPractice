package constructor_demo

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