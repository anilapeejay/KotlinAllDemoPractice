package oops.dataclass

/*
* Data classes used in kotlin to hold data.
* Must have at least one parameter
Parameters must be val or var
Cannot be abstract, open, etc.
* For each data class, the compiler automatically generates additional member functions that allow you to print an instance to readable output, compare instances, copy instances, and more.
*  Data classes are marked with data:
* */
private data class Person(val name: String,val age: Int)

fun main(){
    val person1 = Person("Anil", 25)
    println(person1)
    println()
    val person2 = Person("Kim", 30)
    println("${person2.name} ----"+person2)

}
