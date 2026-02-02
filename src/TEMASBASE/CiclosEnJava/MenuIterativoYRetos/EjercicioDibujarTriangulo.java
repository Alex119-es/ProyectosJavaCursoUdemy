package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;

import java.util.Scanner;

public class EjercicioDibujarTriangulo {

static Scanner teclado=new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Proporciona el numero de filas");
var numeroFilas=Integer.valueOf(teclado.nextLine());

// iterar sobre cada fila del triangulo?

for (int fila = 1; fila <= numeroFilas; fila++) {
    var espaciosBlancos= " ".repeat(numeroFilas-fila);
    var asteriscos="*".repeat(2*fila-1);
    System.out.println(espaciosBlancos+asteriscos);

}
}
}
