package Operadores_Java;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("Operadores de Asignacion\n");
        int miNumero;
        miNumero = 15; // Asignacion simple
        /* Asignacion compuesto */
        // +=  
        System.out.println("MiNumero= " + miNumero);
        miNumero=+3;
        System.out.println("miNumero =+3 : "+miNumero);  
        miNumero=-4;
        System.out.println("miNumero=-4: "+miNumero);    
        miNumero += 5; // miNumero=miNumero+5 ,se puede con los demas simbolos
        System.out.println("miNUmero +=5 es = " + miNumero);
        /* Agarra el resultadoa anterior y lo multiplica con la nueva asignacion
         * miNUmero=miNumero*2 
         */

/*simbolo= || cambia el valor de una variable con su proceso operando y 
posterior se lleva el 
resultado a el siguiente proceso el cual si se repite se lleva el resultado actual 
de ese proceso 

=simbolo || reemplaza directamente solo el valor no aplica en si una operacion aritmetica
es decir que si se repite otro no hace un proceso de operando como suma resta etc sino que 
directamente reemplaza el valor a ese numero que hemos asignado

 */

        miNumero *= 2;
        System.out.println("miNumero *=2 es: " + miNumero);
        /* Asignacion de variables multipl3s */
        int a = 10, b = 15, c = 20;/* con var no se puede definir muchas variables solo una */
        System.out.printf("a = %d, b= %d,c = %d ", a, b, c);

    }
}
