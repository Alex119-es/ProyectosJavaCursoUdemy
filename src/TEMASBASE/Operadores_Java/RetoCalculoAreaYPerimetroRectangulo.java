package TEMASBASE.Operadores_Java;
import java.util.*;

public class RetoCalculoAreaYPerimetroRectangulo {
static Scanner tecladoInstanciado=new Scanner(System.in);

    public static void main(String[] args) {
    /*area=base*altura
     * perimetro=2*(base+altura)
     * ok entonces nos pide calcular un area de un triangulo sin ningun tipo
     *  de metodo simplemente con todo lo aprendido de Udemy y aun aqui no abarcamos el temario de metodos
     lo primero que hare como siempre sera hacer un tipo scanner instanciado para no tener que ponerlo a cada rato y lo pondre a nivel de clase
     ya que tambien quiero ahorrarme tiempo para añadir escaneres en el caso de que tenga que usar el mismo en otros metodos

     Ahora como aqui nos dice que el usuario tiene que pedir convertiremos estos datos dentro del Scanner y lo convertiremos en los datos debidos
     con el metodo Objeto.valueOf

     */

System.out.println("Porfavor proceda a decir la base del Rectangulo:");
     var baseEscrita=Integer.valueOf(tecladoInstanciado.nextLine());
System.out.println("Porfavor proceda a decir la altura del Rectangulo:");
var alturaEscrita=Integer.valueOf(tecladoInstanciado.nextLine());

var area=baseEscrita*alturaEscrita;
System.out.println("la area es: "+area);

var perimetro =2*(baseEscrita+alturaEscrita);
System.out.println("El perimetro es: "+perimetro);



}
}
