const val lado1 = 3.00f
const val lado2 = 1.00f
const val lado3 = 2.00f
var tipo= "";

fun main(){
    type(lado1, lado2, lado3)
    print("Es un triangulo de tipo: $tipo")
}

fun type(lado1:Float, lado2:Float, lado3:Float) {
    if(lado1==lado2 && lado2==lado3){
        tipo = "equilatero"
    }else
        if(lado1 != lado2 && lado2 != lado3 && lado1!= lado3){
            tipo="escaleno"
        }else{
            tipo="isoceles"
        }
}