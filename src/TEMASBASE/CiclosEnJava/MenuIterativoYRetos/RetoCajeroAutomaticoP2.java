package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;
import java.util.*;
public class RetoCajeroAutomaticoP2 {
static Scanner teclado=new Scanner(System.in);

    public static void main(String[] args) {
    var saldo=1000.00;
System.out.println("Cajero automatico");
boolean sistemaEstaDentro=false;
while (!sistemaEstaDentro) {
    System.out.println("""
            Opciones
            1.Depositar
            2.Retirar
            3.Consultar
            4.SAlir
            """);
            var opcion=Integer.valueOf(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar valor que quiere depositar: ");
                    var dineroDepositado=Double.valueOf(teclado.nextLine());
                    saldo+=dineroDepositado;
                    System.out.println("Dinero depositado: "+dineroDepositado+" total: "+saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el valor a retirar");
                    var dineroRetirado=Double.valueOf(teclado.nextLine());

                    if (dineroRetirado<=saldo) {
                        saldo-=dineroRetirado;
                        System.out.println("Dinero a retirar: "+dineroRetirado+" ,total: "+saldo);
                    }
                    else{
                        System.out.println("Dinero mas alla de su saldo actual "+saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo actual es: "+saldo);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    sistemaEstaDentro=true;
                    break;
            
                default:System.out.println("Rango de numero fuera de los valores determinados reintentar nuevamente...");
                    break;
            }
System.out.println("Fin del sistema");
        }

}
}
