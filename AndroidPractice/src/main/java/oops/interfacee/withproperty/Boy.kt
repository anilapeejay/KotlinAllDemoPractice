package oops.interfacee.withproperty

class Boy : Person {
    override val name: String
        get() = "Rohan"
    override val age: Int
        get() = 40
}

fun main() {
    val boy = Boy()
    println("Name is: ${boy.name} and Age is: ${boy.age}")
}
