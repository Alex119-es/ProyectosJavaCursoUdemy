package TEMASBASE.Herencia.animales.sobreescritura.palabrasuperpadre.polimorfismo;

/*Dato curioso de clases publicas pero en diferente paquete para poder usar de esa clase tienes que importarlo con import y despues la ruta del fichero en este momento
si yo uso en la clase gato la herencia de animal no se puede sino es con un import asi que lo escribirie y lo comentare aqui  */

// import Herencia.*;
// /*Esta expresion no funciona ya que el * es no recursivo entonces se refiere a todas las clases que hay dentro del directorio Herencia el cual no hay ninguna sin embargo si 
// añadimos todas las clases del directorio Herencia/animales si funcionaria ya que esta la clase que queremos llevarnosa en este caso Animal*/

import TEMASBASE.Herencia.animales.*;

// import Herencia.animales.Animal;

public class Animal3 {
/*para utilizar este concepto en primer lugar necsitamos una clase conocida como clase padre o superclase utilicemos un ejemplo como la clase Animal3 el cual tendra
clases hijas como clase gato y perro que tendra acceso a los metodos(por ahora ) de la clase padre osea los tendra 

/*QUE ES EL POLIMORFISMO ? :es la fuison de dos o mas clases que comparten herencia de una clase padre pero a la vez han sido sobreescritas dentro de su misma clase haciendo que no sea
la misma que la de la clase padre las cuales fueron heredadas en este caso haremos ahora que la funcion de hacerSonido originaria de la clase hija Perro tambien sea una funcion protegida
dentro de la clase padre y añadiremos una clase Gato tambien para sobreescribir esta funcion */
protected void hacerSonido(){
    System.out.println("El animal hace un sonido");
}


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
class Perro extends Animal3{
    @Override
    public void hacerSonido(){
    System.out.println("El perro hace wauf");
}
/*Muy importante y esto sale en la materia de servidores de Ivan pero podes dar una anotacion para recalcar que este metodo a sido sobreescrito */
@Override
protected void dormir(){
System.out.println("Suelo dormir 15 horas al dia");
System.out.println("Metodo clase padre:");
super.dormir();/*Con esto usamos la funcion de la clase padre a la vez que llamamos el metodo o funcion de la clase Perro llamada dormir  */
}
}
class Gato extends Animal3/*Animal*/ {
@Override
    public void hacerSonido(){
        System.out.println("El gato hace meow");
    }
}
class PruebaAnimal {
    // Metodo polimorfico
   static void imprimirSonido(Animal3 animal )/*tenemos que usar el tipo de dato mas generico en este caso tipo de dato de la clase Animal para instancialo dentro de lo que se refiere su 
    metodo llamado hacerSonido*/{
animal.hacerSonido();
    }
    public static void main(String[] args) {
        /*Objeto de la clase padre(Animal) */
var instanciaAnimalSinFuncion=new Animal3();
var instanciaAnimalSinFuncion2=new Perro();
var instanciaAnimalSinFuncion3=new Gato();
/*Tambien puede apuntar a clases hijas como en este caso que Perro es clase hija heredada de Animal */
imprimirSonido(instanciaAnimalSinFuncion);/*Al metodo imprimir sonido le estamos dando una referencia de tipo animal  */
imprimirSonido(instanciaAnimalSinFuncion2);
imprimirSonido(instanciaAnimalSinFuncion3);
    }   
}