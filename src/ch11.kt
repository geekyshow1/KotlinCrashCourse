/****** Inheritance with Secondary Constructor *******/
open class Father2{
//    Properties
    var car:String
    var money:Int

//    Secondary Constructor
    constructor(car:String, money:Int){
        this.car = car
        this.money = money
    }

//    Member Function
    fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son2:Father2{
    //    Properties
    var bike:String

    //    Secondary Constructor
    constructor(car:String, money:Int, bike:String):super(car, money){
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
    val s1 = Son2("Alt 100", 1000, "K10")
    s1.show()
    s1.disp()
    s1.car = "ZSV"
    s1.money = 500
    s1.bike = "K80"
    s1.show()
}