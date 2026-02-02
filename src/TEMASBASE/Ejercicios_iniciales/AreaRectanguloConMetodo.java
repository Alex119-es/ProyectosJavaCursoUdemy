package TEMASBASE.Ejercicios_iniciales;

public class AreaRectanguloConMetodo {
    public static int MetodoRectangulo(int lado1, int lado2) {
        return lado1 * lado2;
    }

    public static void main(String[] args) {
        /*
         * tratamos de no usar un metodo void pero si queremos rellenar los lados
         * podemos abarcarlos con otras variables que almacenenel espacio de los mismos
         */
        int ladoA = 4;
        int ladoB = 3;
        /*
         * en este caso cubrimos los parametros con
         * otras variables y poder mostrarlas con el System.out
         * asi usando ladoA y ladoB para cubrirlas
         */

        int calculoDeAreas = MetodoRectangulo(ladoA, ladoB);
        System.out.println("el rectangulo de " + ladoA + " por " + ladoB + " tiene un area de " + calculoDeAreas);

    }
}