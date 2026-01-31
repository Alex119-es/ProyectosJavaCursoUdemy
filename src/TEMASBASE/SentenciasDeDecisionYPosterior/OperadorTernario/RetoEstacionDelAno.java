package SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.Scanner;

public class RetoEstacionDelAno {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                porfavor diga un numero del  mes para saber la estacion del año
                                    """);
        var numeroMesEstacion = Integer.valueOf(teclado.nextLine());
        /*
         * para concadenar valores sin que todos tengan que coincidir tendremos que
         * usar la abreviacion logica de or ya que si usamos and tendria que coincidir
         * con todos los valores numericos
         * nosotros solo necesitamos uno de estos tres para que muestre el valor
         * 
         */
        if (numeroMesEstacion == 1 || numeroMesEstacion == 2 || numeroMesEstacion == 12) {
            System.out.println("Es invierno");
        } else if (numeroMesEstacion == 3 || numeroMesEstacion == 4 || numeroMesEstacion == 5) {
            System.out.println("Es primavera");
        }

        else if (numeroMesEstacion == 6 || numeroMesEstacion == 7 || numeroMesEstacion == 8) {
            System.out.println("Es verano");

        } else if (numeroMesEstacion == 9 || numeroMesEstacion == 10 || numeroMesEstacion == 11) {
            System.out.println("es otoño");

        } else {
            System.out.println("Valor fuera de rango (12 meses del año)");
        }

        /*ahora tratare ternarios */
        var ternarioEstacion=((numeroMesEstacion==1 ||numeroMesEstacion==2||numeroMesEstacion==12 ? "Invierno":
        (numeroMesEstacion==3||numeroMesEstacion==4||numeroMesEstacion==5 ? "Primavera":
        (numeroMesEstacion==6||numeroMesEstacion==7||numeroMesEstacion==8 ?"Verano":
        (numeroMesEstacion==9||numeroMesEstacion==10||numeroMesEstacion==11 ?"Otoño ":"ERROR rango fuera de los 12 meses ")))) );
   System.out.println(ternarioEstacion);
   System.out.printf("""
La estacion del año es: %s
El numero elegido es : %d
           """,ternarioEstacion,numeroMesEstacion);
    }
}
