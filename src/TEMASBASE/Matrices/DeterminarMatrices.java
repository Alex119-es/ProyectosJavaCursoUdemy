package TEMASBASE.Matrices;
import java.util.*;
public class DeterminarMatrices {
static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
// /*Introducir valores a una matriz */

// int renglones,columnas;

// /*Definir la matriz */
// System.out.println("Proporciona numero de los renglones");
// renglones=Integer.valueOf(teclado.nextLine());
// System.out.println("Proporciona numero de las columnas");

// columnas=Integer.valueOf(teclado.nextLine());


// var matriz=new int [renglones][columnas];
// /*Solicitar los valores */
// for (int i = 0; i < renglones; i++) {
   
//     for (int j = 0; j < columnas; j++) {
        
//         System.out.println("Valor ["+i+"]["+j+"] =");
//         matriz[i][j]=Integer.valueOf(teclado.nextLine());
//     }
// }
// /*Iterar los valores de la maatriz */
// for (int i = 0; i < renglones; i++) {
//     for (int j = 0; j < columnas; j++) {
// System.out.println("Valor ["+renglones+"]["+columnas+"] ="+matriz[i][j]);    }
// }

System.out.println("Dicte el numero de renglones y posteriormente de columnas");
var matriz2=new int [Integer.valueOf(teclado.nextLine())]
[Integer.valueOf(teclado.nextLine())];

for (int i = 0; i < matriz2.length; i++) {
 for (int j = 0; j < matriz2[i].length; j++) {
    System.out.println("Valor para renglon ["+i+"] y columna ["+j+"] :");
matriz2[i][j] =Integer.valueOf(teclado.nextLine()); 

}   
}
for (int i = 0; i < matriz2.length; i++) {
    for (int j = 0; j < matriz2[i].length; j++) {
        System.out.println("Muestra de valor ["+i+"] y columna ["+j+"] :"+matriz2[i][j]);
    }
}

}
}
