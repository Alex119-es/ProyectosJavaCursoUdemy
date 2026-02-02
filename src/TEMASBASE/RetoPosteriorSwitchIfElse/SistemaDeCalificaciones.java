package TEMASBASE.RetoPosteriorSwitchIfElse;
import java.util.*;
public class SistemaDeCalificaciones {

    static Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Porfavor diga el numero de su nota y posterior a eso le daremos su resultado en letra del mismo: ");
        var numeroCalificacionExamen=Double.valueOf(teclado.nextLine());


        
if (numeroCalificacionExamen>=9 && numeroCalificacionExamen<=10) {
    System.out.println("Su calificacion es una letra A");
}
else if(numeroCalificacionExamen>=8 && numeroCalificacionExamen<=9) {
    System.out.println("Su calificacion es una letra B");
} 
else if (numeroCalificacionExamen>=7 &&numeroCalificacionExamen<=8){
    System.out.println("Su calificacion es una letra C");
}
else if (numeroCalificacionExamen>=6 && numeroCalificacionExamen<=7){
    System.out.println("Su calificacion es una letra D");

}
else if(numeroCalificacionExamen>=0 && numeroCalificacionExamen<=6){
System.out.println("Su calificacion es una letra F");
}
else {
    System.out.println("Numero de calificacion invalida fuera de categoria de letra o no valido puntuacion negativa");
}
    }

    
}
