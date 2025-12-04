package Matrices;
import java.util.*;
public class RetoSumaDiagonalMatriz {
    static Scanner teclado=new Scanner(System.in);

public static void main(String[] args) {
    /* matriz 3 x3 almacenar los valores secuencialñes a 100+ */

    System.out.println("Dictar numero de renglones y posteriormente numero de columnas");
int [][]matrizSumaDiagonal=new int[Integer.valueOf(teclado.nextLine())][Integer.valueOf(teclado.nextLine())];

for (int i = 0; i < matrizSumaDiagonal.length; i++) {
   
    for (int j = 0; j < matrizSumaDiagonal[i].length; j++) {
   System.out.println("Ingresar valor de renglon ["+i+"] y columna ["+j+"] :");
   matrizSumaDiagonal[i][j]=Integer.valueOf(teclado.nextLine());
   
   

    }
}

int sumaDiagonal=0;
int sumaDiagonalContralado=0;

for (int i = 0; i < matrizSumaDiagonal.length; i++) {
    for (int j = 0; j < matrizSumaDiagonal[i].length; j++) {
        
        System.out.println(" Muestra de los valores dentro de la matriz :\n ["+i+"] ["+j+"] :"+matrizSumaDiagonal[i][j]);
        if (i==j) {
            sumaDiagonal+=matrizSumaDiagonal[i][j];
        System.out.println("\nIteracion de la suma numero ["+i+"] de manera diagonal primera salida : "+(sumaDiagonal));
        }
}
}
        System.out.println("\nSuma de todas las matrices de manera diagonal primera salida : "+(sumaDiagonal));


for (int k = 0; k < matrizSumaDiagonal.length; k++) {
    for (int l = 0; l < matrizSumaDiagonal[k].length; l++) {
        
System.out.println("\n Muestra de los valores dentro de la matriz :\n ["+k+"] ["+l+"] :"+matrizSumaDiagonal[k][l]);
if (k+l==matrizSumaDiagonal[0].length-1) /*el [0]puede ser [k] tambien por si acaso para que lea columnas en vez de fila
pero para la maquina o compilacion es menos optimizable*/{

sumaDiagonalContralado+=matrizSumaDiagonal[k][l];

    System.out.println("\nIteracion de la suma numero ["+k+"] de manera diagonal en contralado: "+(sumaDiagonalContralado));
}

}

}

System.out.println("\nSuma de todas las matrices de manera diagonal en contralado : "+(sumaDiagonalContralado));





}
}
