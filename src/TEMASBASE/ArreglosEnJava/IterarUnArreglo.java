package TEMASBASE.ArreglosEnJava;

public class IterarUnArreglo {
public static void main(String[] args) {
   /*iterar con un ciclo for */ 
   int []enteros=new int[]{100,200,300,400,500};
   
   for (int i = 0; i <enteros.length; i++) {/*i va recorriendo en 0 a 1 hasta el numero total de elementos es decir 5 en este caso   */
    System.out.println("Valor de indice "+i+" = "+ enteros[i]);
   }/*Nota:cuando cuentas dentro de los arreglos es inicio con 0 pero cuando trabajas ya con otros procesos o subderivados de ese arreglo inician con uno */
}
}
