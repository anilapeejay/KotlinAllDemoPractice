package oops.interfacee.withproperty

/*
* Class implementing interface
* and implementing abstract property as constructor
* */
//class Girl(override val name: String, override val age: Int) : Person
class Girl(override val name: String, override val age: Int) : Person

fun main() {
    val girl = Girl("Anjali", 25)

}