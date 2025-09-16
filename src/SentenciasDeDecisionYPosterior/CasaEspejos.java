package SentenciasDeDecisionYPosterior;

import java.util.*;

public class CasaEspejos {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido a la casa de los espejos :v");

        System.out.println("Que edad tienes?");
        var edad = Integer.valueOf(teclado.nextLine());

        System.out.println("Tienes miedo a  la oscuridad? :V (true/false) ");
        var miedoAOscuridad = Boolean.valueOf(teclado.nextLine());

        /* verificacion aplicando logica inversa */

        if (!miedoAOscuridad && edad >= 10) {
            System.out.println("Puedes entrar a la casa de los espejos ");
        } else {
            System.out.println("no puedes entrar a la casa de los espejos");
        }

    }
}
