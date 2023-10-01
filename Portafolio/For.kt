fun main(){
    print("Ciclo for del 1 al 5 \n")
    for( i in 1..5){
        print("$i,")
    }
    print("\nCiclo for del 1 al 5 (sin el ultimo valor)\n")
    for( i in 1 until 5){
        print("$i,")
    }
    print("\nCiclo for del 0 al 10 de 2 en 2 \n")
    for(i in 0..10 step 2){
        print("$i,")
    }
}
