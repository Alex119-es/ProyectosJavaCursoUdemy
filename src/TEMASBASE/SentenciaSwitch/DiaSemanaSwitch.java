package SentenciaSwitch;

import java.util.*;

public class DiaSemanaSwitch {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dia de la semana: ");

        int diaSemana = Integer.valueOf(teclado.nextLine());

        switch (diaSemana) {
            case 1:
System.out.println("Dia lunes");
                break;
            case 2:
System.out.println("dia martes");
                break;
            case 3:
System.out.println("Dia miercoles");
                break;
            case 4:
System.out.println("Dia jueves");
                break;
            case 5:
System.out.println("Dia viernes");
                break;
            case 6:
System.out.println("Dia sabado");
                break;
            case 7:
System.out.println("Dia domingo");
                break;
          
            default:
            System.out.println("Dia invalido" + diaSemana);
                break;
        }

    }
}
