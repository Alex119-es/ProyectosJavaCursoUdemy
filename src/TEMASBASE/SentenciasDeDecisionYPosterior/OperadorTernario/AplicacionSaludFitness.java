package TEMASBASE.SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.*;

public class AplicacionSaludFitness {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        final int metaPasosDiario = 10000;
        final var caloriasPorPaso = 0.04;
        System.out.println("Nombre del usuario: ");
        var nombreUsuario = String.valueOf(teclado.nextLine());
        System.out.println("Pasos caminados en el dia? :");
        var pasosDiarios = Integer.valueOf(teclado.nextLine() /* new Scanner(System.in).nextLine() */);
        var caloriasQuemadas = pasosDiarios * caloriasPorPaso;

        /* var metaAlcanzada=pasosDiarios>=metaPasosDiario; */
        var metaAlcanzadoConTernario = (pasosDiarios >= metaPasosDiario) ? "Felicidades alcanzo la meta "
                : "No cumplio la meta planteada ";
        System.out.println("Hola " + nombreUsuario + "\ncumplio la meta alcanzada? : "
                + metaAlcanzadoConTernario/* +metaAlcanzada */ + "\nlas calorias quemadas son: " + caloriasQuemadas);

    }
}
