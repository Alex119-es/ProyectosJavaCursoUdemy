package CiclosEnJava.CiclosFor;

public class EjercicioAcumuladorSumaWhileUdemy {
    public static void main(String[] args) {
        System.out.println("\nrealizar la suma itinerativa de los primeros 5 numeros iniciales");
        final int iterador_MAXIMO = 5;
        var acumuladorDeSumas = 0;

        // iterar valores

        var numero = 1;
        while (numero <= iterador_MAXIMO) {
            // imprmir lo que se va a sumar
            System.out.println("(acumuladorSuma+numero) ->" + acumuladorDeSumas + " + " + numero);

            // Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + (acumuladorDeSumas + numero) + "\n");

            // realizar la suma acumulativa
            acumuladorDeSumas += numero; // equivalente a acumuladorDeSumas=acumuladrosuma+numero
            numero++;
            System.out.print("Suma de los primeros " + iterador_MAXIMO + " numeros: " + acumuladorDeSumas + "\n");
        }

        System.out.println("Version bucle whileDo y tratar de hacer con for");
        do {

            acumuladorDeSumas += numero;
            numero++;
            System.out.println(acumuladorDeSumas);
        } while (numero <= iterador_MAXIMO);

        System.out.println("Version FOR: ");

        for (int i = 0; i <= iterador_MAXIMO; i++) {
            acumuladorDeSumas += i;
            System.out.println(acumuladorDeSumas);
        }
     
        // los tres realizados con esto queda a prueba que para la parte de suma
        // acumulativa se necesita una variable ajena que acumule los datos constantes
        // no el numero de ciclos













        // ****************************************************************************************************************************************************
        // */
        // while (numero <= 5) {
        // numero += numero;
        // System.out.println(numero);

        // }

        /*
         * aqui el problema que tenemos es que todo va indicado en una variable es decir
         * si por ejemplo sumo a la vez con el incrementador sigo modificando la misma
         * variable no
         * se modifica independientemente de esa opercion sin embargo...si piensas que
         * la solucion es quitar el incremento o decremento tampoco funcionaria ya que
         * seguimos modificando la
         * variable numero sin un orden de resultados de una serie de ciclos haciendo
         * que simplemente sea una suma espejo y no secuencial como 1+1,2+2,4+4,8+8 y no
         * siguiendo la secuencia
         * 1,2,3,4,5
         */

        // Aquí no hay acumulador. Solo modificas el valor de numero y lo imprimes.
        // No estás sumando los valores de numero en cada iteración, solo lo cambias y
        // lo imprimes.
        // Además, numero+=numero-1; y luego numero++; hace que el valor de numero
        // crezca muy rápido y no siga la secuencia 1, 2, 3, 4, 5.
        // ¿Siempre necesitas una variable extra?
        // Sí, cuando necesitas acumular un resultado (sumar, multiplicar, concatenar,
        // etc.), necesitas una variable extra (el acumulador).
        // No, si solo necesitas contar o iterar (por ejemplo, imprimir números del 1 al
        // 5), solo necesitas el contador.Aquí no hay acumulador. Solo modificas el
        // valor de numero y lo imprimes.
        // No estás sumando los valores de numero en cada iteración, solo lo cambias y
        // lo imprimes.
        // Además, numero+=numero-1; y luego numero++; hace que el valor de numero
        // crezca muy rápido y no siga la secuencia 1, 2, 3, 4, 5.
        // ¿Siempre necesitas una variable extra?
        // Sí, cuando necesitas acumular un resultado (sumar, multiplicar, concatenar,
        // etc.), necesitas una variable extra (el acumulador).
        // No, si solo necesitas contar o iterar (por ejemplo, imprimir números del 1 al
        // 5), solo necesitas el contador.
    }
}
