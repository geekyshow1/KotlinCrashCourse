/****** Exception Handling ********/
fun main() {
    val result = try {
        val a = 10/0
        a
    }catch (e:Exception){
        e.message
    } finally {
        println("Always Executes")
    }
    println(result)
}