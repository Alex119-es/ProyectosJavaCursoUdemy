package Operadores_Java;

import java.util.Scanner;

public class SistemaPrestamoLibros {
    static Scanner teclado=new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("Sistema prestamo de libros");
final int distanciaPermitidaEnKm=3;

System.out.println("Cuentas con credencial de estudiante (true/false)?");
var tieneCredencial=Boolean.valueOf(teclado.nextLine());

System.out.println("Cuantos kilometros vives de la biblioteca (numero entero)?");
var distanciaBibliotecaKm=Integer.valueOf(teclado.nextLine());
/*si una de las condiciones es valida se cumple el prestamo del libro */
var esElegiblePrestamo= tieneCredencial || distanciaBibliotecaKm<= distanciaPermitidaEnKm;

System.out.println("Eres elegible para el prestamo del libro?: "+esElegiblePrestamo);

}
}
