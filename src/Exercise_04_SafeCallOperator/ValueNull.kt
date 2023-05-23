package Exercise_04_SafeCallOperator

fun main(args: Array<String>) {
    val a: Int? = null // Can take the null value / Safe call operator

    println(a?.dec())
}