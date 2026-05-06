package collection.immutable

/*
* Set is interface for immutable
* can't add or modify once created
* Set is unordered and doesn't have duplicate elements
* use setOf() for immutable set
* */
class Set

fun main(){
    val set = setOf(1,2,5,8,1) // set with duplicate values

    set.forEach {
        println(it)
    }

    println()
    val name = setOfNotNull("Kim","Anil","Kim") // set with duplicate values
    name.forEach {
        println(it)
    }
}
