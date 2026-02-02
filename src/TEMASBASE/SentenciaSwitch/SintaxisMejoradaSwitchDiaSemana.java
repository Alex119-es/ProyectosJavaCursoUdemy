package TEMASBASE.SentenciaSwitch;
import java.util.*;;
public class SintaxisMejoradaSwitchDiaSemana {

static Scanner teclado=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("DIga un numero de dia de la semana: ");
int diaDeSemana=Integer.valueOf(teclado.nextLine());

String cadenaNombreDia;
/*En este tipo de sintaxis no usamos break a mi parecer o solo es una flecha o es similar a una funcion tipo Lamda 
 */
cadenaNombreDia= switch (diaDeSemana){
    case 1 -> cadenaNombreDia="Es lunes pe";
    case 2 ->cadenaNombreDia="Es martes garka";
    case 3 -> cadenaNombreDia="Es miercoles papu";
    case 4 -> cadenaNombreDia="Es jueves bolude";
    case 5 -> cadenaNombreDia="Es viernes gitano";
    case 6 -> cadenaNombreDia="Es sabado boliviano";
    case 7 -> cadenaNombreDia="Es domingo lol";
default -> cadenaNombreDia="Numero de mes invalido";

};

System.out.println(cadenaNombreDia+"("+diaDeSemana+")");
        


}
}
