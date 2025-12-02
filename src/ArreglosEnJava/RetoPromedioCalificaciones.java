package ArreglosEnJava;
import java.util.*;
public class RetoPromedioCalificaciones {

    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {

        var sumaTotalCalificacion=0;
        // Primero solicitar cuantas calificaciones deseo agregar a mi arreglo,despues agregar valor a cada espacio de las calificaciones,el promedio es la suma de todas las calificaciones entre 
// el total del largo del arreglo que se ha generado
System.out.println("Indicar largo para agregar calificiaciones: ");
// int numeroDeLargoArreglo=Integer.valueOf(teclado.nextLine());

int [] arregloCalificaciones=new int[Integer.valueOf(teclado.nextLine())];
/********************************************************************** */
System.out.println("Espacios generados ahora decir numero de: \n");
for (int i = 0; i < arregloCalificaciones.length; i++) {
    System.out.println("Valor para ["+i+"]: ");
    arregloCalificaciones[i]=Integer.valueOf(teclado.nextLine());
}
/********************************************************************** */
for (int i = 0; i < arregloCalificaciones.length; i++) {
    System.out.println("Calificacion "+i+":"+arregloCalificaciones[i]);
}

for (int i = 0; i < arregloCalificaciones.length; i++) {
    sumaTotalCalificacion += arregloCalificaciones[i];
    System.out.println("Iteración " + i + ": suma parcial es " + sumaTotalCalificacion); // Línea de prueba
}
System.out.println("Promedio general del conjunto: "+"Suma total = "+sumaTotalCalificacion+" ,promedio general: "+sumaTotalCalificacion+" / "+arregloCalificaciones.length+" = "+((double)sumaTotalCalificacion/arregloCalificaciones.length));
}
}
