package ArreglosEnJava;

public class SintaxisSimplificada {
public static void main(String[] args) {
    /*[]"numero de posiciones"vs[]{}"elementos designados de arreglo vacio" */

int [] nombreDelArreglo=new int[]{1,2,3,4,5,6,7,8,9,10};
var nombreDelArreglo_V2=new int[]{1,2,3,4,5,6,7,8,9,10};
/*Manera mas rapida y seca aun */
int edades[]={5,10,30,45};
for (int i : edades) {
    System.out.println(i);
}


System.out.println("Valor  1" +nombreDelArreglo[0]);
System.out.println("Valor  2" +nombreDelArreglo[1]);
System.out.println("Valor  3" +nombreDelArreglo[2]);
System.out.println("Valor  4" +nombreDelArreglo[3]);
System.out.println("Valor  5" +nombreDelArreglo[4]);

System.out.println(nombreDelArreglo_V2[0]);
System.out.println(nombreDelArreglo_V2[1]);
System.out.println(nombreDelArreglo_V2[2]);
System.out.println(nombreDelArreglo_V2[3]);
System.out.println(nombreDelArreglo_V2[4]);

}
}
