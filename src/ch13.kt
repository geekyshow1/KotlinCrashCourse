/****** Overriding Properties and Functions *******/
open class Father4{
    //    Properties
    open var car:String = "Alt 100"
    var money:Int = 1000

    //    Member Function
    open fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son4:Father4(){
    //    Properties
    var bike:String = "K 10"
    override var car:String = "BMW"

    //    Member Function
    fun show(){
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }

    override fun disp(){
        println("Son Class Disp")
    }
}

fun main() {
    val s1 = Son4()
    s1.show()
    s1.disp()

    val f1 = Father4()
    f1.disp()
}