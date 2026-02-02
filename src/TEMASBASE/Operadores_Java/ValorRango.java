package TEMASBASE.Operadores_Java;

import java.util.Scanner;

public class ValorRango {
    /*static Scanner teclado=new Scanner(System.in);*/
public static void main(String[] args) {
    System.out.println("Valor entre rango");
/*Definimos los limites (constantes) */
final var minimo= 0;
final var maximo=5;
/*Solicitar un valor entre 0 y 5 */
System.out.println("selecciona un numero entre 0 y 5 ");
/*int numerosolicitado=teclado.nextInt();*/
var datoSolicitado= Integer.valueOf(new Scanner(System.in).nextLine());
/*Verificar si el dato esta dentro de rango 
 *Usaremos valores booleanos y lo compararemos con operadores logicos AND para que en medio de la confirmacion de verdaderos de manera logica nos salga true 
 dentro de la verificacion de la misma 
 *                   Aqui:Verdadero    &&   Verdadero = verdadero
*/
var estaDentroRango= datoSolicitado>=0 && datoSolicitado<=5;
System.out.println("esta dentro del rango solicitado?: "+estaDentroRango);





}
}
