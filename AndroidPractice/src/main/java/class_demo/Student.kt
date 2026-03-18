package class_demo

private class Student {
     var name: String = ""
     var age: Int = 0
}

fun main(){
    val obj = Student() // Create object of class
    /*obj.name = "Anil"
    obj.age = 25*/
    println("Student Name is : ${obj.name}")
    println("Student Age is : ${obj.age}")
    println()

    // Create another object
    val obj1 = Student()

    //assiging values
    obj1.name = "Anil"
    obj1.age = 25

    println("Student Name is : ${obj1.name}")
    println("Student Age is : ${obj1.age}")




}