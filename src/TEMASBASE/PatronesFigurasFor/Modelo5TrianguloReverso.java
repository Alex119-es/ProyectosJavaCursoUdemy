package TEMASBASE.PatronesFigurasFor;
import java.util.*;
public class Modelo5TrianguloReverso {

    public static void main(String[] args) {
    
int rango=5;
for (int numeroFilas = rango; numeroFilas >=1; numeroFilas--) {
    for (int vecesImprimir = numeroFilas; vecesImprimir < rango; vecesImprimir++) {
        System.out.print(" ");
    }
    for (int vecesImprimir = 1; vecesImprimir <=(2*numeroFilas-1); vecesImprimir++) {
System.out.print("*");        
    }
    System.out.println();
}


}
}
