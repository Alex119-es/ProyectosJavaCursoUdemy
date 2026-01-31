package CiclosEnJava.CicloWhile_Do;

public class NumerosParesWhile {
    public static void main(String[] args) {
        System.out.println("Numeros pares del 1 al 20");

        var contador = 1;
        while (contador <= 20) {
            /*
             * simbolos como =% o con demas simbolos no se aplican aqui ya que solo puedes
             * poner booleanos y estos son para expresiones de tipo int
             */
            /* Aqui unicamente revisamos si el numero es par */
            if (contador % 2 == 0) {
                System.out.println("es par " + contador);
            }
            contador++;
            /* TOMAR IMPORTANCIA DE LLAVES */
        }

    }
}
