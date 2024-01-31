package Exercises_06_Classes


class shape(val x : String, val y : Int) {

    var perimeter = Double;

    fun getPerimeter(x: String, y: Int) : Double.Companion {
        perimeter = Double.also { y.toDouble() }
        return perimeter;
    }


}

var x = shape(x = "10", y = 10)

