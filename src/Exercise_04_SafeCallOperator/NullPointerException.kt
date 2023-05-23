package Exercise_04_SafeCallOperator

fun main(args: Array<String>){

    var a: Int? = null
    println(a?.dec())

    println("Error moment...")

    println(a!!.dec()) // Forcing error nullPointerException...
}