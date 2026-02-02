package TEMASBASE.Ejercicios_iniciales;
import java.util.*;
public class Main3 {
public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    // // var scaneado=teclado.nextLine();
    // System.out.println(scaneado);

    // scaneado=teclado.nextLine();
    // System.out.println(scaneado);

    var prueba1=Integer.valueOf(teclado.nextLine());
    System.out.println(prueba1);
    prueba1=Integer.valueOf(teclado.nextLine());
    System.out.println((prueba1+=prueba1));
}
}
