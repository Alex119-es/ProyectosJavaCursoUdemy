package TEMASBASE.Funciones;

import java.util.Scanner;

public class FuncionPar {
    static Scanner teclado=new Scanner(System.in);

    /*Funcion si queremos saber si un numero es par 
    NOTA:no puede haber mas codigo despues del return ya que es la sentencia que finbaliza la ejecucion*/
    static boolean verificarPar(int numero){
    // if (numero%2==0) {
    //     return true;
    // }
    // else{
    //     return false;
    // }
    return ((numero%2==0))? true:false;

    }
    
    
    public static void main(String[] args) {

       System.out.println("Proporciona un valor numerico :");

       int numero=Integer.parseInt(new Scanner(System.in).nextLine()); 
    //    int numero=Integer.valueOf(teclado.nextLine()); 
    System.out.println("Numero par?: "+verificarPar(numero)
        /*Ojo aqui usa la variable numero como argumento pero no usa desde la funcion es decir que cada uno solo se basa dentro de su bloque de 
    codigo */);

}
}
