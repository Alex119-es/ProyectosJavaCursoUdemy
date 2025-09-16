package Operadores_Java;

import java.util.Scanner;

public class SistemaDescuentosVip {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sistema de descuentos VIP");
        final var numeroProductosIniciarDescuento = 10;
        /*
         * nota:si tiene el .nextInt habra que pasar con o sin el valueOf el siguiente
         * nextLine pendiente que habia por eso mejro ponemos a todos directamente el
         * valueOF
         * de los objetos y asi nos ahorramos pasar de teclado.nextInt() y despues
         * teclado.nextLine y despues de eso definir ahi si el verdadero
         * teclado.nextLine()
         */
        System.out.println("Cuantos articulos lleva usted?");
        var productosLlevados = Integer.valueOf(teclado.nextLine());
/*Si aqui hubiese Int en lugar de Line tendriamos que poner abajo
 * teclado.nextLIne() a secas y despues de eso añadir el Line de tienenMembresia para que lo lea tranquilamente
 */
        System.out.println("Tienes la memebresia de la tienda (true/false)?");
       var tienenMembresia = Boolean.valueOf(teclado.nextLine());

        var esElegibleDescuento = productosLlevados >= numeroProductosIniciarDescuento && tienenMembresia;

        System.out.println("es Elegible para el Descuento VIP?  = " + esElegibleDescuento);

    }

}
