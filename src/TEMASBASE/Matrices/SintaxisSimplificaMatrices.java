package Matrices;
import java.util.*;
public class SintaxisSimplificaMatrices {

    static Scanner teclado=new Scanner (System.in);

    public static void main(String[] args) {
    
 var matriz1=new int[][]{
    {100,200,300},
    {400,500,600}
};/*{}=arreglo entre otro arreglo */



for (int i = 0; i < matriz1.length; i++) {
    
    for (int j = 0; j < matriz1[i].length; j++) {
        System.out.println("Renglon ["+i+"] "+"columna ["+j+"] :"+matriz1[i][j]);
    }
}
}
}
