package oops.inheritance.usingvarvariable

class Circle : Shape() {
    override var area: Int = 10
        // get() = field
}

fun main() {
    val circle = Circle()
    println("Area of the circle: ${circle.area}")
}