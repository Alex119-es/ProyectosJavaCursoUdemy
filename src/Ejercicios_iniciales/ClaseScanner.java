
package Ejercicios_iniciales;
import java.util.*;
public class ClaseScanner {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Creamos objeto scanner imstanciado y lo ejejcutamos con System.in asi que dime \n escribe un texto o algo para almacenarlo dentro de la variable Scanner: ");
        
        String textoScanner=teclado.nextLine();
        System.out.println("la linea que introduces es: "+textoScanner);
        
        
    }
}