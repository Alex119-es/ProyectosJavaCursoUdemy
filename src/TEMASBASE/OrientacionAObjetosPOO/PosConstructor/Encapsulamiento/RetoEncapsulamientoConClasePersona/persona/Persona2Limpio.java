package OrientacionAObjetosPOO.PosConstructor.Encapsulamiento.RetoEncapsulamientoConClasePersona.persona;
public class Persona2Limpio {
/*CPNVERTIR LOS ATRIBUTOS DE NOMBRE Y APELLIDO EN PRIVADOS */
private String nombre;
private String apellido;
void mostrarPersona(){
    System.out.println("nombre: "+this.nombre);
    System.out.println("apellido: "+this.apellido);
}
/*Agregar un constructor publico con los 2 argumentos de nombre y apellido */
public Persona2Limpio(){}

public Persona2Limpio(String nombre,String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
}
/*Agregar los metodos get y set de cada atributo para aplicar encapsulamiento 
mover la calse a un paquete llamado persona y hacear la prueba desde PruebaPersona dentro del mismo paquete*/
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
    public static void main(String[] args) {
        System.out.println("***Creacion de Clase y Objetos de tipo persona");
        
        var objeto1=new Persona2Limpio();
        objeto1.nombre="Layla";    
        objeto1.apellido="Acosta";
        objeto1.mostrarPersona();
        /*Crear segundo objeto o instanciar la clase  */    
        var objeto2=new Persona2Limpio();
        objeto2.nombre="Ian";    
        objeto2.apellido="Gomez";
        objeto2.mostrarPersona();   
        /*Aunque es el mismo metodo hay distinta informacion */ 
    }
}