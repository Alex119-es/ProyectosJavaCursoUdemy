package RetoPosteriorSwitchIfElse;

import java.util.*;

public class RetoSistemaDeEnvios {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        final var tarifaPaqueteInternacional = 20;
        final var tarifaPaqueteNacional = 10;
        /* Scanner teclado=new Scanner(System.in); */
        System.out.println("Lugar donde ira el paquete: ");

        var ubicacion = teclado.nextLine();

        System.out.println("Destino donde va a ir el paquete: (nacional/internacional )");
        /*
         * Strip quita los espacios en blanco to lower case entrega el texto en
         * minusculas
         */
        var destino = teclado.nextLine().strip().toLowerCase();

        System.out.println("Peso del paquete en kilogramos (se incluye decimales)");

        var peso = Double.valueOf(teclado.nextLine());
        var precioEnvio = 0.0;

        if (destino.equalsIgnoreCase("nacional")) {
            precioEnvio = peso * tarifaPaqueteNacional;
            System.out.println(
                    "Destino de paquete: " + destino + " " + ubicacion + ", precio final de entrega del paquete: "
                            + precioEnvio);

        } else if (destino.equalsIgnoreCase("internacional")) {
            precioEnvio = peso * tarifaPaqueteInternacional;
            System.out.println(
                    "Destino de paquete: " + destino + " " + ubicacion + ", precio final de entrega del paquete: "
                            + precioEnvio);

        } else {
            System.out.println("Porfavor especificar envio internacional o nacional ERROR ");

        }
        /* Version Udemy */
        System.out.println("Destino del paquete :");

        destino = teclado.nextLine();

        System.out.println("Categoria donde va a ir el paquete: (nacional/internacional )");

        Double costoEnvio = switch (destino.strip().toLowerCase() /*O PUEDES USAR teclado.nextLine().toLowerCase().strip()*/) {
            case "nacional" -> peso * tarifaPaqueteNacional;
            case "internacional" -> peso * tarifaPaqueteInternacional;
            default -> {
                System.out.println("Error porfavor proveer un texto de paquete nacional o internacional ");
                yield null;
            }
        };


        if (costoEnvio != null) {
            System.out.println("El costo de envio de paquete es : " + costoEnvio + " destino : ".strip() + destino);


            
            /*
             * String a = "  M odsmfosm ".strip();
             * System.out.println(a);
             */

        }
        // System.out.println("Destino de paquete: " + destino + ", precio final de
        // entrega del paquete: " + costoEnvio);

    }
}