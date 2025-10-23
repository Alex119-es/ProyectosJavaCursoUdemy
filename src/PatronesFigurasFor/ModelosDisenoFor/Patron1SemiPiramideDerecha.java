
package PatronesFigurasFor.ModelosDisenoFor;

public class Patron1SemiPiramideDerecha {
public static void main(String[] args) {
    // int n=5;
    // for (int i = 1; i <=n; i++)/*num filas */ {
    //     for (int j = 1; j <=i; j++)/*num estrellas */ {
    //         System.out.print("*");
            
    // }
    // }
 /*me doy cuenta que no se debe de repetir a cada rato y sucede porque esta antes
  * del ciclo como la vez que hice el while y el contador estaba antes de todo el texto if 
  */
    // System.out.println("\n**********************************");
      int numero = 5;
        // Bucle para las filas
        for (int i = 1; i <= numero; i++) {
            // Bucle para las estrellas en cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Imprime la estrella sin salto de línea
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
}
}
