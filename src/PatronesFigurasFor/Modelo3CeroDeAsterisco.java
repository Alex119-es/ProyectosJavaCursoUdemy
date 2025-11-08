package PatronesFigurasFor;

public class Modelo3CeroDeAsterisco {
public static void main(String[] args) {
    int rangoLimite=5;
    for (int numeroDeFila = 1; numeroDeFila <=rangoLimite; numeroDeFila++) {
        for (int numeroVecesAImprimir = 1; numeroVecesAImprimir <=rangoLimite; numeroVecesAImprimir++) {
            if (numeroDeFila==1||numeroDeFila==rangoLimite||numeroVecesAImprimir==1||numeroVecesAImprimir==rangoLimite) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    SemiPiramide();
    Modelo3CeroDeAsterisco instancia=new Modelo3CeroDeAsterisco();
    instancia.SemiPiramideInversa();
    }


    public static void SemiPiramide(){
int rangoLimite=5;
for (int numeroDeFila = 1; numeroDeFila <=rangoLimite; numeroDeFila++) {
    for (int numeroVecesAImprimir = 1; numeroVecesAImprimir <=numeroDeFila; numeroVecesAImprimir++) {
        System.out.print("*");

    }
    System.out.println();
}



    }
    public void SemiPiramideInversa(){
        int rangoLimite=5;
        for (int numeroDeFila = rangoLimite; numeroDeFila >=1; numeroDeFila--) {
            for (int numeroVecesAImprimir = 1; numeroVecesAImprimir <=numeroDeFila; numeroVecesAImprimir++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
