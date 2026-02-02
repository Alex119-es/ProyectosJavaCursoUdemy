package TEMASBASE.Ejercicios_iniciales;

public class BusquedaIndiceSubcadenas {
    
    public static void main(String[] args) {
        var cadena1="Hola Mundo";
        System.out.println(cadena1);
        /*INDICE:primer elemento con el que inicia dentro de alg*/
        /*lee el primer indice EN LA PRIMERA APARICION DE LA CADENA ES DECIR 
         * LA PRIMERA PALABRA ANTES DEL ESPACIO*/
         
        var indiceInicialSubcadena=cadena1.indexOf("Hola");
           /*lee el ultimo indice de APARICION DE LA SUBCADENA ES 
            * DECIR LEE EL INDICE DE MUNDO PORQUE ES LA SEGUNDA Y LA ULTIMA 
            * APARICION DE ESA CADENA DENTRO DEL RANGO DE SUBCADENAS
            */
        var indiceFinalSubcadena=cadena1.lastIndexOf("Mundo");
        System.out.println(indiceInicialSubcadena);
        System.out.println(indiceFinalSubcadena);
        
        var cadena1_1=cadena1.lastIndexOf(cadena1);
        /*esto es similar a decir:Es similar a 
         * preguntar: "¿Dónde está la última vez
         * que encuentro la palabra 'manzana' dentro de 
         * la palabra 'manzana'?" La respuesta siempre 
         * será el índice donde comienza la palabra, 
         * que en este caso es 0.*/
         
        System.out.println(cadena1_1);
        var cadenaIndiceInexistente=cadena1.lastIndexOf("Java");
        System.out.println(cadenaIndiceInexistente);
        
        
    }
    
}