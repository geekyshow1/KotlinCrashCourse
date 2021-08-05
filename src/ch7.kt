/****** Constructor ******/
// Primary & Secondary Constructor
class Registration1(_email:String, _password:String){
    //    Properties
    var name:String = ""
    var age:Int? = null
    var email:String
    var password:String
    var gender:String = "Female"
    //    Secondary Constructor
    constructor(name:String, age:Int, _email:String, _password:String):this(_email, _password) {
        this.name = name
        this.age = age
    }
    //    Initializer Block
    init{
        password = _password
        email = _email
    }
    //    Member Function
    fun disp() {
        println("Name = $name")
        println("Age = $age")
        println("Email = $email")
        println("Password = $password")
        println("Gender = $gender")
    }
}

fun main() {
    val user1 = Registration1("Sonam", 26, "sona@gmail.com", "1234556")
    user1.disp()
}