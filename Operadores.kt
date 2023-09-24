/*Operadores*/

const val x1 = 4.00f
const val y1 = 3.00f
const val x2 = -3.00f
const val y2 = -2.00f
var m = 0.00f

fun main() {
    calcular_pendiente(x1,x2,y1,y2)
    println("El valor de la pendiente es: $m")
}

fun calcular_pendiente(x1:Float, x2:Float, y1:Float, y2:Float):Float{
    m = (y2-y1)/(x2-x1)
    return m
}
