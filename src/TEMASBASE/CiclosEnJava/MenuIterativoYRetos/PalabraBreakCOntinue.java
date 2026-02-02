package TEMASBASE.CiclosEnJava.MenuIterativoYRetos;

import java.util.Scanner;

public class PalabraBreakCOntinue {



    public static void main(String[] args) {

        // ejemplo break
for (int i = 1; i < 10; i++) {
    if (i%2==0) {
        System.out.println(i+" es par");/*solo queremos el primer numero par */
        break;/*romper de manera prematura un ciclo */
    }

}


/*Continue */
for (int numero = 1; numero < 10; numero++) {
    if (numero%2==1) /*numero impar*/{
        continue;/*siguiente iteracion */
    }
    System.out.println(numero);

}

}
}
