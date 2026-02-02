package TEMASBASE.SentenciasDeDecisionYPosterior;

import java.util.*;

public class If_else {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        var edad = Integer.valueOf(teclado.nextLine());

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}
