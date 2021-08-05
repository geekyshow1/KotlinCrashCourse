/****** Data Class ********/
// Where you need to create a class solely to hold data

data class Employee(val name:String, val age:Int)

fun main() {
    val emp = Employee("Sonam", 26)
    println(emp.name)
    println("Name: ${emp.name}")
    println("Age: ${emp.age}")
    println(emp)
    println(emp.toString())

//    Destructuring
    val(name, age) = emp
    println("Name: $name")
    println("Age: $age")

}