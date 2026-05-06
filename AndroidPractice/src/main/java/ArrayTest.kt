class ArrayTest {

}
/*
* arrayOf if an array of specific type of array  int, string, boolean
* but can be used for all type of array
*
* */
fun main(){
    val arrInt = arrayOf(1,2)
    val arrInt1 = arrayOf<Int>(3,4) // specify type
    val arrStr = arrayOf("Kim","Anil")
    val arrBoolean = arrayOf(true,false)

    // Accessing Array Elements
    for (i in arrInt){
        println(i)
    }

}