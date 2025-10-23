package PatronesFigurasFor;

public class Modelo2SemiPiramideInversa {
public static void main(String[] args) {
    int rango=5;
    for (int i = rango; i >=1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
