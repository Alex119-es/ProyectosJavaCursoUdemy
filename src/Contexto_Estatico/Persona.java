package Contexto_Estatico;
/*Volvemos a clonar la estructura de la calse Persona */
public class Persona {
   private static int contadorPersonasCreadas=0;
    private int idPersona;
    // si este valor no fuese estatico se asociaria en si misma solo con la creacion del objeto y siempre saldria uno mas nunca incrementaria mas alla de eso, porque la variable 
    // ESTA ASOCIADA CON LA CLASE EN SI MISMA;NO CON LOS OBJETOS
// *CPNVERTIR LOS ATRIBUTOS DE NOMBRE Y APELLIDO EN PRIVADOS */
private String nombre;
private String apellido;

@Override /*Sobrescribimos el metodo toString */
public String toString(){
return "Nombre: "+this.nombre+", Apellido: "+this.apellido+" ,Dirreccion de memoria: "+super.toString()+" Id unico: "+idPersona;
};
// void mostrarPersona(){
//     System.out.println("nombre: "+this.nombre);
//     System.out.println("apellido: "+this.apellido);
// }
/*Agregar un constructor publico con los 2 argumentos de nombre y apellido */
public Persona(){
    Persona.contadorPersonasCreadas++;
    this.idPersona=Persona.contadorPersonasCreadas;
}

public int getIdPersona() {
    return this.idPersona;
}
public Persona(String nombre,String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
    // Incrementar el atributo static
    Persona.contadorPersonasCreadas++;
    this.idPersona=Persona.contadorPersonasCreadas;
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

public static int getContadorPersonas(){
    return Persona.contadorPersonasCreadas;
}

}

