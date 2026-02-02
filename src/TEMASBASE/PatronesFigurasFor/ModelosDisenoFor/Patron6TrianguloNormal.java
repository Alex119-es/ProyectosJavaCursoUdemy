package TEMASBASE.PatronesFigurasFor.ModelosDisenoFor;

public class Patron6TrianguloNormal {
    public static void main(String[] args) {
        final int rango=5;
        for (int i = 1; i <= rango; i++) {
            for (int j = i; j < rango; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=(2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
