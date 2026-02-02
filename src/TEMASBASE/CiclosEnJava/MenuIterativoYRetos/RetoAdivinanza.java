package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;
import java.util.*;
public class RetoAdivinanza {
    static Random aleatorizador = new Random();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sistemaAdivinanza = false;
        int numeroAleatorio = aleatorizador.nextInt(50) + 1;
        var intentos = 0;
        // var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 10;

        var numeroAAdivinar = 0;

        while (!sistemaAdivinanza || intentos < INTENTOS_MAXIMOS) {

            System.out.println("Di un numero entre el 1 al 50 (tienes 10 intentos)");
            numeroAAdivinar = Integer.valueOf(teclado.nextLine());
            intentos++;
            if (numeroAAdivinar < numeroAleatorio&&numeroAAdivinar>0) {
                System.out.println("El numero es incorrecto pero se encuentra mas arriba del numero ingresado");
            } else if (numeroAAdivinar > numeroAleatorio&&numeroAAdivinar<50) {
                System.out.println("El numero es incorrecto pero se encuentra por debajo del numero ingresado");
            } else if (numeroAAdivinar > 50 || numeroAAdivinar <= 0) {
                System.out.println("cero o numero negativo,numero mayor que 50 porfavor volver a intentar ");
                sistemaAdivinanza = true;
            }

            if (numeroAAdivinar == numeroAleatorio) {
                System.out.println(
                        "Felicidades el numero que escribiste es correcto, tu numero de intentos son: " + intentos);
                sistemaAdivinanza = true;
            }
            if (intentos == 10) {
                System.out.println("numero de intentos terminados el numero era " + numeroAleatorio);
                sistemaAdivinanza = true;
            } else {
                System.out.println("Numero de intentos: " + intentos);
            }
        }
        System.out.println("Saliendo del programa...");
        // while (numeroAAdivinar != numeroAleatorio && intentos < INTENTOS_MAXIMOS) {

        // System.out.println("Di un numero entre el 1 al 50 (tienes 10 intentos)");
        // numeroAAdivinar = Integer.valueOf(teclado.nextLine());
        // intentos++;
        // if (numeroAAdivinar > numeroAleatorio) {
        // System.out.println("El numero es incorrecto pero se encuentra mas arriba del
        // numero ingresado");
        // } else if (numeroAAdivinar < numeroAleatorio) {
        // System.out.println("El numero es incorrecto pero se encuentra por debajo del
        // numero ingresado");
        // } else if (numeroAAdivinar > 50 || numeroAAdivinar <= 0) {
        // System.out.println("cero o numero negativo,numero mayor que 50 porfavor
        // volver a intentar ");
        // sistemaAdivinanza = true;
        // }

        // if (intentos == 10) {
        // System.out.println("numero de intentos terminados");
        // sistemaAdivinanza = true;
        // } else {
        // System.out.println("Numero de intentos: " + intentos);
        // }
        // }
        // if (numeroAAdivinar == numeroAleatorio) {
        // System.out.println(
        // "Felicidades el numero que escribiste es correcto, tu numero de intentos son:
        // " + intentos);
        // sistemaAdivinanza = true;
        // }

        // System.out.println("Saliendo del programa...");
    }
}