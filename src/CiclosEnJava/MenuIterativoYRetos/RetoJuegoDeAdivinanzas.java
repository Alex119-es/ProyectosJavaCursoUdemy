package CiclosEnJava.MenuIterativoYRetos;
import java.util.*;
public class RetoJuegoDeAdivinanzas {
static Random aleatorizador=new Random();
static Scanner teclado=new Scanner(System.in);
public static void main(String[] args) {
     boolean sistemaAdivinanza=false;
     int numeroAleatorio=aleatorizador.nextInt(50)+1;
   while (!sistemaAdivinanza) {
    
   
    System.out.println("Di un numero entre el 1 al 50 (tienes 10 intentos)");

var numeroAdivinanza=Integer.valueOf(teclado.nextLine());
var contadorIntentos=0;
while (contadorIntentos<=10) {
    
if (numeroAdivinanza==numeroAleatorio) {
    System.out.println("Felicidades el numero que escribiste es correcto");
    sistemaAdivinanza=true;
}
else if (numeroAdivinanza>numeroAleatorio) {
    System.out.println("El numero es incorrecto pero se encuentra mas arriba del numero ingresado");
} else if (numeroAdivinanza<numeroAleatorio){
    System.out.println("El numero es incorrecto pero se encuentra por debajo del numero ingresado");
}
else{
    System.out.println("cero o numero negativo porfavor volver a intentar ");
}
contadorIntentos++;
}

   }
   System.out.println("Saliendo del programa");

}
}
