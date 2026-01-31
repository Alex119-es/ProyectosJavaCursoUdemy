package CiclosEnJava.MenuIterativoYRetos;

import java.util.*;

public class RetoCajeroAutomatico {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cajero autmoatico");
        var saldoInicial = 1000.00;
        boolean sistema = false;
        while (!sistema) {
            System.out.print("""
                \n
                    SELECCIONE LAS OPCIONES A DISPOSICION
                    1.Depositar dinero
                    2.Retirar dinero
                    3.Consultar el saldo
                    4.Salir del sistema
                    Opcion:
                    """);
            var opcion = Integer.valueOf(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Comente el dinero a depositar: ");
                    var dineroDeposito = Double.valueOf(teclado.nextLine());
                    saldoInicial += dineroDeposito;
                    System.out.println("Monto añadido: " + dineroDeposito + " ,total: " + saldoInicial);

                    break;
                case 2:
                    System.out.println("Comente el dinero a retirar: ");
                    var retiroDinero = Double.valueOf(teclado.nextLine());
                    if (retiroDinero <= saldoInicial) {
                        saldoInicial -= retiroDinero;
                        /*aqui lo que siempre debo de asimilar es que saldoInicial sumara o restara
                         * Siempre y siempre con su siguiente modificacion Punto
                         */
                        System.out.println("Dinero retirado: " + retiroDinero + " ,total: " + saldoInicial);
                    } else {
                        System.out.println("no cuentas con el saldo suficiente saldo actual es " + saldoInicial);
                    }
                    break;
                case 3:
                /*aqui es preferible abarcarlo con una variable asi sin ser constante y dentro de una variable
                 * ya declarada debido a que si tuviesemos que abarcar dentro de cada bloque case tendriamos que usar 
                 * un if que indique que si se modifico muestre el valor modificado y sino pues el original 
                 * complicando mas el codigo
                 */
                    System.out.println("Su saldo actual es: " + saldoInicial);

                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    sistema = true;
                    break;

                default:
                    System.out.println("Numero fuera de los valores de opcion predeterminada porfavor reintentar");
                    break;
            }

        }
        System.out.println("Fin de la actividad de la aplicacion");
    }
}
