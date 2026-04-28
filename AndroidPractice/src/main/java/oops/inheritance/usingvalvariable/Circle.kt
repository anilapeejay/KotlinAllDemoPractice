package oops.inheritance.usingvalvariable

class Circle : Shape() {
    override val area: Int
        get() = 30
}

fun main() {
    val circle = Circle()
    println("Area of the circle: ${circle.area}")
}