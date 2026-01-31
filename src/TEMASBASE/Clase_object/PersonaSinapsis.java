package Clase_object;

public class PersonaSinapsis extends Object {
/*la clase object es la clase PADRE DE LAS CLASES PADRES XD y contiene metodos como equals()compara si dos objetos son iguales,toString()que manda a imprimir
el estado de un objeto en cierto momento en dirreccion de memoria y paquete y hashCode() que genera un valor numerico que represente al objeto en memoria ES DECIR TODAS LAS CLASES INDIRECTAMENTE O
DIRECTAMENTE POR DEFAULT HEREDAN LA CLASE OBJECT */
// Usaremos la estructuru dada en la clase PersonaSinapsis de la carpeta OrientacionAObjetosPOO



// *CPNVERTIR LOS ATRIBUTOS DE NOMBRE Y APELLIDO EN PRIVADOS */
private String nombre;
private String apellido;

@Override /*Sobrescribimos el metodo toString */
public String toString(){
return "Nombre: "+this.nombre+", Apellido: "+this.apellido+" Dirreccion de memoria: "+super.toString();
};
// void mostrarPersona(){
//     System.out.println("nombre: "+this.nombre);
//     System.out.println("apellido: "+this.apellido);
// }
/*Agregar un constructor publico con los 2 argumentos de nombre y apellido */
public PersonaSinapsis(){}

public PersonaSinapsis(String nombre,String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
}
/*Agregar los metodos get y set de cada atributo para aplicar encapsulamiento 
mover la clase a un paquete llamado persona y hacear la prueba desde PruebaPersona dentro del mismo paquete*/
public String getNombre(){
return this.nombre;
}
public String getApellido(){
    return this.apellido;
}
public void setApellido(String apellido){
this.apellido=apellido;
}
public void setNombre(String nombre){
this.nombre=nombre;
}



}

/*una clase puede contener otras clases  fuera de la misma no es lo mas comun ya que normalmene se recomienda que se mantenga solo una clase*/
// class Clase2{

// }

// class Clase3{

// }


