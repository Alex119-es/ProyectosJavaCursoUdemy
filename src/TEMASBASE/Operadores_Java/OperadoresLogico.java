package TEMASBASE.Operadores_Java;

public class OperadoresLogico {
public static void main(String[] args) {
    /*Evaluan dos valores son booleanos y revisan un valor logico and && si los dos son verdaderos es verdadero or || si uno es verdadero es verdadero 
    ! negacion invierte el valor logico o cambia el resultado de la misma UNA DIFERENCIA DE ESTOS CON LOS DE COMPARACION ES QUE SE BASA EN UNA LOGICA BOOLEANA
    Y NO EN UN VALOR DE INCREMENTO O DECREMENTO LOGICO o por posicion en caso de String*/
 

    System.out.println("Operador AND:");
    boolean a=true,b=false,c=true,d=false;
    System.out.printf("Valores a:%b,b:%b,c:%b,d:%b%n",a,b,c,d);
    /*And regresa true si ambos son true */
var resultado= a && b;
System.out.println("a && b = "+resultado);
 resultado= a &&c ;
System.out.println("a && c = "+resultado);

/* OR verdadero si cualquier valor es verdadero */
resultado = a || b;
System.out.println("a || b = "+resultado);
resultado= b || d;
System.out.println("b || d = "+resultado);

/*NOT invertir el valor logico porporcionado sea a nivel de proceso o a nivel de dato */
resultado = a && c;
System.out.println("Not hacia a && c: "+!resultado);



}













}
