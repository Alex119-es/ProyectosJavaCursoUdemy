package Herencia.animales;

public class Animal {
/*para utilizar este concepto en primer lugar necsitamos una clase conocida como clase padre o superclase utilicemos un ejemplo como la clase Animal el cual tendra
clases hijas como clase gato y perro que tendra acceso a los metodos(por ahora ) de la clase padre osea los tendra 


*/
/*METODO= funcion de una clase */
protected void comer(){
    System.out.println("Como muchas veces al dia");
}
protected void dormir(){
    System.out.println("Duermo muchas horas");
}
}
// como dijimos antes podemos crear otras clases en la misma y puede funcionar aunque no es lo usual en este caso lo haremos
class Perro extends Animal{
    public void hacerSonido(){
    System.out.println("Puedo ladrar pe soy un perro");
}
}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("***Ejemplo de Herencia");
        System.out.println("Clase padre,soy un animal");
        var instanciaAnimal1=new Animal();
        instanciaAnimal1.dormir();/*En este caso accedemos a las funciones ya que te deja entrar a clases que comparten el mismo paquete
         */
        instanciaAnimal1.comer();
        // instanciaAnimal1.hacerSonido(); /*no funciona ya que nunca estuvo definido el metodo dentro de la clase padre */

System.out.println("\n Clase hija,soy un perro");
var instaciaPerro1=new Perro();/*recuerda si no hay constructor solo hay por default un constructor vacio */
instaciaPerro1.comer();
instaciaPerro1.dormir();
instaciaPerro1.hacerSonido();

/*Resumen:herencia es que cuando una clase tiene atributos protegidos otras clases pueden usar los metodos de esa clase con la palabra extends ya que heredan los metodos de esa clase
haciendo una limitacion de que solo esa clase pueda usarla sino no  */
    }
}