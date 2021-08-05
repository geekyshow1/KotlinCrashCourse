/****** Inheritance with Primary Constructor *******/
open class Father1(_car:String, _money:Int){
    //    Properties
    var car:String = _car
    var money:Int = _money

    //    Member Function
    fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son1(_car:String, _money:Int, _bike:String):Father1(_car, _money){
    //    Properties
    var bike:String = _bike

    //    Member Function
    fun show(){
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

fun main() {
    val s1 = Son1("Alt 100", 1000, "K10")
    s1.show()
    s1.disp()
    s1.car = "ZSV"
    s1.money = 500
    s1.bike = "K80"
    s1.show()
}