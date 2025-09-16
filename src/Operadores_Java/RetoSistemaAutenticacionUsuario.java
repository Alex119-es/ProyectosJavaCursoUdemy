package Operadores_Java;
import java.util.*;

public class RetoSistemaAutenticacionUsuario {

static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("SISTEMA DE AUTENTICACION");
final int contrasenaValida=5294;
final String usuarioValido="Alextremo";
System.out.println("Dime el nombre de usuario que creaste: ");
/*creo que al usar el operador de Comparacion == no sirve con esto ya que al usar este metodo teclado de la clase Scanner
creamos una nueva cadena asi que por eso debemos aplicar equals */
var usuarioEscrito=String.valueOf(teclado.nextLine());

System.out.println("Dime la contraseña que creaste(no se permiten decimales): ");

var contrasenaEscrita=Integer.valueOf(teclado.nextLine());

var datosAlmacenadosCorrectos= /*usuarioValido==usuarioEscrito*/usuarioValido.equals(usuarioEscrito) && contrasenaValida==contrasenaEscrita;

System.out.println("Usted es el usuario que creo la cuenta?: "+datosAlmacenadosCorrectos);



}
}
