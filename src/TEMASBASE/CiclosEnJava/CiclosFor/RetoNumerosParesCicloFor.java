package TEMASBASE.CiclosEnJava.CiclosFor;

public class RetoNumerosParesCicloFor {
public static void main(String[] args) {
    System.out.println("Del 1 al 20 ciclo for");
    for (int i = 0; i <=20; i++) {
        if (i %2==0) {
            System.out.print("Numero par "+i +"\n ");
        }
    }
}
}
