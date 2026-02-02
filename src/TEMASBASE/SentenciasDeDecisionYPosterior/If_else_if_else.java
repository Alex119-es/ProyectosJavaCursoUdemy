package TEMASBASE.SentenciasDeDecisionYPosterior;
import java.util.*;
public class If_else_if_else {
static  Scanner teclado=new Scanner(System.in);
public static void main(String[] args) {
    var edad=Integer.valueOf(teclado.nextLine());
        if (edad >= 18) {
            System.out.println("Usted es adulto");
        } else if(edad>13 && edad<18){
        System.out.println("Eres un adolescente");
        }else {
            System.out.println("Eres un niño");
        }
}
}
