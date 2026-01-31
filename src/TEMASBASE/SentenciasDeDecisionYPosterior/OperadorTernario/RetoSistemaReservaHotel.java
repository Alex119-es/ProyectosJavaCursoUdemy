package SentenciasDeDecisionYPosterior.OperadorTernario;

import java.util.*;

public class RetoSistemaReservaHotel {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nombre de usuario: ");
        var nombreCliente = String.valueOf(teclado.nextLine());
        System.out.println("Dias de estadia: ");
        var diasEstanciados = Integer.valueOf(teclado.nextLine());
        /*
         * para elegir un valor booleano en el contexto de una cadena debemos de crear
         * primero la cadena que comparara dentro el if ya que NOTA IMPORTANTE el metodo
         * equalsIgnoreCase se usa solmanete para cadenas
         * despues de eso usaremos un valor de tipo boolean o un var definido y de hay
         * lo modificaremos dentro de el bloque de codigo if
         * YA AL FINAL DE TODo el mensaje final si no queremos que nos muestre false o
         * true crearemos otra varaible cadena que contenga el mensaje
         * que realmente quisieramos transmitir
         */
        System.out.println("Cuarto con vista al mar?:(si/no) ");
        String respuestaVistaAlMar = teclado.nextLine();

        boolean vistaAlMar;
        String transicionDeVistaAlMar;

        if (respuestaVistaAlMar.equalsIgnoreCase("si")) {
            vistaAlMar = true;
            transicionDeVistaAlMar = "SI =)";
        } else if (respuestaVistaAlMar.equalsIgnoreCase("no")) {
            vistaAlMar = false;
            transicionDeVistaAlMar = "NO =(";
        } else {
            vistaAlMar = false;
            transicionDeVistaAlMar = "mal definido repetir porfavor";
            System.out.println("respuesta fuera de contexto por favor responder correctamente");
        }

        /* 150.5 por dia sin mar con mar 190.5 */

        var costoTarifa = 0.0;

        if (vistaAlMar == true) {
            Double.valueOf(diasEstanciados);
            costoTarifa = 190.50 * diasEstanciados;

        } else {
            Double.valueOf(diasEstanciados);
            costoTarifa = 150.50 * diasEstanciados;
        }

        var costoTotal = costoTarifa;
        System.out.println(
                "Hola:\"" + nombreCliente + "\" \ntienes vista al mar?: " + transicionDeVistaAlMar
                        + " \n cantidad de dias: "
                        + diasEstanciados + "\npor ultimo de costo total respecto a los dias es: " + costoTotal);

        System.out.println("****** SIGUIENTE PROCESO *****");
        /* version facil */
        System.out.println("Nombre de usuario: ");
        var nombreClienteV2 = String.valueOf(teclado.nextLine());
        System.out.println("Dias de estadia: ");
        var diasEstanciadosV2 = Integer.valueOf(teclado.nextLine());

        System.out.println("Cuarto con vista al mar?:(true/false) ");
        var vistaAlMarV2 = Boolean.valueOf(teclado.nextLine());

        var costoTarifaV2 = 0.0;
        /*
         * Nota de udemy al final no necesitas definir == true porque lo lee dentro del
         * booleano lo puedes hacer por si las dudas pero eso
         */
        if (vistaAlMarV2 == true) {
            Double.valueOf(diasEstanciadosV2);
            costoTarifaV2 = 190.50 * diasEstanciadosV2;

        } else {
            Double.valueOf(diasEstanciadosV2);
            costoTarifaV2 = 150.50 * diasEstanciadosV2;
        }

        var costoTotalV2 = costoTarifaV2;
        System.out.println("Hola :\"" + nombreClienteV2 + "\" \ntienes vista al mar?: " + vistaAlMar+","+ (vistaAlMarV2 ? "Si :)" :"No ;(")
                + " \n cantidad de dias: " + diasEstanciadosV2
                + "\npor ultimo de costo total respecto a los dias es: " + costoTotalV2);
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
