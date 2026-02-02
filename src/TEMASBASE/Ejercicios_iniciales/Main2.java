package TEMASBASE.Ejercicios_iniciales;

public class Main2 {
/*probando cosas */
String da="a";
public static void main(String[] args) 
{
    /*para instanciar tienes que llegar a nivel de objeto en clase
     * no a nivel de tipo de dato
     */
   Main2 objetoAInstanciar=new Main2();
    System.out.println(objetoAInstanciar.da);

    String numeroDeLetras_CADENA="Hola"+"Mundo";
int numeroInteger=Integer.valueOf(numeroDeLetras_CADENA.length());
System.out.println("numero de letras: "+numeroInteger);

String subcadenaHola=numeroDeLetras_CADENA.substring(0, 4);
System.out.println(subcadenaHola);
/*Cociente  */
int operacion=8/2;
System.out.println(operacion);
/*resto */
operacion=8%2;
System.out.println(operacion);


operacion=1;
System.out.println(operacion);
operacion=operacion+1;
System.out.println(operacion);
operacion=operacion+2;
System.out.println(operacion);

System.out.println("*************************************\n");

int numeroRandom=1;
numeroRandom+=numeroRandom;
/*diferencia o tienes que notar que aqui cuando haya un bucle cambiara aun mas el valor como en 
 * este caso solo tenemos ciclo de una ronda por eso lo agarra asi simplemente la suma de 2 
 */
System.out.println(numeroRandom);/*comenta toda esta parte si quieres ver la fase de dos ciclos
y ten en cuenta tambien la diferencia de bloques de codigo en casos como if o switch  */

while (numeroRandom<=4/*si aqui dejamos 4 sin comentar se repetira dos veces por la acumulacion
 haciendo espejo y saliendo 8
 */) {
  System.out.println("NumeroRandom: "+numeroRandom);
  numeroRandom+=numeroRandom;
  System.out.println(numeroRandom);
}

}
}
