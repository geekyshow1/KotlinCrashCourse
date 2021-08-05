/****** Interface *******/
interface Father8{
//    Properties
    var car:String      // Abstract Property

//    Member Function
    fun disp(){
        println("Father Car: $car")
    }

    fun hello()     // Abstract Method
}

class Son8: Father8{
//    Propeties
    var bike:String = "K10"

    // Implementing Father's Abstract Property
    override var car:String = "ALt 100"

    //    Member Function
    fun show() {
        println("Father car: $car")
    }

    //    Implementation of Father's Abstract Method
    override fun hello(){
        println("Father's Abstract Method Hello")
    }
}

fun main() {
    val s1 = Son8()
    s1.show()
    s1.disp()
    s1.hello()
}