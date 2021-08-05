import java.util.*

/****** Main Function *****/
//An entry point of a Kotlin application is the main function
fun main(){
    print("Hello Kotlin")
}
//fun main(args:Array<String>){
//    print("Hello Kotlin")
//}

/**** Comment *****/
// Single Line Comment
/*
Multi Line
Comment
* */
//fun main() {
//    print("Hello Kotlin")       // This is print
//}

/****** Data Type ******/
//Int - 10, 20, 100
//Long - 234234554L, 9465654L
//Float - 142.34f, 1.2f
//Double - 43435435.423, 1.2
//Char - 'M', 'F'
//String - "Hello", "Hello Kotlin", "123456"
//Boolean - true, false

/***** Variable ******/
// # var - Variables that can be reassigned
// ## Dynamic Type
//fun main() {
//    var roll = 10
//    var mobileNumber = 990000000L
//    var price = 80.25f
//    var totalCost = 234234.465
//    var gender = 'F'
//    var name = "Sonam"
//    var isActive = true
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(gender)
//    println(name)
//    println(isActive)
//
//    println("*************")
//
//    roll = 101
//    mobileNumber = 8800000000L
//    price = 45.25f
//    totalCost = 10000.25
//    gender = 'M'
//    name = "Rahul"
//    isActive = false
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(name)
//    println(gender)
//    println(isActive)
//}

// ## Specific Type
//fun main() {
//    var roll:Int = 10
//    var mobileNumber:Long = 990000000L
//    var price:Float = 80.25f
//    var totalCost:Double = 234234.465
//    var gender:Char = 'F'
//    var name:String = "Sonam"
//    var isActive:Boolean = true
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(gender)
//    println(name)
//    println(isActive)
//
//    println("*************")
//
//    roll = 101
//    mobileNumber = 8800000000L
//    price = 45.25f
//    totalCost = 10000.25
//    gender = 'M'
//    name = "Rahul"
//    isActive = false
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(name)
//    println(gender)
//    println(isActive)
//
//}

// # val - Read-only local variables are defined using the keyword val. They can be assigned a value only once.
// ## Dynamic Type
//fun main() {
//    val roll = 10
//    val mobileNumber = 990000000L
//    val price = 80.25f
//    val totalCost = 234234.465
//    val gender = 'F'
//    val name = "Sonam"
//    val isActive = true
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(gender)
//    println(name)
//    println(isActive)
//
//}

// ## Specific Type
//fun main() {
//    val roll:Int = 10
//    val mobileNumber:Long = 990000000L
//    val price:Float = 80.25f
//    val totalCost:Double = 234234.465
//    val gender:Char = 'F'
//    val name:String = "Sonam"
//    val isActive:Boolean = true
//
//    println(roll)
//    println(mobileNumber)
//    println(price)
//    println(totalCost)
//    println(gender)
//    println(name)
//    println(isActive)
//
//}

/****** Print Function *******/
// print()
//fun main() {
//    print(" Hello Kotlin ")
//    print(10)
//    print(10 + 20)
//    val a = 10
//    print(a)
//    print(" Value is " + a)
//    print(" Value is $a ")
//    val b = 20
//    print(" Numbers are $a and $b")
//    print(a+b)
//    print(" Addition ${a+b}")
//    print(" Addition ${a+b+20}")
//}

// println()
//fun main() {
//    println(" Hello Kotlin ")
//    println(10)
//    println(10 + 20)
//    val a = 10
//    println(a)
//    println(" Value is " + a)
//    println(" Value is $a ")
//    val b = 20
//    println(" Numbers are $a and $b")
//    println(a+b)
//    println(" Addition ${a+b}")
//    println(" Addition ${a+b+20}")
//}

/***** Arithmetical Operators ******/
//fun main() {
//    val a = 5
//    val b = 2
//    println(a + b)
//    println(a - b)
//    println(a * b)
//    println(a / b)
//    println(a % b)
//    println(b..a)
//    for (i in b..a){
//        println(i)
//    }
//}

/***** Comparison Operators ******/
//fun main() {
//    val a = 5
//    val b = 2
//    println(a > b)
//    println(a < b)
//    println(a >= b)
//    println(a <= b)
//}

/***** Equality & Inequality Operators ******/
//fun main() {
//    val a = 5
//    val b = 2
//    println(a == b)
//    println(a != b)
//}

/***** Logical Operators ******/
//fun main() {
//    val a = 30
//    val b = 20
//    val c = 10
//    println((a > b) && (b > c))     // True
//    println((a > b) && (b < c))     // False
//    println((a < b) && (b > c))     // False
//    println((a < b) && (b < c))     // False
//
//    println((a > b) || (b > c))     // True
//    println((a > b) || (b < c))     // True
//    println((a < b) || (b > c))     // True
//    println((a < b) || (b < c))     // False
//
//    println(!(a < b))       // True
//    println(!(a > b))       // False
//}

/***** Increment and Decrement Operators *****/
//fun main() {
//    var a = 5
//    println(++a)
//    println(a)
//    println(a++)
//    println(a)
//
//    println(--a)
//    println(a)
//    println(a--)
//    println(a)
//
//}

/******* Augmented Assignments *******/
//fun main() {
//    var a = 10
//    a += 5
//    a -= 5
//    a *= 5
//    a /= 5
//    a %= 5
//    println(a)
//}

/****** User Input ******/
// # Using readLine()
//fun main() {
//    val name = readLine()
//    val name: String? = readLine()
//    println(name)
//    println(name!!::class.simpleName)
//
//    print("Enter Your Name: ")
//    val name = readLine()
//    println("Name: $name")
//    println(name!!::class.simpleName)
//
//    print("Enter Your Roll: ")
//    val roll = readLine()!!.toInt()
//    println("Roll: $roll")
//    println(roll::class.simpleName)
//
//    print("Enter Your Fee: ")
//    val fee = readLine()!!.toFloat()
//    println("Fee: $fee")
//    println(fee::class.simpleName)
//
//}

// # Using Scanner Class
//fun main() {
//    val scanner = Scanner(System.`in`)
//    val name = scanner.next()
//    println(name)
//    println(name::class.simpleName)
//
//    print("Enter Your Name: ")
//    val name = scanner.next()
//    println("Name: $name")
//    println(name!!::class.simpleName)
//
//    print("Enter Your Roll: ")
//    val roll = scanner.nextInt()
//    println("Roll: $roll")
//    println(roll::class.simpleName)
//
//    print("Enter Your Fee: ")
//    val fee = scanner.nextFloat()
//    println("Fee: $fee")
//    println(fee::class.simpleName)
//}

/***** String ******/
/*Strings are immutable. Once you initialize a string, you can't change its value or assign a new value to it. All
operations that transform strings return their results in a new String object, leaving the original string unchanged.
*/

//fun main() {
//    val str = "Hello"
//    println(str)
//    println(str[0])
//    println(str[1])
//    println(str[2])
//    println(str[3])
//    println(str[4])
//    println("Hello 123")
//}

// # String Concatenation
//fun main() {
//    val str1 = "Hello"
//    val str2 = " Kotlin"
//    println(str1 + str2)
//    println("This is " + str1 + str2)
//    println("100" + 50)
////    println(50 + "100")     // Wrong
//}

// # String Literals
// ## Escaped String
//fun main() {
//    println("Hello\nWorld")
//    println("Hello\tWorld")
//}

// ## Raw String
//fun main() {
//    val message = """ Dear sir/Madam,
//             I would like to request\n you kindly watch my youtube videos.""".trimIndent()
//    print(message)
//}

// # String Templates
//fun main() {
//    val str = "Kotlin"
//    println(str)
//    println("This is " + str)
//    println("This is $str")
//    val cart = 10
//    println("Cart = $cart")
//
//    val str1 = "Hello"
//    val str2 = " Kotlin"
//    println("This is $str1 $str2")
//
//    val a = 10
//    val b = 20
////    println("Addition = $a + $b")       // Wrong
//    println("Addition = ${a + b}")
//    println("Addition = ${a + b + 50}")
//
//    val name = "sonam"
//    println("Hello are you $name ?")
//    println("Hello are you ${name.uppercase()} ?")
//}

/******* if Expression - if is an expression: it returns a value. ********/
//fun main() {
//    if(10 > 5){
//        println("This is If Expression")
//    }
//    if(10 < 5){
//        println("This is If Expression")
//    }
//
//    val a = 20
//    val b = 10
//    var max = 0
//    if(a < b) max = a
//    println(max)
//
//    if(a > b){
//        println("This is Kotlin if expression")
//        println("Max number is $a")
//    }
//}

/**** if else ******/
//fun main() {
//    if(10 < 5){
//        println("Inside If")
//    } else {
//        println("Inside Else")
//    }
//
//    val a = 20
//    val b = 10
//    var max = 0
//    if(a > b){
//        println("A = $a")
//    }else{
//        println("B = $b")
//    }
//    if(a < b){
//        max = a
//    } else {
//        max = b
//    }
//    println(max)
//
//    max =  if(a > b){
//        a
//    } else {
//        b
//    }
//    println(max)
//
//    max =  if(a < b) a else b
//    println(max)
//}

/***** when Expression *****/
//fun main() {
//    val x = 4
//    when(x){
//       1 -> print("One")
//       2 -> print("Two")
//       3 -> print("Three")
//       4 -> print("Four")
//       5 -> print("Five")
//        else -> print("Not Valid")
//    }
//
//    when(x){
//       1, 2 -> print("One or Two")
//       3 -> print("Three")
//       4 -> print("Four")
//       5 -> print("Five")
//        else -> print("Not Valid")
//    }
//
//    when(x){
//       1, 2 -> {
//           print("One")
//           print(" Two")
//       }
//       3 -> print("Three")
//       4 -> print("Four")
//       5 -> print("Five")
//        else -> print("Not Valid")
//    }
//
//    when(x){
//       in 1..4 -> {
//           print("One")
//           print(" Two")
//           print(" Three")
//           print(" Four")
//       }
//       5 -> print("Five")
//        else -> print("Not Valid")
//    }
//
//    when("Sat"){
//        "Sunday", "Sat" -> print("Holiday")
//        "Monday" -> print("Work Day")
//    }
//}

/***** for Loop ******/
// Syntax:- for( item in collection) print(item)
//fun main() {
//    for(item in 1..5) println(item)
//
//    for(item in 1..5) {
//        print("Step: ")
//        println(item)
//    }
//
//    for(item in 5 downTo 1) {
//        print("Step: ")
//        println(item)
//    }
//}

/***** while Loop *****/
//fun main() {
//    var x = 0
//    while (x < 5){
//        x++
//        println(x)
//    }
//
//    while(true){
//        println("Awlays True")
//    }
//}

/***** do while Loop *****/
//fun main() {
//    var x = 0
//    do{
//        x++
//        println(x)
//    } while(x < 5)
//
//    do{
//        x++
//        println(x)
//    } while(true)
//}

/***** Break and Continue *****/
//fun main() {
//    var x = 0
//    while(x < 10){
//        x++
//        if(x == 5) break
//        println(x)
//    }
//    while(x < 10){
//        x++
//        if(x == 5) continue
//        println(x)
//    }
//}

/****** Function - Kotlin functions are declared using the fun keyword ******/
// # Function Without Parameters
//fun main() {
//    disp()      // Calling Function
//    val total = add()
//    println(total)
//    val multiplication = multi()
//    println(multiplication)
//    println("After Function")
//
//}
//
//fun disp(){
//    println("Hello Kotlin")
//}
//
//fun add(): Int {            // Return type Int
//    val a = 10
//    val b = 20
//    return (a+b)
//}
//fun multi(): String {            // Return type String
//    val a = 10
//    val b = 20
//    return ("Multiplication = ${a*b}")
//}

// # Function With Parameters
//fun main() {
//    disp(10, 20)      // Calling Function
//    val total = add(10, 20)
//    val total1 = add(20, 50)
//    println(total)
//    println(total1)
//    val multiplication = multi(10, 20)
//    println(multiplication)
//    println("After Function")
//
//}
//
//fun disp(x:Int, y:Int){
//    println("Values are $x and $y")
//}
//
//fun add(x:Int, y:Int): Int {            // Return type Int
//    val a = x
//    val b = y
//    return (a+b)
//}
//fun multi(x:Int, y:Int): String {            // Return type String
//    return ("Multiplication = ${x*y}")
//}

// # Function With Default Argument
//fun main() {
//    val total = add(10)
//    println(total)
//}
//
//fun add(x:Int, y:Int = 50):Int{
//    return (x+y)
//}

// # Function With Named Argument
//fun main() {
//    val total = add(y = 10, x = 20)
//    println(total)
//}
//fun add(x:Int, y:Int) : Int {
//    println("X = $x")
//    println("Y = $y")
//    return (x+y)
//}

// # Higher Order Function
//fun main() {
//    hOF(10, 20, ::add)
//}
//fun add(a:Int, b:Int):Int{
//    return a +b
//}
//fun hOF(a:Int, b:Int, callback:(Int, Int) -> Int ){
//    println(callback(a, b))
//}

// # Lambda Expression
//fun main() {
//    val add = { a:Int, b:Int ->  a + b}
//    println(add(10,20))
//
//    val sum:(Int, Int) -> Int = {a,b -> a + b}
//    println(sum(20, 40))
//    hOF(10, 20, { a:Int, b:Int -> a + b })
//    hOF(10, 20) { a:Int, b:Int -> a + b }
//}
//
//fun hOF(a:Int, b:Int, callback:(Int, Int) -> Int ){
//    println(callback(a, b))
//}

// # Anonymous Function
//fun main() {
//    val add = fun(a:Int, b:Int):Int{
//        return a + b
//    }
//    println(add(10, 20))
//
//    val disp = fun(){
//        println("Hello")
//        println("Kotlin")
//    }
//    disp()
//}

/******* Null Safety ********/
//fun main() {
//    var name1: String = "Sonam"      // Non-Null by default
////    name1 = null                   // Null Not Allowed
//
//    var name2: String? = "RahulKumar"      // Allow Null
////    name2 = null                  // Null Allowed
//
//    val name1Length = name1.length
//    println(name1Length)
//
//    val name2Length = name2.length
//    println(name2Length)
//
////    Option 1 : Check Null in Conditions
////    val name2Length = if (name2 != null) name2.length else -1
////    println(name2Length)
//
////    Option 2: Safe Call
////    val name2Length = name2?.length
////    println(name2Length)
//
////    Option 3: The !! Operator
//    // The not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
////    val name2Length = name2!!.length
////    println(name2Length)
//
//}

/****** Array ******/
// # arrayOf()
//fun main() {
//    val data = arrayOf("Sonam", "Rahul", "Sumit", 100, 'M')
//    println(data[0])
//    println(data[1])
//    println(data[2])
//    println(data[3])
//    println(data[4])
//    for (item in data){
//        println(item)
//    }
//
//    val names = arrayOf<String>("Sonam", "Rahul", "Sumit")
//    println(names[0])
//    println(names[1])
//    println(names[2])
//    for (item in names){
//        println(item)
//    }
//    names[2] = "Kunal"
//    for (item in names){
//        println(item)
//    }
//
//    names.set(1, "Jay")
//    for (item in names){
//        println(item)
//    }
//
//    val nm = names[0]
//    println(nm)
//
//    val nm = names.get(0)
//    println(nm)
//
////    Loop Array and their Index
//    for (name in names){
//        println(name)
//    }
//    for (i in names.indices){
//        println(i)
//    }
//    for (i in names.indices){
//        println("$i = ${names[i]}")
//    }
//
//    println(names.size)
//    val s = names.size
//    for (i in 0..s-1){
//        println("$i = ${names[i]}")
//    }
//
//    names.forEach{name -> println(name)}
//}

// # Array() Constructor
//fun main() {
//    val roll = Array(5, { i -> i * 2})
//    for (rl in roll){
//        println(rl)
//    }
//}

// # Built-in Methods
//fun main() {
//    val roll = intArrayOf(101, 102, 103)
//    for (rl in roll){
//        println(rl)
//    }
//    val gender = charArrayOf('M', 'F')
//}

/******* User Input Array ******/
//fun main() {
//    print("Enter Number of Student: ")
//    val num = readLine()!!.toInt()
//    println("Enter Student Name: ")
//    val students = Array(num){readLine()!!}
//    for (student in students){
//        println(student)
//    }
//}

/******* List *********/
// List is an ordered collection with access to elements by indices – integer numbers that reflect their position. Elements can occur more than once in a list.
//fun main() {
//    val data = listOf("Sonam", "Rahul", "Sumit", 100, 'M', "Sonam")
//    println(data)
//    println(data[0])
//    println(data[1])
//    println(data[2])
//    println(data[3])
//    println(data[4])
//    println(data[5])
//    println(data.get(4))
//    for (dt in data){
//        println(dt)
//    }

    //    Loop Array and their Index
//    for (dt in data){
//        println(dt)
//    }
//    for (i in data.indices){
//        println(i)
//    }
//    for (i in data.indices){
//        println("$i = ${data[i]}")
//    }
//
//    println(data.size)
//    val s = data.size
//    for (i in 0..s-1){
//        println("$i = ${data[i]}")
//    }
//
//    data.forEach{dt -> println(dt)}

//    val names = listOf<String>("Sonam", "Rahul", "Sumit", "Sonam")
//    println(names)

//    val data = mutableListOf("Sonam", "Rahul", "Sumit", 100, 'M', "Sonam")
//    println(data)
//    println(data[0])
//    println(data[1])
//    println(data[2])
//    println(data[3])
//    println(data[4])
//    println(data[5])
//    println(data.get(4))
//    for (dt in data){
//        println(dt)
//    }

//    println(data.size)

//    data[0] = "Jay"         // Update
//    println(data)

//    data.add(6, "Jack")         // Add
//    println(data)
//
//    println(data.size)

//    data.removeAt(1)        // Remove
//    println(data)
//    println(data.size)

//    val names = mutableListOf<String>("Sonam", "Rahul", "Sumit", "Sonam")
//    println(names)
//}

/******* User Input List ******/
//fun main() {
//    print("Enter Number of Student: ")
//    val num = readLine()!!.toInt()
//    println("Enter Student Name: ")
//    val students = List<String>(num){readLine()!!}
//    for (student in students){
//        println(student)
//    }
//}

/******* Set *********/
// Set is a collection of unique elements. It reflects the mathematical abstraction of set: a group of objects without repetitions. Generally, the order of set elements has no significance.
//fun main() {
//    val data = setOf("Sonam", "Rahul", "Sumit", 100, 'M', "Sonam", "Rahul")
//    println(data)
//    for (dt in data){
//        println(dt)
//    }
//    println(data.size)

//    val names = setOf<String>("Sonam", "Rahul", "Sumit", "Sonam", "Rahul")
//    println(names)

//    val data = mutableSetOf("Sonam", "Rahul", "Sumit", 100, 'M', "Sonam", "Rahul")
//    println(data)
//    for (dt in data){
//        println(dt)
//    }
//    data.add("Kunal")
//    println(data)

//    data.remove("Sumit")
//    println(data)

//    val names = mutableSetOf<String>("Sonam", "Rahul", "Sumit", "Sonam", "Rahul")
//    println(names)
//}

/******* Map or Dictionary *********/
// Map (or dictionary) is a set of key-value pairs. Keys are unique, and each of them maps to exactly one value. The values can be duplicates. Maps are useful for storing logical connections between objects, for example, an employee's ID and their position.
//fun main() {
//    val data = mapOf(1 to "Sonam", "key2" to "Sumit", "key3" to "Rahul", "key4" to 100)
//    println(data)
//    println(data[1])
//    println(data["key2"])
//    println(data["key3"])
//    println(data.get(1))

//    println(data.keys)
//    println(data.values)

//    println("All Keys: ${data.keys}")
//    for (key in data.keys){
//        println(key)
//    }

//    println("All Values: ${data.values}")
//    for (value in data.values){
//        println(value)
//    }

//    for (key in data.keys){
//        println("$key = ${data[key]}")
//    }

//    println(data.size)

//    val names = mapOf<String, String>("key1" to "Sonam", "key2" to "Sumit", "key3" to "Rahul")
//    println(names)

//        val data = mutableMapOf(1 to "Sonam", "key2" to "Sumit", "key3" to "Rahul", "key4" to 100)
//    println(data)
//    println(data[1])
//    println(data["key2"])
//    println(data["key3"])
//    println(data.get(1))

//    for (key in data.keys){
//        println("$key = ${data[key]}")
//    }

//    println(data.size)

//    val names = mutableMapOf<String, String>("key1" to "Sonam", "key2" to "Sumit", "key3" to "Rahul", "key4" to
//            "Sameer")
//    println(names)
//    names["key2"] = "Jay"       // Update
//    println(names)

//    names["key5"] = "Sonal"     // Add
//    println(names)

//    names.put("key3", "Kunal")      // Update
//    println(names)

//    names.remove("key1")            // Remove
//    println(names)

//    names.keys.remove("key1")       // Remove
//    println(names)

//    names.values.remove("Sameer")       // Remove
//    println(names)
//}
