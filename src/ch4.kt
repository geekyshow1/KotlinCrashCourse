/****** Constructor ******/
// Primary Constructor
class Human (name:String, age:Int){
//    Properties
    var hName:String
    var hAge:Int = age
    var gender:String = "Female"

//    Initializer Block
    init {
        hName = name
    }
//    Member Function
    fun disp(){
        println("Name = $hName")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}

fun main() {
    val h1 = Human("Sonam", 26)
    h1.disp()

    val h2 = Human("Rahul", 27)
    h2.disp()
}