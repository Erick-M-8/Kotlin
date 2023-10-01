fun main(){
    var x = 20
    while(x>0){
        println(x)
        x--
    }
    //La diferencia es que do while se va ejecutar una vez se cumpla o no la condición
    do{
        println("En este punto x=0, y la condición del do while es que x>0, sin embargo el bloque")
        println("de instrucciones se ejecuta una vez sin importar si se cumple o no la condición")
        println(x)
        x--
    }while(x>0)
}