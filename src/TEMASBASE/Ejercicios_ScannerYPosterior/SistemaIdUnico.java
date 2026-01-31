package Ejercicios_ScannerYPosterior;

import java.util.*;

public class SistemaIdUnico {
    static Scanner teclado = new Scanner(System.in);
    static Random aleatorizador = new Random();

    public static void main(String[] args) {

        System.out.println("Sistema generador Id unico\n Cual es tu nombre: ");
        var nombreSistema = teclado.nextLine();
        System.out.println("Dime tu apellido: ");
        var apellidoSistema = teclado.nextLine();
        System.out.println("Dime tu año de nacimiento:");
        var añoNacimiento = teclado.nextInt();
        /* codigo aleatorio de 4 numeros */
        var codigoAleatorio = aleatorizador.nextInt(1000) + 1;

        System.out.printf("Codigo aleatorio: \n%04d%n ", codigoAleatorio);
        /* ahora solo nos falta los dos caracteres */
        var caracteresNombre = nombreSistema.substring(0, 2);
        System.out.println("Caracteres del nombre: " + caracteresNombre.toUpperCase());
        var caracteresApellido = apellidoSistema.substring(0, 2);
        System.out.println("Caracteres de apellido: " + caracteresApellido.toUpperCase());

        var conversionAño = String.valueOf(añoNacimiento);

        var añoCadena = conversionAño.substring(2, 4);
        System.out.println(añoCadena);
        /*
         * Este codigo de abajo es sin usat el System.out printf o metodos como
         * String.format
         */
        /*
         * var idUnico="El id unico tuyo es: "+caracteresNombre.toUpperCase()+
         * caracteresApellido.toUpperCase()+añoCadena+codigoAleatorio;
         * System.out.println(idUnico);
         */
        System.out.printf("Hola "+nombreSistema+"\nTu Id unico: %s%s%s%04d", caracteresNombre.toUpperCase(), caracteresApellido.toUpperCase(),
                añoCadena, codigoAleatorio);

    }

}