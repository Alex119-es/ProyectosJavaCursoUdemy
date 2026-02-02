package TEMASBASE.PatronesFigurasFor.ModelosDisenoFor;

public class Patron3CeroDeAsteriscos {
    public static void main(String[] args) {
        int rango = 5;
        for (int i = 1; i <= rango; i++) {
            for (int j = 1; j <= rango; j++) {
                if (j == 1 || j == rango || i == 1 || i == rango) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        Semipiramide();
        System.out.println("\n");
        Patron3CeroDeAsteriscos instancia=new Patron3CeroDeAsteriscos();/*metodo sin instanciar dentro de la clase igual a nueva instancia de la misma clase no a nivel
        de nuevo objeto en funcion  */
        instancia.PiramideInversa();
    }

    public static void Semipiramide() {
        int rango = 5;
        for (int i = 1; i <= rango; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void PiramideInversa() {
        int rango = 5;
        for (int i = rango; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            System.out.print("*");    
            }
            System.out.println();
        }
    }
}
