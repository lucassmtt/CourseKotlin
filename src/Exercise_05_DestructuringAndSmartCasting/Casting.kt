package Exercise_05_DestructuringAndSmartCasting

fun printConcept(grade: Any){
    when(grade as? Int){
        10, 9, 8 -> println("Approved!")
        5, 6, 7 -> println("You need help!")
        4, 3, 2, 1 -> println("You failed")
        else -> { println("Invalid number") }
    }
}


fun main(args: Array<String>){

    val testGrades = listOf(10, 8, 5, 2, 5, "5")

    for ((idx, value) in testGrades.withIndex()){
        println("Student: $idx, Grade: $value")
        printConcept(value)
    }
}