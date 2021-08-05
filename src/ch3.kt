/****** Constructor ******/
// Primary Constructor
class Person constructor(val name:String, val age:Int)  {

//    Properties
    var gender:String = "Female"

//    Member Function
    fun disp(){
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }
}

fun main() {
    val p1 = Person("Sonam", 27)
    p1.disp()
    println(p1.name)
    println(p1.age)
    println(p1.gender)
    val p2 = Person("Rahul", 29)
    p2.gender = "Male"
    p2.disp()
    println(p2.name)
    println(p2.age)
    println(p2.gender)
}