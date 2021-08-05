/**** Super *****/
/****** Overriding Properties and Functions *******/
open class Father5{
    //    Properties
    open var car:String = "Alt 100"
    var money:Int = 1000

    //    Member Function
    open fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son5:Father5(){
    //    Properties
    var bike:String = "K 10"
    override var car:String = "BMW"
    var fcar:String = super.car
    //    Member Function
    fun show(){
        println("Son Bike: $bike")
        println("Son Car: $car")
        println("Father Car: $fcar")
        println("Father Money: $money")
    }

    override fun disp(){
        println("Son Class Disp")
    }
}

fun main() {
    val s1 = Son5()
    s1.show()
    s1.disp()

    val f1 = Father5()
    f1.disp()
}