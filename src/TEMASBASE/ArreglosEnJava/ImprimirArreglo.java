package TEMASBASE.ArreglosEnJava;
import java.util.*;
public class ImprimirArreglo {
    static Scanner teclado=new Scanner (System.in);
public static void main(String[] args) {
    System.out.println("Espacios");
    int [] nombreArreglo1=new int [Integer.valueOf(teclado.nextLine())];

for (int i = 0; i < nombreArreglo1.length; i++) {
    nombreArreglo1[i]=Integer.valueOf(teclado.nextLine());

}

for (int i = 0; i < nombreArreglo1.length; i++) {
    System.out.println("Valor ["+i+"] :"+nombreArreglo1[i]);
}
}
}
