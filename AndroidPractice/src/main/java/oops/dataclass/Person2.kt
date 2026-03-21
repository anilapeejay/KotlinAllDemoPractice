package oops.dataclass

/*
* Data classes used in kotlin to hold data.
* Must have at least one parameter
Parameters must be val or var
Cannot be abstract, open, etc.
*
* For each data class, the compiler automatically generates additional member functions that allow you to print an instance to readable output, compare instances, copy instances, and more.
*  Data classes are marked with data:
* */
data class Person2(val name: String,val age: Int){
    var salary: Double = 0.0
}

fun main(){
    val person1 = Person2("Anil", 25)
    person1.salary = 20000.00
    println(person1)
    println("salary : "+person1.salary)
    println()
    val person2 = Person2("Kim", 30)
    println("${person2.name} ----"+person2)

}
