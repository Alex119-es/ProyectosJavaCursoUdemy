package TEMASBASE.SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.Scanner;

public class RetoElMayorDeDosNumeros {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Diga primer numero piolin");
        var numero1 = Integer.valueOf(teclado.nextLine());
        System.out.println("Diga segundo numero");
        var numero2 = Integer.valueOf(teclado.nextLine());

        var comparacionNumeros = ((numero1 > numero2) ? numero1 + " es mayor que " + numero2
                : (numero1 == numero2) ? "son iguales" : numero2 + "es mayor que " + numero1);
        System.out.println(comparacionNumeros);
        /*******************************************************************************************
         * **********************************************************************************
         * ********************************************************************************
         * **********************************************************************************
         */
        System.out.println("******** PARTE DEL IF ***********");
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que" + numero2);

        } else if (numero1 == numero2) {
            System.out.println("son iguales");
        } else {
            System.out.println(numero2 + " es mayor que " + numero1);
        }

    }
}
