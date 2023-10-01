fun main(){
    //Lista no mutable

    val numeros = listOf("one","two","three", "four", "five")
    println(numeros)
    println("Numero de elementos: ${numeros.size} ")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemento: ${numeros.get(numeros.size-1)}")
    println("Index del elemento \"four\": ${numeros.indexOf("four")}")

    //Lista mutable

    val list = mutableListOf(1, 2, 3, 4)
    //agregar elementos
    list.add(5)
    //remover elementos
    list.removeAt(1)
    //modificar elementos
    list[0]=0
    print(list)
}