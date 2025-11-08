package PatronesFigurasFor.ModelosDisenoFor;

public class Patron8TrianguloVacioInterno {
    public static void main(String[] args) {
        int rango = 5;
        for (int i = 1; i <= rango; i++) {
            for (int j = i; j < rango; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == rango) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
