package oops.inheritance.usingfinalkeyword

/*
* This a Base class of Vehical
* This contains methods speed, color and brand
* we will use final keyword before open keyword to make private and child class can not override this method
*
* */
open class Vehical {
    open fun speed(speed: Double){
        println("Vehical Speed : $speed")
    }
    
     open fun color(color: String){
        println("Vehical Color -- $color")
    }
    
    fun brand(name: String){
        println("Vehical Brand --- $name")
    }


    fun start(){
        println("Vehical Started")
    }

    fun stop(){
        println("Vehical Stopped")
    }

    fun run(){
        println("Vehical Running")
    }

    fun drive(){
        println("Vehical Driving")
    }

    fun park(){
        println("Vehical Parked")
    }

    fun turn(){
        println("Vehical Turned")
    }

    fun accelerate(){
        println("Vehical Accelerated")
    }

    fun brake(){
        println("Vehical Braked")
    }

    fun turnLeft(){
        println("Vehical Turned Left")
    }

    fun turnRight(){
        println("Vehical Turned Right")
    }

    fun reverse(){
        println("Vehical Reversed")
    }

    fun honk(){
        println("Vehical Honked")
    }

    fun refuel(){
        println("Vehical Refueled")
    }

    fun charge(){
        println("Vehical Charged")
    }

    fun recharge(){
        println("Vehical Recharged")
    }

    fun chargeBattery(){
        println("Vehical Battery Charged")
    }

    fun rechargeBattery(){
        println("Vehical Battery Recharged")
    }

    fun chargeEngine(){
        println("Vehical Engine Charged")
    }

    fun rechargeEngine(){
        println("Vehical Engine Recharged")
    }

    fun chargeCoolingSystem(){
        println("Vehical Cooling System Charged")
    }

    fun rechargeCoolingSystem(){
        println("Vehical Cooling System Recharged")
    }

    fun chargeRadiator(){
        println("Vehical Radiator Charged")
    }

    fun rechargeRadiator(){
        println("Vehical Radiator Recharged")
    }

    fun chargeExhaust(){
        println("Vehical Exhaust Charged")
    }

    fun rechargeExhaust(){
        println("Vehical Exhaust Recharged")
    }

    fun chargeSparkPlugs(){
        println("Vehical Spark Plugs Charged")
    }

    fun rechargeSparkPlugs(){
        println("Vehical Spark Plugs Recharged")
    }

    fun chargeAlternator(){
        println("Vehical Alternator Charged")
    }

    fun rechargeAlternator(){
        println("Vehical Alternator Recharged")
    }

    fun chargeTransmission(){
        println("Vehical Transmission Charged")
    }

    fun rechargeTransmission(){
        println("Vehical Transmission Recharged")
    }


}