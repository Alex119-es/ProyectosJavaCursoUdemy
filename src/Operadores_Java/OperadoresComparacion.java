package Operadores_Java;

public class OperadoresComparacion {
public static void main(String[] args) {
    /*compara dos valores y devuelve un booleano */
System.out.println("Operadores de comparacion");


int a=3,b=2;
/*Igualdad == */
var resultado = a ==b;
System.out.println("resultado = a ==b: "+resultado);
/* Distinto != */
resultado = a!=b;
System.out.println("resultado = a!=b: "+resultado);
/*Mayor que */
resultado=a > b;
System.out.println("resultado=a > b: "+resultado);
/*Mayor o igual que  */
resultado=a>=b;
System.out.println("resultado=a>=b: "+resultado);

/*Menor que 
 */
resultado=a<b;
System.out.println("resultado=a<b: "+resultado);
/*Menor o igualk que  */
resultado=a<=b;
System.out.println("resultado=a<=b: "+resultado);



}
}
