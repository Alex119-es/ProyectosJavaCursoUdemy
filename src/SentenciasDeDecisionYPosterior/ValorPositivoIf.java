package SentenciasDeDecisionYPosterior;

import java.util.*;

public class ValorPositivoIf {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un valor positivo: ");
        var datoPositivo = Double.valueOf(teclado.nextLine());
        if (datoPositivo > 0) {
            System.out.println("El numero es mayor,bien hecho no eres burro: " + datoPositivo);
        } else if (datoPositivo == 0) {
            System.out.println("el numero es 0,incorrecto " + datoPositivo);
        } else {
            System.out.println("El numero es negativo " + datoPositivo);
        }

    }
}
