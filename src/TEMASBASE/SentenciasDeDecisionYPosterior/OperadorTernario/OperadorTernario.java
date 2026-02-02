package TEMASBASE.SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.Scanner;

public class OperadorTernario {
    static Scanner consola = new Scanner(System.in);

    /*
     * por ahora yo lo entiendo como una manera de expresar if else o if else_if
     * else
     */
    public static void main(String[] args) {
        System.out.println("Operador Ternario\n");

        /*
         * Sintaxis
         * condicion ? exp1 : exp2
         * 
         * Determina si un numero es par o no
         */
        var numero = 5;
        var resultado = ((numero % 2 == 0)) ? "Expresion 1 : numero Par que llega a 0"
                : "Expresion 2 : numero Impar que no llega a 0";
        System.out.println(resultado + ": " + numero);
        /* Calcular si es mayor de edad */
        var edad = 17;
        var mensaje = (edad >= 18) ? "Usted es mayor de 18 años" : "Usted es menor de 18";
        System.out.println("\n" + mensaje + ": " + numero);

        /*
         * Valor positivo o cero (operador ternario anidado) if else if la ultima
         * expresion es el else final
         */
        numero = 0;
        resultado = (numero > 0) ? "el numero es positivo" : (numero < 0) ? "Negativo " : "El numero es 0 ";
        System.out.println("\n" + resultado + ": " + numero);

      /*
         * version almacenada en una variable almacenada,tambien se puede hacer sin una
         * variable
         *//* OperadorTernarioAlmacenadoPrevioAConsola) */;
        /*
         * version intelectual convertidas a cadenas :v : String.valueOf(conVistaAlMar ?
         * "Si :)" : "No :(") + "\nPrecio total: " + precioTotal);
         */
        /* System.out.println(conVistaAlMar ? "SI :)":"No :(" ); */

        /*
         * NOTA de udemy:una cosa que no enseño el cabron de Udemy es que podemos
         * aplicar un ternario directamente
         * a cualquier variable que haya tenido un proceso como
         * "a =a.(proceso,conversion,operacion)" PERO
         * a la vez tenemos que transformarlo en el tipo de dato Objeto.valuOf si no
         * vamos a imprimir
         * en la consola formateada antes
         * DEBIDO A QUE EL METODO System.out O outf lleva en si o espera la cadena
         * debido a eso es factible , es
         * decir el operador ternario recibe principalmente una cadena que adentro se
         * compara con un booleano
         */
        var booleanoRandom = Boolean.valueOf(consola.nextLine());
        System.out.println((booleanoRandom ? "true" : "false"));
        String.valueOf(booleanoRandom ?"Si":"No");
       int almacenadoInteger= Integer.valueOf(booleanoRandom ? 1 : 2);
        System.out.println(almacenadoInteger);
        /*
         * ULTIMA NOTA PARA UN SOUT SIN CONVERSION DE OBJETO EN BASE A UNA
         * CONCADENACION DE CADENAS TIENES QUE PONER UN PUTO PARENTESIS INTERNO
         * TODA ESTA VAINA PRINCIPALMENTE FUE POR UN PARENTESIS es decir
         */
        System.out.println("Hola" + " soy" + " una cadena concadenada"
                + " tengo muchos + pero ahora pondre un ternario dentro con otro parentesis dentro de mi estructura"
                + (booleanoRandom ? " true" : "false"));
        /*
         * Originariamente los var que se hacen del operadorternario no son booleanos en
         * si
         * son Strings que se comparan despues a dentro con un booleano dentro del
         * proceso del operador ternario
         * y que dependen de un dato externo como un numero o etc
         * var es el unico que puede modificar sin usar un valueOf como variable
         * almacenada
         * varios tipos de datos
         */
        var numeroExterno = 2;
        /* aqui hay String */ var comparacionTernariaBooleana = (numeroExterno < 3) ? numeroExterno = 5 : "False";
        System.out.println(comparacionTernariaBooleana);

        boolean booleanoRandom2 = true;
        System.out.println((booleanoRandom2 ? "true" : "false"));
             System.out.println(booleanoRandom2 ? "true" : "false");

    }
}
