package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;

import java.util.*;

public class MenuIterativo {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;/*
                               * asumimos que no queremos salir del sistema hasta que demos el 3 lo que
                               * cambiara el booleano a true
                               */
        // COmenzar con la iteracion del menu
        while (!salir) {
            System.out.println("""
                    ***SISTEMA DE ADMINISTRACION DE CUENTAS***********************************++
                    1.Crear cuenta
                    2.Eliminar cuenta
                    3.Salir
                    Escoje una opcion:\s
                    """);
            // leer opcion
            var opcion = Integer.valueOf(teclado.nextLine());
            // Evaluar cada opcion
            switch (opcion) {
                // En Java, la palabra clave yield solo funciona dentro de una expresión switch,
                // no dentro de una instrucción switch tradicional.
                case 1 ->
                    System.out.println("creando tu cuenta ...\n");

                case 2 -> System.out.println("Eliminando tu cuenta");

                case 3 -> {
                    System.out.println("Saliendo del sistema");
                    salir = true;/*Cuando necesites dos o mas datos en switch mejorado tienes que añadir llaves */
                }

                default -> System.out.println("Ninguna de las opciones es correcta porfavor reintentar");

            }
            System.out.println("\nFin del sistema itinerativo");
            
        }

    }
}
