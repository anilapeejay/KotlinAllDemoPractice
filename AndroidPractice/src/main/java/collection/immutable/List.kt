package collection.immutable

/*
* List is interface for immutable
* can't add or modify once created
*List is ordered and have duplicate elements
* use listOf() for immutable list
*
* */
class List
fun main(){
    val list = listOf(1,2,3)
    val age = listOf<Int>(23,24) // use type for list of int
    val listMix = listOf(1,"Kim",true)
    val students = listOf("Kim","Anil")

    // try to modify list or remove will not work

    // Accessing elements in list
    for (items in list){
        println(items)
    }

    listMix.forEach { println(it) }

}