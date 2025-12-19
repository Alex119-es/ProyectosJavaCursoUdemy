package OrientacionAObjetosPOO;
public class Persona2Limpio {

String nombre;
String apellido;
void mostrarPersona(){
    System.out.println("nombre: "+nombre);
    System.out.println("apellido: "+apellido);
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