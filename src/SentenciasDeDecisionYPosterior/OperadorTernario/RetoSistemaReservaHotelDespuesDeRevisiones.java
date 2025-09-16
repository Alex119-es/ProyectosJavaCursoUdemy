package SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.*;

public class RetoSistemaReservaHotelDespuesDeRevisiones {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        final double tarifaVistaConMar = 190.5;
        final double tarifaVistaSinMar = 150.5;

        System.out.println("Nombre cliente?: ");
        var nombreCliente = teclado.nextLine();
        System.out.println("Dias de estadia?: ");
        var diasEstadia = Integer.valueOf(teclado.nextLine());
        System.out.println("Vista al mar? (true/false)");
        var conVistaAlMar = Boolean.valueOf(teclado.nextLine());

        var precioTotal = 0.0;
        /*
         * System.out.println(conVistaAlMar ? "Si :)":"No :(");
         * 
         * boolean OperadorTernarioAlmacenadoPrevioAConsola=conVistaAlMar;
         * System.out.println(OperadorTernarioAlmacenadoPrevioAConsola ? "Si :)" :
         * "NO :(");
         */

        if (conVistaAlMar) {
            precioTotal = tarifaVistaConMar * diasEstadia;

        } else {
            precioTotal = tarifaVistaSinMar * diasEstadia;
        }

        System.out.println("Usuario: " + nombreCliente + "\nDias de estadia: " + diasEstadia + "\nVista al mar?: "
                + (conVistaAlMar ? "SI :)" : "No :("));
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
        boolean booleanoRandom = Boolean.valueOf(teclado.nextLine());
        System.out.println((booleanoRandom ? "true" : "false"));
        String.valueOf(booleanoRandom ? "true" : "false");
        System.out.println(booleanoRandom);
        /*
         * ULTIMA NOTA PARA UN SOUT SIN CONVERSION DE OBJETO EN BASE A UNA
         * CONCADENACION DE CADENAS TIENES QUE PONER UN PUTO PARENTESIS INTERNO
         * TODA ESTA VAINA PRINCIPALMENTE FUE POR UN PARENTESIS es decir
         */
        System.out.println("Hola" + "soy" + "una cadena concadenada"
                + "tengo muchos + pero ahora pondre un ternario dentro con otro parentesis dentro de mi estructura"
                + (booleanoRandom ? "true" : "false"));
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
