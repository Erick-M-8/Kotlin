fun main(){
    imprimir("Reemplazo del primer valor","Reemplazo el segundo valor")
    val promedio = promedio(tercera = 10f)
    val promedio_redondeado = redondear_promedio(promedio)
    println("El promedio redondeado es: $promedio_redondeado")
}

//Funciones con valores predeterminados
fun imprimir(valor1: String = "Este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por defecto"){
    println(valor1)
    println(valor2)
}

fun promedio(primera:Float = 8f, segunda:Float = 8f , tercera:Float):Float{
    return(primera + segunda + tercera)/3f
}

fun redondear_promedio(promedio:Float):Int{
    if(promedio-promedio.toInt()>=.6){
        return promedio.toInt()+1
    }else{
        return promedio.toInt()
    }
}