package Exercise_05_DestructuringAndSmartCasting

fun smart(x: Any){
    when (x) {
        is String -> { println("IS String == $x") }
        is Int -> { println("IS Int == $x") }
        is Boolean -> { println("IS Boolean == $x") }
        is Double -> { println("IS double == $x") }
        else -> { println("Other") }
    }
}

class Car(wheel: Int, door: Double)

var myCar = Car(10, 10.0)

fun main(args: Array<String>){

    smart("a")
    smart(1)
    smart(true)
    smart(2.0)
    smart(myCar)
}