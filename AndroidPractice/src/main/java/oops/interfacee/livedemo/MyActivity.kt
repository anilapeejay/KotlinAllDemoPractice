package oops.interfacee.livedemo

class MyActivity : OnButtonClickListener {
    fun onCreate(savedInstanceState: Any?) {
        // Mocking button click
        onButtonClicked()
    }

    override fun onButtonClicked() {
        println("Button is clicked")
    }
}
