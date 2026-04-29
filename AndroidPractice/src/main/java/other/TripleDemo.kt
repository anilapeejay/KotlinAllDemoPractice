package other

/*
* Triple is a generic class that represents a triplet of three values.
* data class Triple<out A, out B, out C>(val first: A, val second: B, val third: C)
* */
class TripleDemo {

    // return a triple of student data using function getStudentData()
    fun getStudentData() : Triple<Int, String, Boolean>{
        return Triple(34, "Anil", true)
    }

    // return a triple of api response using function getApiResponse()
    fun getApiResponse() : Triple<Int, String, Boolean>{
        val responseMessage = "Success"
        val responseCode = 200
        val isSuccess = true
        return Triple(responseCode, responseMessage, isSuccess)
    }

}

fun main(){
    val triple = Triple(2, "Kim", true) // take 3 values, any kind of data type
    println("Result : ${triple.first} ${triple.second} ${triple.third}") // accessing elements of triple

    val data = Triple(listOf(2,3,4), listOf("Anil",2,true), listOf(false, "Rahul"))
    println("Result : ${data.first}")
    println()
    println("Result : ${data.second}")
    println()
    println("Result : ${data.third}")
    println()
    val student = TripleDemo()
    println("Result : ${student.getStudentData().first} ${student.getStudentData().second} ${student.getStudentData().third}")

    println()
    val apiResponse = TripleDemo().getApiResponse()
    println("Result : ${apiResponse.first} ${apiResponse.second} ${apiResponse.third}")

    println()
    val person = listOf(Triple(24, "Anil", "Agra"),
        Triple(28, "Rahul", "Kanpur"),
        Triple(34, "Rajesh", "Delhi"))

    for (items in person)
        println("Result : ${items.first} ${items.second} ${items.third}")

}