package oops.constructor_demo.secondary

class MultiSecondary {
    constructor(name: String, age: Int) {
        println("Student Name is : $name and Age is : $age")
    }

    constructor(name: String, age: Int, salary: Double) {
        println("Student Name is : $name and Age is : $age and Salary is : $salary")

    }

    constructor(name: String, age: Int, salary: Double, address: String, isMarried: Boolean){
            println("Student Name is : $name and Age is : $age and Salary is : $salary and Address is : $address and Married : $isMarried")
    }
}

fun main(){
    val obj = MultiSecondary("Anil", 25)
    println()
    val obj1 = MultiSecondary("Kim", 32, 25000.00)
    println()
    val obj2 = MultiSecondary("John", 32, 25000.00, "USA", true)
    println()


}
