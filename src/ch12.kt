/****** Inheritance with Primary and Secondary Constructor *******/
open class Father3(_car:String, _money:Int){
    //    Properties
    var car:String = _car
    var money:Int = _money

    //    Member Function
    fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son3:Father3{
    //    Properties
    var bike:String

    //    Secondary Constructor
    constructor(_car:String, _money:Int, bike:String):super(_car, _money){
        this.bike = bike
    }

    //    Member Function
    fun show(){
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

fun main() {
    val s1 = Son3("Alt 100", 1000, "K10")
    s1.show()
    s1.disp()
    s1.car = "ZSV"
    s1.money = 500
    s1.bike = "K80"
    s1.show()
}