package TEMASBASE.CiclosEnJava.CicloWhile_Do;

public class CiclosDoWhile {
    public static void main(String[] args) {
        /*
         * la diferencia que tiene con while es que ejecuta para un numero infinito de
         * cosas hasta que se cumpla una condicion que ojo no necesariamente tiene que
         * se int pero que mayormente lo es
         * primero hace la actividad y luego revisa la condicion
         */
        var variable_contador = 1;
        do {
            System.out.println(variable_contador);
            variable_contador++;
        } while (variable_contador <= 3);

    }
}
