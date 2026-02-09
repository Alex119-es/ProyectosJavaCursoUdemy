package TEMASAVANZADOS;
import java.io.Serializable;

public class JavaBeans {
public static void main(String[] args) {
    Persona instanciaPersona=new Persona();
    // mientras no sea abstract principal o interfaz o Serializable principal no lo ponemos como primero al parecer sino la clase principal inicial
    instanciaPersona.setNombre("Karla");
    instanciaPersona.setApellido("Lara");
System.out.println("persona: "+instanciaPersona);
System.out.println("Nombre: "+instanciaPersona.getNombre());
System.out.println("Apellido: "+instanciaPersona.getApellido());

}
}


class Persona implements Serializable{
private String nombre;
private String apellido;

    public Persona(){

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

}