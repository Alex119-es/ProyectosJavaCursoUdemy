package TEMASBASE.PatronesFigurasFor.ModelosDisenoFor;

public class Patron4RomboDosTriangulos {



    public static void main(String[] args) {
int rango=5;
/*Triangulo  */
 for (int numeroDeFila = 1; numeroDeFila <=rango; numeroDeFila++) {
    for (int vecesAImprimir = numeroDeFila; vecesAImprimir <rango; vecesAImprimir++) {
        System.out.print(" ");
    }
    for (int vecesAImprimir = 1; vecesAImprimir <=(2*numeroDeFila-1); vecesAImprimir++) {
        System.out.print("*");
    }
    System.out.println();
}

/*Triangulo inverso */
for (int numeroDeFila_V2 = rango-1; numeroDeFila_V2 >=1; numeroDeFila_V2--) {
    for (int vecesAImprimir_V2 = numeroDeFila_V2; vecesAImprimir_V2 < rango; vecesAImprimir_V2++) {
        System.out.print(" ");
    }
    for (int vecesAImprimir_V2 = 1; vecesAImprimir_V2 <= (2*numeroDeFila_V2-1); vecesAImprimir_V2++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
