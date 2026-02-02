package TEMASBASE.Ejercicios_ScannerYPosterior;

import java.util.Random;

public class GenerarNumeroAleatorio {
static Random aleatoriador=new Random();

public static void main(String[] args) {
    System.out.println("usamos Random que es una clase/objeto para el metodo next ");
    var numeroDe0A9=aleatoriador.nextInt(10);
    System.out.println("Numero aleatorio de 0 a 9: "+numeroDe0A9);
     /*cuando no concadenamos un +1 despues del bound es 0 a la n-1 de ese numero a secas
     sin embargo si ponemos +1 al lado del mismo iniciara desde el 1 a la n de ese mismo numero sin aplicarse el "n-1"
      */
    var numeroDe0A10=aleatoriador.nextInt(10)+1;
    System.out.println("Numero aleatorio de 1 a 10: "+numeroDe0A10);
    if (numeroDe0A10==10){
      System.out.println("es 10");

    }
    else {
      System.out.println("no es 10");
    }
    /*En random no existe el metodo nextLine */
}
}
