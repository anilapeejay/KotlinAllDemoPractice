package initblock


/*
* initialize properties of class in init block
* */
class InitDemo2 {
    var name: String = ""
    var age: Int = 25

    init {
        println("I' m in Init Block.")
        name = "Anil"
        age = 30
        println("Student Name is : $name")
        println("Student Age is : $age")
    }

}

fun main(){
    val obj = InitDemo2()
    println("I' m in main function.${obj.name}")
}
