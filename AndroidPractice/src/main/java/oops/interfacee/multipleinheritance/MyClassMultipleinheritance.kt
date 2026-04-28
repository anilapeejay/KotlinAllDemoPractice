package oops.interfacee.multipleinheritance
class MyClassMultipleinheritance : MyInterfaceA, MyInterfaceB {
    override fun show(): String {
        val a = super<MyInterfaceA>.show() // to use show() method of MyInterfaceA if common methods in multiple interfaces
        //val b = super<MyInterfaceB>.show() // to use show() method of MyInterfaceA
        println("uiu -- ${a}")
        return "Anil"
    }
    override fun showA() {
        println("I'm showA() method of MyInterfaceA")
    }
    override fun showB() {
        println("I'm showB() method of MyInterfaceB")
    }
}
fun main() {
    val obj = MyClassMultipleinheritance()
    obj.show()
    obj.showA()
    obj.showB()
}