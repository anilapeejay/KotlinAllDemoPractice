package other
/*
* Pair is a generic class that represents a pair of two values.
*
* */
class PairDemo {
    fun getCoordinates() : Pair<Double, Int>{
        return Pair(23.34, 45)
    }
}

fun main(){
    val pair = Pair(2,"Kim")
    println("Result : ${pair.first} ${pair.second}")
    println()
    val pair1 = Pair("Kim", true)
    val pair2 = Pair("kim", listOf("2","3","4"))
    println("Result : ${pair1.first} ${pair1.second}")
    println()
    println("Result : ${pair2.first}")
    println()
    println("Result : ${pair2.second}")

    println()

    // using function return a pair
    val pair3 = PairDemo().getCoordinates()
    println("Result : ${pair3.first} ${pair3.second}")

}