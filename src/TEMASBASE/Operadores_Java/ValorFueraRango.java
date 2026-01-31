package Operadores_Java;
import java.util.*;

public class ValorFueraRango {
static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Proporciona un dato entero: ");
        var dato=Integer.valueOf(teclado.nextLine());

/*Resviasamos si esta dentro de rango (entre 1 y 10) */
var estaDentroRango= dato >=1 && dato <=10;

System.out.println("Variable dentro de rango (1 y 10)? :"+estaDentroRango);

/*Revisar la logica inversa,si el dato esta fuera de rango 
 * podemos abarcar todo el resultado y no afectar solo a una variable en especifico añadiendo un conjunto en parentesis
*/
var estaFueraDeRango= !(dato >=1 && dato<=10);

System.out.println("Variable dentro de rango (1 y 10)? aplicando logica inversa :"+estaFueraDeRango);
}
}
