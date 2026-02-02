package TEMASBASE.SentenciasDeDecisionYPosterior;

import java.util.*;

public class SistemaBancario {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sistema bancario bienvenidos :v");

        System.out.println("Deseas salir del sistema?(true/false)");
        var salirSistema = Boolean.valueOf(teclado.nextLine());
        /*
         * como aplicamos logica inversa si damos false (negacion)dentro de la variable
         * salirSistema saldra dentro de la procedencia inversa ! de la primera y como
         * niegas el hecho de que deseas salir por eso el comentario
         * al poner true y confirmar se va a la sentencia else porque internamente del
         * if lo lee como false aunque el resultado hayas puesto true debido a que lo
         * lee como la logica inversa  entonces tu false de salirSistema lo leera como true en el if y ejecutara 
         * la primera parte de continuamos 
         */
        /* verificamos (aplicando logica inversa) */
        if (!salirSistema) {
            System.out.println("Continuamos dentro del sistema");
        } else {
            System.out.println("saliendo del sistema");
        }
    }
}
