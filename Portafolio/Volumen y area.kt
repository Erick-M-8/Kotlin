const val base= 10f
const val altura= 5f
const val ancho= 5f

fun main(){
    val area = areaRectangulo(base,altura)
    val volumen = volumen(ancho)
    println("El area del rectangulo es: $area")
    print("El volumen del prisma es: $volumen")
}
fun areaRectangulo(base:Float, altura:Float):Float{
    return base*altura
}
fun volumen(ancho:Float):Float{
    return areaRectangulo(base,altura)*ancho
}