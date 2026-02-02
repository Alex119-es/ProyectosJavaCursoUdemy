package TEMASBASE.Ejercicios_ScannerYPosterior;

import java.util.Random;

public class NumerosAleatorios {
static Random aleatorizador=new Random();

    public static void main(String[] args) {
    
/*Generar un numero aleatorio entre '0 y 9' */
var numeroAleatorio=aleatorizador.nextInt(10);
System.out.println("Numero de 0 a 9 : "+numeroAleatorio);

/*Generar un numero flotante entre 0.0 y 1.0 */
var floatAleatorio=aleatorizador.nextFloat();
System.out.println("float : "+floatAleatorio);

/*Simular el lanzamiento de un dado (1 y 6) */
var dado=aleatorizador.nextInt(6)+1;
System.out.println("lanzamiento de un dado: "+dado);

/*Se confirma que al poner un numero asi sale n-1 de 0 a ese mismo n-1 es decir
 * (3) es 0 a 3-1(2)
*/
var numeroAleatorio_1=aleatorizador.nextInt(3);
System.out.println("Numero de 0  : "+numeroAleatorio_1);



}
}
