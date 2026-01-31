package SentenciasDeDecisionYPosterior;

import java.util.*;

public class TiendaEnLinea {
    static Scanner teclado = new Scanner(System.in);
 // Precedencia (orden en el que prioriza de operadores)de Operadores en Java:
        // 1. Parentesis y Corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc

        // Expresion
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
    public static void main(String[] args) {
        System.out.println("Sistema que ofrece descuentos");
        System.out.println("Ingresa el monto de dinero que vale los productos (valor entero)");
        var dineroTienda = Double.valueOf(teclado.nextLine());
        final var montoMinimo = 1000;/*
                                      * esta parte es para sustituir la parte donde dice 1000 si quieres sino no la
                                      * uses como dice error lens XD
                                      */
        System.out.println("Usted es miembro de la tienda?(true/false): ");
        /*
         * esta parte de elegir un true o false se usa un objeto de tipo Boolean ya que
         * al usar la comparacion if necesitamos una comparacion con valores
         * booleanos y debido a eso no podemos poner una cadena String sino el Boolean
         * ya mencionado para simplemente usar true o false
         */
        var miembroTienda = Boolean.valueOf(teclado.nextLine());

        if (dineroTienda >= 1000 && miembroTienda) {
            var descuento10 = dineroTienda * 0.10;
            var montoTotalDescuento10 = dineroTienda - descuento10;
            System.out.println("Tienes descuento del 10%: " + descuento10 + "\nmonto total aplicado descuento: "
                    + montoTotalDescuento10);
        } else if (dineroTienda < 1000 && miembroTienda) {
            var descuento5 = dineroTienda * 0.05;
            var montoTotalDescuento5 = dineroTienda - descuento5;
            System.out.println("Tienda te da descuento del 5%: " + descuento5 + "\nmonto total aplicado descuento: "
                    + montoTotalDescuento5);
        } else {
            /*
             * las variables llegan solo a nivel de anillos anidados no puedes usar las
             * variables independientes de cada bloque de "{ }"
             */
            System.out.println("Descuento del 0% :" + dineroTienda);
        }

    }

}
