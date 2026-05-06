package collection.mutable

/*
* MutableList is interface and extend List for mutable
* can add or modify
*
* MutableList is ordered and have duplicate elements
* use mutableListOf() for mutable list
* */
class MutableList
fun main(){
    val list = mutableListOf(1,2,3)
    val name = mutableListOf("Anil","Rahul","Kim")
    val mix = mutableListOf(24, "Kim", true)


    // Accessing elements in list
    for (items in list){
        println(items)
    }

    // Modify list - add element
    list.add(1,5)
    println()
    // Accessing elements in list after modifying
    for (items in list){
        println(items)
    }

    // Modify list - remove element
    list.remove(2)
    println()
    // Accessing elements in list after modifying
    for (items in list){
        println(items)
    }

}