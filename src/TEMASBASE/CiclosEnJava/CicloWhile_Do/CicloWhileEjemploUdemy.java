package TEMASBASE.CiclosEnJava.CicloWhile_Do;

public class CicloWhileEjemploUdemy {
    public static void main(String[] args) {
        System.out.println("***Ciclo while ***");

        var contador = 1;
        while (contador <= 5) {
            System.out.println(contador);
            contador++;

        }
        System.out.println("******************************************+");
        var contador_V2 = 10;/*inicio */
        while (contador_V2 >=0)/*limite */ {
            System.out.println(contador_V2);/*orden */
            contador_V2--;/*decremento */
        }
    }
}
