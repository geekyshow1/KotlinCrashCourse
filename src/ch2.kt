/****** Class and Object ******/
// Creating Class
class Mobile{
//    Properties
    var model: String = "100K"
    var price:Float = 1234.45F

//    Member Function
    fun disp(){
        println("Model = $model")
        println("Price = $price")
    }
}

fun main() {
    val lg = Mobile()       // Creating Object
    lg.disp()               // Calling Function Member using Object
    lg.model = "LG K10"     // Accessing Properties using Object
    lg.price = 3000.45f     // Accessing Properties using Object
    lg.disp()               // Calling Function Member using Object

    val realme = Mobile()       // Creating Object
    realme.model = "RealMe 2"    // Accessing Properties using Object
    realme.price = 32434.23f    // Accessing Properties using Object
    realme.disp()               // Calling Function Member using Object
}