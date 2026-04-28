package androidexample.interfaceabstractioninheritance

class MyActivity : BaseActivity(), ClickListener {
    override fun initUI() {
        println("Initializing UI")
    }

    override fun onClick() {
        println("Button clicked")
    }
}

fun main(){
    val myActivity = MyActivity()
    myActivity.initUI()
    myActivity.onClick()
}