package Exercise_04_SafeCallOperator

fun main(args: Array<String>){

    val opt: String? = null
    val mandatory: String = opt ?: "Default value"

    val other_opt: String?
    other_opt = "Nothing"
    val other_mand: String = other_opt


    println(mandatory)
    println(other_mand)
}