package OrientacionAObjetosPOO.PosConstructor.Encapsulamiento.RetoEncapsulamientoConClasePersona.persona;

public class PersonaPrueba {

    public static void main(String[] args) {
var instanciaDeClasePersona=new Persona2Limpio();
// instanciaDeClasePersona.nombre="Alejandro";
System.out.println("mostramos el nombre y apellido de la clase Persona2Limpio por medio de setters y su funcion");
System.out.println(instanciaDeClasePersona.getNombre());/*Para que se muestre los valores del get hay que usar sout */
System.out.println(instanciaDeClasePersona.getApellido());

instanciaDeClasePersona.setNombre("Alex");
instanciaDeClasePersona.setApellido("Tremo");
instanciaDeClasePersona.mostrarPersona();    
System.out.println(instanciaDeClasePersona.getNombre());
System.out.println(instanciaDeClasePersona.getApellido());
var instanciaDeClasePersona2=new Persona2Limpio("Guiñez","Gomez");
System.out.println(instanciaDeClasePersona2.getNombre());
System.out.println(instanciaDeClasePersona2.getApellido());

}
}
