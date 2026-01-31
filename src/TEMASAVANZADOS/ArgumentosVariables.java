package TEMASAVANZADOS;
public class ArgumentosVariables {
public static void main(String[] args) {
    // imprimirNumeros(1,2,3,4,5); // varargs argumentos variables
    variosParametros("Karla",10,20,30);
}

 private static void variosParametros(String nombre,int ... numeros) {

System.out.println("Nombre: "+nombre);
imprimirNumeros(numeros);
// osea en si podemos meter metodos en metodos y que esos se lean directamente por argumentos variables SIEMPRE SE SIGUE UN ORDEN LOS ARGUMENTOS VARIABLES SE PONEN AL FINAL Y LOS QUE NO AL INICIO
}

 static void imprimirNumeros(int ... numeros )/*los puntos indican numero indefninido de parametros pero en general son de ese mismo tipo es decir varios numeros de tipo int */ {

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]+" ");
}

}
}
