package oops.interfacee.realexample

// Class implementing interfaces
class SmartPhone: Camera, MusicPlayer {
    override fun takePhoto() {
        println("Taking photo from Smart Phone")
    }

    override fun playMusic() {
        println("Music is playing from Smart Phone")
    }
}