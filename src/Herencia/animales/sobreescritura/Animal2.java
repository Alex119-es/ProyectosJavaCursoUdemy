package Herencia.animales.sobreescritura;

public class Animal2 {
/*para utilizar este concepto en primer lugar necsitamos una clase conocida como clase padre o superclase utilicemos un ejemplo como la clase Animal2 el cual tendra
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
/*QUE ES LA SOBREESCRITURA:es cuando el metodo de una clase padre HEREDADA de una clase hija es modifica dentro de la clase hija para que actue distinto 
en este caso lo que haremos sera modificar el metodo original de la clase padre Animal llamado dormir a un metodo difeerente en la clase hija llamada Perro*/
class Perro extends Animal2{
    public void hacerSonido(){
    System.out.println("Puedo ladrar pe soy un perro");
}
/*Muy importante y esto sale en la materia de servidores de Ivan pero podes dar una anotacion para recalcar que este metodo a sido sobreescrito */
@Override
protected void dormir(){
System.out.println("Suelo dormir 15 horas al dia");
}
}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("***Ejemplo de Herencia");
        System.out.println("Clase padre,soy un animal");
        var instanciaAnimal1=new Animal2();
        instanciaAnimal1.dormir();/*En este caso accedemos a las funciones ya que te deja entrar a clases que comparten el mismo paquete
         */
        instanciaAnimal1.comer();
        // instanciaAnimal1.hacerSonido(); /*no funciona ya que nunca estuvo definido el metodo dentro de la clase padre */

System.out.println("\n Clase hija,soy un perro");
var instaciaPerro1=new Perro();/*recuerda si no hay constructor solo hay por default un constructor vacio */
instaciaPerro1.comer();
instaciaPerro1.hacerSonido();
instaciaPerro1.dormir();

/*Resumen:herencia es que cuando una clase tiene atributos protegidos otras clases pueden usar los metodos de esa clase con la palabra extends ya que heredan los metodos de esa clase
haciendo una limitacion de que solo esa clase pueda usarla sino no  */
    }
}