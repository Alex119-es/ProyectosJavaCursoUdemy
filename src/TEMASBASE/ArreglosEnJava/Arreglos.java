package TEMASBASE.ArreglosEnJava;
import java.util.*;
public class Arreglos {
static Scanner teclado =new Scanner(System.in);/*Introducimos registro consola para añadir los valores dentro de un arreglo */

    public static void main(String[] args) {
/*Arreglos
 * 1.declaramos un arreglo
 */
        int [] primerArreglo;
        /*2.Inicializar el arreglo */
        primerArreglo=new int[3];/*espacios de 0s generados */

        /*Declarar e inicializar un arreglo */
        int []segundoArreglo_V2=new int[5];
        var segundoArreglo=new int[2];

segundoArreglo[0]=2;

        /*Modificar un valor de arreglo:
         * nombreDelArreglo[posicion]=valor;
         * nombreDelArreglo[posicion]=valor;
         * nombreDelArreglo[posicion]=valor;
         */

/************************************INTRODUCIR VALORES A UN ARREGLO ***********************************************/
System.out.println("Proporciona el largo del arreglo:");
int largoDelArreglo=Integer.valueOf(teclado.nextLine());

// Creamos de manera dinamica el arreglo.. Dato:pueden cualquier tipo pero por ahora trabajamos con int o enteros
int [] ArregloConsola=new int[largoDelArreglo];

// Solicitar los valores del arreglo

for (int i = 0; i < ArregloConsola.length; i++) {
        System.out.println("Proporciona enteros[ "+i+" ]=");

ArregloConsola[i]=Integer.valueOf(teclado.nextLine());
}
// Imprimir los valores del arreglo

for (int i = 0; i < ArregloConsola.length; i++) {
        System.out.println("Valor "+i+" : "+ArregloConsola[i]);
}

        }
}

