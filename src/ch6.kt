/****** Constructor ******/
// Primary & Secondary Constructor
class Registration(email:String, password:String){
//    Properties
    var hName:String = ""
    var hAge:Int? = null
    var hEmail:String = email
    var hPassword:String
    var gender:String = "Female"
//    Secondary Constructor
    constructor(name:String, age:Int, email:String, password:String):this(email, password) {
        hName = name
        hAge = age
    }
//    Initializer Block
    init{
    hPassword = password
    }
//    Member Function
    fun disp() {
        println("Name = $hName")
        println("Age = $hAge")
        println("Email = $hEmail")
        println("Password = $hPassword")
        println("Gender = $gender")
    }
}

fun main() {
    val user1 = Registration("Sonam", 26, "sona@gmail.com", "1234556")
    user1.disp()
}