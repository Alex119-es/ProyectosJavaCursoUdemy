package CiclosEnJava.CicloWhile_Do;

public class RetoNumerosImparesWhile {
    public static void main(String[] args) {
        System.out.println("Del 0 al 20 usando do while ");
        var numero = 0;/*rango */
        do {
            if (numero % 2 != 0) {
                System.out.println("numero impar: " + numero);
            }
            numero++;/*Iniciacion */
        } while (numero <= 20);/*limite */
 

/*metodo impar suma prima  */
        System.out.println("Del 1 al 19 usando do while");
        var numero_V2 = 1;
        do {
            System.out.println("numero_V2 impar: " + numero_V2);
            numero_V2 += 2;
        } while (numero_V2 <= 20);
    }
}

