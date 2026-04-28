package oops.inheritance.multilevelinheritance

// Level 2 Child class
class Puppy : Dog() {
    fun weep(){
        println("Puppy weep.")
    }

    override fun color() {
       // super.color() // uncomment this to call parent method color() from Dog class
        println("Puppy is of White color")
    }
}