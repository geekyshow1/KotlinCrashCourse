/****** Abstract Class and Abstract Method *******/
abstract class Father7{
    //    Properties
    var car: String = "Alt 100"

    //    Member Function
    fun disp() {
        println("Father car: $car")
    }

    //    Abstract Method
    abstract fun hello()
}

class Son7:Father7(){
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
    val s1 = Son7()
    s1.show()
    s1.disp()
    s1.hello()

//    val f1 = Father7()      // Can't create object of Abstract Class
//    f1.disp()
}
