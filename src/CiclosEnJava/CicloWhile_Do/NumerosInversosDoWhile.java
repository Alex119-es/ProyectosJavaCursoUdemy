package CiclosEnJava.CicloWhile_Do;

/*usar el ciclo while o do while sirve dependiendo si queremos que se ejcuta almenos una vez el codigo do while
 pero si queremos que no se ejecute */
// ninguna vez el codigo si la condicion es verdadera entonces mejor usar while
public class NumerosInversosDoWhile {
    public static void main(String[] args) {
        System.out.println("Imprimimos 1 al 10 en orden inverso");
        var contador = 10;
        do {
            System.out.print(String.join(" ","", String.valueOf(contador)));
            contador--;
            /*
             * while es el que pone el limite y do es la parte que incrementa o decrementa
             * 
             */
        } while (contador >= 0);

        System.out.println("\n******************************************");
        var contador_V2 = 10;/* inicio */
        while (contador_V2 >= 0)/* limite */ {
            System.out.print(String.join(" ","", String.valueOf(contador_V2)));/* orden */
            contador_V2--;/* decremento */
        }
    }
}