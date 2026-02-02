package TEMASAVANZADOS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArgumentosVariables {
public static void main(String[] args) {
    // imprimirNumeros(1,2,3,4,5); // varargs argumentos variables
    variosParametros("Karla",10,20,30);
}

 private static void variosParametros(String nombre,int ... numeros) {
/*¿Por qué sucede esto?
Varargs (int...) se tratan internamente como un arreglo (int[])
Los arreglos en Java no tienen un toString() sobrescrito que muestre su contenido
Por eso ves algo como [I@1b6d3586 (donde [I significa "array de int")
En resumen: los arreglos no se convierten automáticamente a texto legible, necesitas Arrays.toString() para ver su contenido.
*/
System.out.println("Nombre: "+nombre+",numeros: "+numeros);
imprimirNumeros(numeros);

System.out.println("Nombre: "+nombre+",numeros: "+Arrays.toString(numeros));

// osea en si podemos meter metodos en metodos y que esos se lean directamente por argumentos variables SIEMPRE SE SIGUE UN ORDEN LOS ARGUMENTOS 
// VARIABLES SE PONEN AL FINAL Y LOS QUE NO AL INICIO

}

 static void imprimirNumeros(int ... numero )/*los puntos indican numero indefninido de parametros pero en general son de ese mismo tipo es decir varios
  numeros de tipo int */ {

for (int i = 0; i < numero.length; i++) {
    System.out.println(numero[i]+" ");
}

}
}
