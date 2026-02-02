package TEMASBASE.SentenciaSwitch;

import java.util.Scanner;

public class Switch {
/*Sintaxis clasica */
static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {

/*int opcionNumerica2=Integer.valueOf(new Scanner(System.in).nextLine());*/

        int opcionNumerica=Integer.valueOf(teclado.nextLine());
        switch (opcionNumerica) {
            case 1:
                System.out.println("uno");
                break;
        
            default:
                break;
        }
        


}
}
