/***** Getter and Setter *****/
class User(_id:Int, _name:String, _age:Int){

    val id:Int = _id
    get() = field

    var name:String = _name
    get() = field
    set(value){
        field = value
    }

    var age:Int = _age
    get() = field
    set(value){
        field = value
    }
}

fun main() {
    val u1 = User(1, "Sonam", 27)
    println(u1.id)  // get Property
    println(u1.name)  // get Property
    println(u1.age)  // get Property

    u1.name = "Rahul"
    u1.age = 29
    println(u1.name)  // get Property
    println(u1.age)  // get Property
}