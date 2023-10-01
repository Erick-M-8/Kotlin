fun main(){
    gradoEscolar()
}
fun gradoEscolar(){
    print("Ingresa tu edad (escribe solo el numero): ")
    var age = readLine()?.toInt()
    when (age){
        0-> println("Apenas eres un recien nacido!")
        1-> println("Solo tienes un año de edad!")
        in 2..5->println("Estas en preescolar")
        in 6.. 11->println("Estas en primaria")
        in 12.. 14->println("Estas en secundaria")
        in 15..17-> println("Estas en bachillerato")
        in 18..25 -> println("Estas en universidad")
        else -> {
            println("Edad invalida \nVuelve a correr el codigo")
        }
    }
}