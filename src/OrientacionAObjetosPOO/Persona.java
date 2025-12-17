package OrientacionAObjetosPOO;

public class Persona {

/*Un objeto es una representacion de una entidad de la vida real en nuestro programa las veces que sea necesario 
PRIMERO NECESITAMOS CREAR UNA CLASE O PLANTILLA la cual represente caracteristicas en comun de nuestros objetos 
es una obstraccion
en este caso haremos el ejemplo generico de la clase Persona con atributos y metodos como agregar o mostrar
las clases todas las iniciales con mayuscula*/
String nombre;
String apellido;/*Valor por default null no podemos usar var ya que aunque asignemos null var no lo considera*/
// String email;
// int celular;
void mostrarPersona(){
    // var variableLocal="Valor1";
    /*esto solo existe dentro del conjunto de funcion no dentro de la clase */
    // System.out.println("variableLocal"+variableLocal);
System.out.println("Nombre :"+nombre);
System.out.println("Apellido :"+apellido);

}
    public static void main(String[] args) {
/*Los valores se van asignar hasta el momento en que creamos objetos solo estamos definiendo
CREAR OBJETOS TIPO PERSONA:
*/
        System.out.println("Creacion de clase y objetos de tipo persona");
        var objeto1=new Persona(); /*new reserva espacio de memoria del tipo de la clase que tenemos en este caso persona */
objeto1.nombre="Layla";
objeto1.apellido="Acosta";

objeto1.mostrarPersona();
}
}

/*una clase puede contener otras clases  fuera de la misma no es lo mas comun ya que normalmene se recomienda que se mantenga solo una clase*/
// class Clase2{

// }

// class Clase3{

// }

