package TEMASAVANZADOS.Interfaces;

public interface Traductor {
/* similar a la clase bbstracta pero esta se enfoca mas a comportamiento y la clase abstracta se enfocaa en caracteristicas en comun es mas como
 CUMPLIR UN CONTRATO,sus metodos son publicos abstractos y se puede agregar una implementacion por default, no heredan cuando se aplica a otra clase
 sino que LO IMPLEMENTAN*/

//  esto es abstracto
void traducir();

// Metodos con implementacion poir default
default void iniciarTraductor(){
    System.out.println("Iniciando traductor ...");
}


}

// la clase tiene que ser abstracta debido a que la funcion es abstracta o implementar el metodo de traducir
class Ingles implements Traductor{
    // ahora override puede ser sobreescritura o implementacion
@Override
    public void traducir(){
System.out.println("Traduciendo en ingles :V ");
    };




}
class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduciendo en frances po :V");
    }

@Override
public void iniciarTraductor(){
    System.out.println("Iniciando traductor en frances");
}

}
class PruebaTraductor{
    public static void main (String []args ){
        Traductor ingles=/*no se puede instanciar una interfaz solo sus clases que implementan*/new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        /*Resumen
Para polimorfismo: usa el tipo de la interfaz o clase padre
Los tipos primitivos nunca pueden recibir objetos con new
Solo las clases Wrapper (Integer, Double, etc.) pueden manejar objetos numéricos
En resumen: var infiere el tipo más concreto, perdiendo la flexibilidad del polimorfismo. */

        // ingles=new Frances();
        // ingles.traducir();

        var frances= new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
