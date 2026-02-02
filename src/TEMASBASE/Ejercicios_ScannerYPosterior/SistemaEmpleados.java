package TEMASBASE.Ejercicios_ScannerYPosterior;

import java.util.Scanner;

public class SistemaEmpleados {
    static Scanner teclado =new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("***Sistema de empleados****");
    /*Nombre del empleado */
System.out.println("Nombre del empleado: ");
var nombreEmpleado=teclado.nextLine();
System.out.println("Edad del empleado: ");
var edadEmpleado=Integer.valueOf(teclado.nextLine());
System.out.println("Salario del empleado: ");
var salarioEmpleado=Double.valueOf(teclado.nextLine());

System.out.println("Es jefe de departamento?: ");
var jefeEmpleado=Boolean.valueOf(teclado.nextLine());

System.out.println("\n Datos del empleado: ");
System.out.println("\t Nombre: "+nombreEmpleado);
System.out.println("\t Edad: "+edadEmpleado);
/*dos formas de asignar a que salga dos decimales
 * System.out.printf("\t Salario: $%.2f%n", salarioEmpleado);
*/
System.out.printf("\t Salario: $%.2f".formatted(salarioEmpleado));
System.out.println("\t Es jefe?: "+jefeEmpleado);
}
}
