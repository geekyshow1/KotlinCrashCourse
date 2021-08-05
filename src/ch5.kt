/****** Constructor ******/
// Secondary Constructor
class People{
//    Properties
    var name:String
    var hAge: Int
    var gender:String = "Female"

//    Secondary Constructor
    constructor(name:String, age:Int){
        println("Constructor Called")
        this.name = name
        hAge = age
    }

//    Member Function
    fun disp(){
        println("Name = $name")
        println("Age = $hAge")
        println("Gender = $gender")
    }
}

fun main() {
   val p1 = People("Sonam", 28)
    p1.disp()
    println(p1.name)
    println(p1.hAge)
    println(p1.gender)
}