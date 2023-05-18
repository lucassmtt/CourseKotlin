fun main(){


    open class Shape

    open class Rectangle(var height: Int, var width: Int) : Shape() {
        var perimeter = (height * width) * 2
    }

    val rectangle = Rectangle(5, 10)
    println(rectangle.perimeter)


    class CloseRectangle : Rectangle(10, 10)

    for (a : Int = 10,  )
}