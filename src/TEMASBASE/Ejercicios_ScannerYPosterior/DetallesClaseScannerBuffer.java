
package TEMASBASE.Ejercicios_ScannerYPosterior;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class DetallesClaseScannerBuffer {
    /*al mismo tiempo si quieres usar este objeto para metodos tednras o que iniciarlo como parametro dentro de un metodo o a nivel de clase puedes usar 
    public static Scanner nombre=new Scanner (System.in) y ya  de eso podras usarlo en cualquier metodo y clase al nombrar la misma clase */ 
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingresa un numero de tu edad: ");
        var textoScannerEdad=teclado.nextInt();
        System.out.println("ingresa tu altura");
        var textoScannerAltura=teclado.nextDouble();
System.out.println("tu edad es : "+textoScannerEdad+"\n".concat("y tu altura es: ")+textoScannerAltura);
        
        System.out.println("""
                Al usar los datos de tipo nextInt y nextDouble si vamos a usar un nextLine primero tendremos que vaciarlo usando: \n nextLine(); ya que
                 tenemos que hacer que la /n que esta  dentro de los buffer ya sea nextInt o nextDouble se omitan con la sentencia mencionada(nextLine())
                """);
        teclado.nextLine();
        System.out.println("\n Dime ahora un texto ya que acabo de omitir los datos antiguos en el buffer de cadena usando \"nombre\".nextLine(): ");
        var textoScannerCadena=teclado.nextLine();
        System.out.println("el texto que ingresaste es: "+textoScannerCadena);
        System.out.println(String.join(" ",String.valueOf(textoScannerEdad),String.valueOf(textoScannerAltura),textoScannerCadena));
    
    /*Conversion tipo de datos por consola 
    //////////////////////////////////////
     */
System.out.println("Haremos una conversion entrando el metodo de Scanner Line() guardadnola en medio de una variable para que asi podamos procesarla con un Objeto.valueOf() es decir su metodo \n  Proporciona un valor entero : ");
var enteroString=teclado.nextLine();
var enteroTransformadorCadena=Integer.valueOf(enteroString);
System.out.println("Entero de cadena transformado a entero no usando parseInt sino Objeto.valueOf: "+enteroTransformadorCadena);
/*Conversion tipo de dato de linea por metodo de objeto */
System.out.println("haremos ahora en lugar de almacenar la variable Scanner con el metodo Line() una conversion directa añadiendo la variable teclado.nextLine en la conversion del objeto y no mencionando una variable que abarque en si el metodo Line");
System.out.println("Es decir usaremos directamente Objeto.valueOf(variableScanner.nextLine()), sin abarcar dentro de la misma una variable QUE ABARQUE SOLO LINE como Objeto.valueOf (nombrequetienedentroelScanner)");
System.out.println("Dime un numero o ingresa un dato de tipo float/flotante");
var flotanteStringDirecto=Float.valueOf(teclado.nextLine());
System.out.println("El numero es: "+flotanteStringDirecto);

    }}