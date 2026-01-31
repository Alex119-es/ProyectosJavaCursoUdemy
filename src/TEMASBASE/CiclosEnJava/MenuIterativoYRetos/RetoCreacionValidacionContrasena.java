package CiclosEnJava.MenuIterativoYRetos;

import java.util.*;

public class RetoCreacionValidacionContrasena {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        var sistemaContraseña = false;
        while (!sistemaContraseña) {

            System.out.println("SE solicita una contraseña de 6 caracteres");
            var contraseñaCreada_V2 = teclado.nextLine();

            if (contraseñaCreada_V2.length() >= 6) {
                System.out.println("Contraseña valida: " + contraseñaCreada_V2);
                sistemaContraseña = true;
            } else {
                System.out.println("Contraseña invalida intente de nuevo\n");
            }
        }
        System.out.println("saliendo del programa...");

//*******************************************************VERSION UDEMY */
System.out.println("SE solicita una contraseña de 6 caracteres");
var contraseñaCreada_V2=teclado.nextLine();

while (contraseñaCreada_V2.length()<6) {
    System.out.println("La contrsaseña no cumple con los requisitos");
    System.out.println("INgrese un nuevo valor de la contraseña");
    contraseñaCreada_V2=teclado.nextLine();
}
System.out.println("el valor de la contraseña es valida");
    }
}
