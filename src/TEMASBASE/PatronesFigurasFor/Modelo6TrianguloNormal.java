package PatronesFigurasFor;
import java.util.*;
public class Modelo6TrianguloNormal {
public static void main(String[] args) {
    final int rango=5;
for (int numeroFilas = 1; numeroFilas <= rango; numeroFilas++) {
    for (int numeroImpresiones = 0; numeroImpresiones < args.length; numeroImpresiones++) {
        System.out.print(" ");
    }
    for (int numeroImpresiones = 0; numeroImpresiones <= args.length; numeroImpresiones++) {
        System.out.print("*");
    }
    System.out.println();
}
}
}
