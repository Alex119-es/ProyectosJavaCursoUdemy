package SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.Scanner;

public class RetoSistemaReservaHotelUdemy {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        // Variables del hotel
        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;

        // Pedimos la información al cliente
        var consola = new Scanner(System.in);

        System.out.print("Nombre del Cliente: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Con vista al mar (true/false)? ");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Cálculo de costo total de la estadía
        var costoTotal = 0.0;
        if (conVistaAlMar)
            costoTotal = diasEstadia * TARIFA_DIARIA_CON_VISTA_MAR;
        else
            costoTotal = diasEstadia * TARIFA_DIARIA_SIN_VISTA_MAR;

        // Mostramos los detalles de la reserva
        System.out.printf("""
                %n------------ Detalles de la Reservación -----------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal,
                (conVistaAlMar ? "Sí :)" : "No :("));
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
        boolean booleanoRandom = Boolean.valueOf(consola.nextLine());
        System.out.println((booleanoRandom ? "true" : "false"));
        String a = String.valueOf((booleanoRandom ? "true" : "false"));
        System.out.println(a);
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
