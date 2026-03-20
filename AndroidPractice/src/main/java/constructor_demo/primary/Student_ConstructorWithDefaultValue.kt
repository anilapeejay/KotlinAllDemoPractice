package constructor_demo.primary

class Student_ConstructorWithDefaultValue(val name: String, val age: Int = 25) {
    init {
        println("Student Name is : $name")
        println("Student Age is : $age")
    }

}

fun main(){
    Student_ConstructorWithDefaultValue("Anil")
}