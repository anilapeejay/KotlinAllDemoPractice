package constructor_demo.secondary

class PrimaryAndSecondaryBoth(val name: String, val age: Int){

    constructor(name: String, age: Int, salary: Double): this(name, age){
        println("Student Name is : $name and Age is : $age and Salary is : $salary")
    }

    init {
        println("Student Name is : $name")
        println("Student Age is : $age")

    }
}

fun main(){
    val obj = PrimaryAndSecondaryBoth("Anil", 25)
    println()
    val obj1 = PrimaryAndSecondaryBoth("Kim", 32, 25000.00)

}