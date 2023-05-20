package Exercise_03_CoditionsAndLoops

fun main(){
    val x : Int = 1

    when (x){
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("X is neither 1 nor 2.")
        }
    }
    print("\n-----------------\n")
    val y : String = "Rice"

    when (y){
        "Noodle" -> print("y is noodle")
        "Rice"   -> print("y is rice")

        else -> {
            print("No is noddle or rice.")
        }
    }
}

