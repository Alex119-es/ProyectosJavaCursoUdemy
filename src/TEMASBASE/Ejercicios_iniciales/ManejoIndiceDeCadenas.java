package Ejercicios_iniciales;

public class ManejoIndiceDeCadenas {
   public static void main(String [] argumento){
       String cadenaSaludo="Hola Mundo";
       char indiceCaracterPrimero=cadenaSaludo.charAt(0);
       System.out.println(cadenaSaludo+"\n"+"el conteo de indice de cadenas se usa un dato de tipo char para extraerlo y tambien para elegir el numero de indice funciona como los arrays iniciando el primer indice con 0 dentro de los elementos que se ven a vista clara");
       System.out.println("primer caracter de la cadena de saludo: "+indiceCaracterPrimero);
       /*ahora probaremos algo con una funcion length*/
        char indiceUltimoCaracter=cadenaSaludo.charAt(cadenaSaludo.length() - 1);
        System.out.println("mostramos ultimo indice de la cadena usando.length()-1 :"+indiceUltimoCaracter);
        
   } 
}