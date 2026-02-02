package TEMASBASE.SentenciaSwitch;

import java.util.*;

public class RetoEstacionDelAnoSwitch {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out
                .println("Porfavor diga un numero del mes para corresponder la estacion en base a el dato numerico: ");

        var numeroMesEstacion = Integer.valueOf(teclado.nextLine());
        /*
         * Switch compara en numeros y cadenas como argumento
         * pero no sigue el arquetipo if de condiciones booleanas ya que sino tendriamos
         * que usar || o ==
         */
        switch (numeroMesEstacion) {
            case 1, 2, 12 -> System.out.println("Es invierno");
            case 3, 4, 5 -> System.out.println("Es primavera");
            case 6, 7, 8 -> System.out.println("Es verano");
            case 9, 10, 11 -> System.out.println("Es otoño");
            default -> System.out.println("Valor fuera de rango (12 meses del año)");

        }
        switch (numeroMesEstacion) {
            case 1, 2, 12:
                System.out.println("Es invierno");
                break;
            case 3, 4, 5:
                System.out.println("Es primavera");
                break;
            case 6, 7, 8:
                System.out.println("Es verano");

                break;
            case 9, 10, 11:
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Valor fuera de rango (12 meses del año)");
                break;
        }
        /*
         * Si queremos solamente almacenarlo en una variable tendremos que usar
         * -> ya que al usar : y break no funciona
         * sirve mas para casos numericos esto no reemplaza mucho a la sentencia if else
         */
        var cadenaAlmacenada = switch (numeroMesEstacion) {
            case 1, 2, 12 -> "Es invierno";
            case 3, 4, 5 -> "es primavera";
            case 6, 7, 8 -> "Es verano";
            case 9, 10, 11 -> "Es otoño";
            default -> "Numero invalido";

        };
        System.out.println(cadenaAlmacenada);
        System.out.printf("""
                %s,numero de dia : %d
                """, cadenaAlmacenada, numeroMesEstacion);

    }
}
