package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;

import java.util.*;

public class RetoCalculadora {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sistemaCalculadora = false;
        double operando1 = 0;
        double operando2 = 0;
        double calculo = 0;
        while (!sistemaCalculadora) {
            System.out.println("""
                    Opciones a elegir:
                    1.Sumar
                    2.Restar
                    3.Multiplicar
                    4.Dividir
                    5.Salir
                    """);

            var numeroOpcion = Integer.valueOf(teclado.nextLine());
            if (numeroOpcion > 1 && numeroOpcion <= 4) {
                System.out.println("Valor del primer operando: ");
                operando1 = Double.valueOf(teclado.nextLine());
                System.out.println("Valor del segundor operando: ");
                operando2 = Double.valueOf(teclado.nextLine());
            }
            else{System.out.println("Valor fuera del rango porfavor reintentar");}
            
            switch (numeroOpcion) {
                case 1:
                    calculo = operando1 + operando2;
                    System.out.println("La suma de " + operando1 + " con " + operando2 + " es " + calculo);
                    break;
                case 2:
                    calculo = operando1 - operando2;
                    System.out.println("La resta de " + operando1 + " con " + operando2 + " es " + calculo);
                    break;
                case 3:
                    calculo = operando1 * operando2;
                    System.out.println("La multiplicacion de " + operando1 + " con " + operando2 + " es " + calculo);
                    break;
                case 4:
                    if (operando1 == 0 || operando2 == 0) {
                        System.out.println("Error numero cero en los operandos intentar de nuevo");
                    } else {
                        calculo = operando1 / operando2;
                        System.out.println("La division de " + operando1 + " con " + operando2 + " es " + calculo
                        /* Tambien se puede expresar con parentesis(operando1/operando2)
 
  */);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema ...");
                    sistemaCalculadora = true;
                    break;

                default:
                    System.out.println("Rango de opciones fuera del limite porfavor reintentar");
                    break;
            }
            System.out.println("FIn de la calculadora");

        //     switch (numeroOpcion) {
        //         case 1:
        //             System.out.println("Diga el primer numero para sumar: ");
        //             operando1 = Double.valueOf(teclado.nextLine());
        //             System.out.println("Diga el segundo numero para sumar: ");
        //             operando2 = Double.valueOf(teclado.nextLine());
        //             calculo = operando1 + operando2;
        //             System.out.println("La suma de " + operando1 + " con " + operando2 + " es " + calculo);
        //             break;
        //         case 2:
        //             System.out.println("Diga el primer numero para restar: ");
        //             operando1 = Double.valueOf(teclado.nextLine());
        //             System.out.println("Diga el segundo numero para restar: ");
        //             operando2 = Double.valueOf(teclado.nextLine());
        //             calculo = operando1 - operando2;
        //             System.out.println("La resta de " + operando1 + " con " + operando2 + " es " + calculo);
        //             break;
        //         case 3:
        //             System.out.println("Diga el primer numero para multiplicar: ");
        //             operando1 = Double.valueOf(teclado.nextLine());
        //             System.out.println("Diga el segundo numero para multiplicar: ");
        //             operando2 = Double.valueOf(teclado.nextLine());
        //             calculo = operando1 * operando2;
        //             System.out.println("La multiplicacion de " + operando1 + " con " + operando2 + " es " + calculo);
        //             break;
        //         case 4:
        //             System.out.println("Diga el primer numero para sumar: ");
        //             operando1 = Double.valueOf(teclado.nextLine());
        //             System.out.println("Diga el segundo numero para sumar: ");
        //             operando2 = Double.valueOf(teclado.nextLine());
        //             if (operando1 == 0 || operando2 == 0) {
        //                 System.out.println("Error numero cero en los operandos intentar de nuevo");
        //             } else {
        //                 calculo = operando1 / operando2;
        //                 System.out.println("La division de " + operando1 + " con " + operando2 + " es " + calculo/*
        //                                                                                                           * Tambien
        //                                                                                                           * se
        //                                                                                                           * puede
        //                                                                                                           * expresar
        //                                                                                                           * con
        //                                                                                                           * un
        //                                                                                                           * parentesis
        //                                                                                                           * (
        //                                                                                                           * operando1
        //                                                                                                           * /
        //                                                                                                           * operando2)
        //                                                                                                           */);
        //             }
        //             break;
        //         case 5:
        //             System.out.println("Saliendo del sistema ...");
        //             sistemaCalculadora = true;
        //             break;

        //         default:
        //             System.out.println("Rango de opciones fuera del limite porfavor reintentar");
        //             break;
        //     }
        //     System.out.println("FIn de la calculadora");
        // }
    }
}
}