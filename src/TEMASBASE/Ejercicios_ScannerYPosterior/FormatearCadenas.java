package Ejercicios_ScannerYPosterior;
import java.util.*;

public class FormatearCadenas {

    public static void main(String[] args) {
        var nombre="Alex";
        var edad =21;
        var salario=1100.3122;
        /*s para cadena,d para entero y .(numero de decimales que va a tener)f para float
         * % es para iniciar de que se va a sustituir dentro de la cadena
         * 
           */
var cadenaFormateada=String.format("Nombre: %s \nEdad: %d \nSalario: %.2f"
,nombre,edad,salario);
System.out.println(cadenaFormateada);
System.out.printf("Nombre %s,");
        
    }
}
