/****** Inheritance *******/
open class Father{
//    Properties
    var car:String = "Alt 100"
    var money:Int = 1000

//    Member Function
    fun disp(){
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Son:Father(){
//    Properties
    var bike:String = "K 10"

//    Member Function
    fun show(){
        println("Son Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }
}

class Daughter :Father(){
//    Properties
    var bike:String = "KT9"

//    Member Function
    fun show(){
        println("Daughter Bike: $bike")
        println("Father Car: $car")
        println("Father Money: $money")
    }

}
fun main() {
    val s1 = Son()
    s1.show()
    s1.disp()
    s1.car = "ZSV"
    s1.money = 500
    s1.bike = "K80"
    s1.show()
    s1.disp()

    val d1 = Daughter()
    d1.show()
    d1.disp()

}