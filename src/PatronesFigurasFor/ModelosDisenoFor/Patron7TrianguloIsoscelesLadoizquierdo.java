package PatronesFigurasFor.ModelosDisenoFor;

public class Patron7TrianguloIsoscelesLadoizquierdo {
    public static void main(String[] args) {
        int rango = 5;
        /*mitad ascendente */

        for (int numeroFila = 1; numeroFila <= rango; numeroFila++) {
            for (int j = 1; j <= numeroFila; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*mitad descendente */
for (int i = rango; i >=1 ; i--) {
    for (int j = 1; j <=i ; j++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
