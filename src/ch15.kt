/****** Visibility Modifiers *******/
/* *
* private means visible inside this class only (including all its members).
* protected is the same as private but is also visible in subclasses.
* internal means that any client inside this module who sees the declaring class sees its internal members.
* public means that any client who sees the declaring class sees its public members.
* */

open class Father6{
//    Properties
    private var a:Int = 10
    protected var b:Int = 20
    internal var c:Int = 30
    var d:Int = 40

//    Member Function
    fun disp(){
        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
    }

    protected fun hello(){
        println("Hello Father")
    }
}

class Son6:Father6(){
//    Properties
    var bike:String = "K 10"

//    Member Function
    fun show(){
//        println("A: $a")        // Can't Access as its private
        println("B: $b")
        println("C: $c")
        println("D: $d")
        hello()
    }
}

fun main() {
    val s1 = Son6()
    s1.show()
    s1.disp()
//    s1.a = 101
//    s1.b = 102
    s1.c = 103
    s1.d = 104
    s1.show()
//    s1.hello()          // Can't Access as its protected

    val f1 = Father6()
//    f1.a = 110          // Can't Access as its private
//    f1.b = 111          // Can't Access as its Protected
//    f1.hello()          // Can't Access as It's Protected
}

//class Father private constructor(a:Int) {......}