package Exercise_04_SafeCallOperator

fun main(args: Array<String>){

    val a: Int? = null
    println(a?.dec())

    println("Error moment...")

    println(a!!.dec()) // Forcing error nullPointerException...
}