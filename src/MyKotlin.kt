/*** Calling Java from Kotlin ***/
fun main() {
    val obj = MyJava()
    obj.setValue(10)
    println(obj.getValue())
}