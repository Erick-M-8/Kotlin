fun main(){
    val nombres = listOf(
        "Mario",
        "Luigi",
        "Princesa Peach",
        "Toad",
        "Yoshi",
        "Bowser",
        "Mario"
    )

    //La variable nombre tomara los valores de la lista nombres, hasta el último nombre de la lista
    println("Imprimir nombres con for ")
    for (nombre in nombres) {
        println(nombre)
    }
    println("\nImprimir nombres con forEach ")
    nombres.forEach { nombre ->
        println("$nombre")
    }
    println("\nParar la ejecucion cuando nombre == Toad")
    for (nombre in nombres) {
        println(nombre)
        if(nombre=="Toad"){
            println("personaje encontrado!")
            break
        }
    }
    println("\nContar el numero de veces que aparece un elemneto")
    var n = countName("Mario",nombres)
    println("El nombre Mario aparece $n veces en la lista")

}
fun countName(name:String , nombres:List<String>):Int{
    var count = 0;
    for(currentName in nombres){
        if(name in currentName){
            count ++
        }
    }
    return count
}