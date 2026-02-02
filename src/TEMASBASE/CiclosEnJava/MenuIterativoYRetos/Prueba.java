package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;
import java.util.*;
public class Prueba {
    
    static Scanner teclado =new Scanner(System.in);
public static void main(String[] args) {
    // ...existing code...
var saldoInicial = 1000.00;
double saldoModificado = saldoInicial; // Nueva variable para guardar el saldo actualizado
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
            saldoModificado += dineroDeposito; // Solo modificas saldoModificado
            System.out.println("Monto añadido: " + dineroDeposito + " ,total: " + saldoModificado);
            break;
        case 2:
            System.out.println("Comente el dinero a retirar: ");
            var retiroDinero = Double.valueOf(teclado.nextLine());
            if (retiroDinero <= saldoModificado) {
                saldoModificado -= retiroDinero;
                System.out.println("Dinero retirado: " + retiroDinero + " ,total: " + saldoModificado);
            } else
 {
                System.out.println("no cuentas con el saldo suficiente saldo actual es " + saldoModificado);
            }
            break;
        case 3:
           System.out.println("SU saldo actual es: "+saldoModificado);
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
// ...existing code...
/*NOTA: partes importantes de esto recuerda que es la diferencia de inicializacion,instancia y modificacion(constante) */
}
}
