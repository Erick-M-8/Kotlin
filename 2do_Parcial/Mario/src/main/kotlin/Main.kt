import clases.Enemy
import clases.Goomba
import clases.Koopa
import clases.Mario

/*Modificadores de acceso:
    Son palabras clave que se utilizan para controlar la visibilidad y el acceso a los atributos, métodos, y otros
    elementos dentro de una clase

    - public: Son accesibles desde cualquier parte del código, ya sea dentro de la misma clase, en clases diferentes
      o en otros paquetes

    - private: Solo son accesibles dentro de la misma clase que los define

    - protected: Son accesibles dentro de la clase que los declara y en sus subclases.

    - internal: Solo son visibles dentro del mismo módulo (podras ver los módulos en la estructura del proyecto)
*/
fun main() {
    val mario = Mario()
    println("Vidas: ${mario.getLives()}")
    mario.collision("Star")
    val enemy1 = Enemy("Un enemigo", 2)
    println("El enemigo choca con otro enemigo por lo tanto cambia de dirección:")
    enemy1.collisionEnemy("Enemy")
    println("El enemigo choca con un arma por lo tanto muere:")
    enemy1.collisionEnemy("Weapon")
    println("Se crea un Goomba, para ello se invoca a la superclase Enemy:")
    val Goomba = Goomba("Goomba", 1)
    println("Se crea un Koopa, para ello se invoca a la superclase Enemy:")
    val koopa = Koopa("Koopa", 1)
    koopa.collisionEnemy("Weapon")
    println("Koopa  choca con otro enemigo por lo tanto cambia de dirección:")
    koopa.collisionEnemy("Enemy")
    for (i in 1..4) {    //Matando a mario 4 veces
        if (mario.isAlive) {
            mario.collision("Goomba")
            println("Te quedan ${mario.getLives()}")
        }
    }
}

/*Getters y Setters
    Un getter es un método que se utiliza para obtener el valor de una propiedad.
    Un setter es un método que se utiliza para modificar el valor de una propiedad
*/

/*Herencia
    La herencia en la programación orientada a objetos (POO) es un concepto que permite que una clase
    (llamada "clase derivada" o "subclase") herede propiedades y métodos de otra clase (llamada "clase
    base" o "superclase"). Esto fomenta la reutilización de código al permitir que una clase hija
    comparta y amplíe las características y funcionalidades de una clase padre. */

/*Polimorfismo
    El polimorfismo en programación orientada a objetos se relaciona estrechamente con la herencia.
    El polimorfismo de tiempo de ejecución (o "sobrescritura de métodos") permite que las subclases
    hereden y reemplacen los métodos de la clase base (superclase).

    -Métodos con el mismo nombre pero con diferente funcionalidad
    -Métodos con el mismo nombre que reciben parámetros diferentes
    -Métodos que pueden omitir parámetros
 */