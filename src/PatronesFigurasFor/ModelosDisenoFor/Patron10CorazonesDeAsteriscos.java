package PatronesFigurasFor.ModelosDisenoFor;

import java.util.Random;

public class Patron10CorazonesDeAsteriscos {
      static Random aleatorizador =new Random();
public static void main(String[] args) {
int numerorandom=Integer.valueOf(aleatorizador.nextInt(51));
System.out.println(numerorandom);
int rango=6;
for (int numeroFila = rango/2 ; numeroFila <=rango; numeroFila+=2) {
    for (int numeroAImprimir = 1 ; numeroAImprimir <rango-numeroFila; numeroAImprimir+=2) {
        System.out.print(" ");
    }for (int numeroAImprimir =1 ; numeroAImprimir <=numeroFila; numeroAImprimir++) {
        System.out.print("*");
    }for (int numeroAImprimir =1 ; numeroAImprimir <= rango-numeroFila; numeroAImprimir++) {
        System.out.print(" ");
    }
    for (int numeroAImprimir =1 ; numeroAImprimir <= numeroFila; numeroAImprimir++) {
        System.out.print("*");
    }
    System.out.println();
}
for (int numeroFila =rango ; numeroFila >=1; numeroFila--) {
    for (int numeroAImprimir =numeroFila ; numeroAImprimir < rango; numeroAImprimir++) {
        System.out.print(" ");
    }
    for (int numeroAImprimir =1 ; numeroAImprimir <=(numeroFila*2)-1; numeroAImprimir++) {
        System.out.print("*");
    }
    System.out.println();
}

}
}
