package PatronesFigurasFor.ModelosDisenoFor;

public class Patron9_X_DeAsteriscos {
public static void main(String[] args) {
    int rango=5;
    for (int numeroFila = 1; numeroFila <=rango; numeroFila++) {
        for (int numeroImprimir = 1; numeroImprimir <=rango; numeroImprimir++) {
            if (numeroImprimir==numeroFila||numeroImprimir==rango-numeroFila+1) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
