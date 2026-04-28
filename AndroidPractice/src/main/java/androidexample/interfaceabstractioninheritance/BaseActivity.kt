package androidexample.interfaceabstractioninheritance

abstract class BaseActivity {
    fun showLoader(){
        println("Showing Loader")
    }
    abstract fun initUI()

}