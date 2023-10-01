fun main(){
    verifyAge()
}
fun verifyAge(){
    print("Ingresa tu edad y presiona enter (escribe solo el número): ")
    val age = readLine()?.toInt() //? se utiliza para indicar que la llamada a readLine() puede devolver un valor nulo
        if(age == 18) {
            println("Ya eres mayor de edad!")
        }
}