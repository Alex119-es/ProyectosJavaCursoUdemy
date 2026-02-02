package TEMASBASE.Funciones;
/* Las funciones son sub Métodos que sirven para dividir tareas en lo que se refiere a una aplicación grande conocidas 
también por el hecho de que se les puede llamar como subprogramas o subtareas

Las funciones las relacionaremos con la palabra static el cual sera una instancia en base al archivo origen que es la clase Funciones
*/
public class Funciones {

static void/*No regresa ningun tipo de informacion osea no hay return */saludaDesdeJava(/*Informacion que va a recibir nuestra informacion/Parametro
     */String mensaje)
{
    System.out.println("Mensaje: "+mensaje);

}

    public static void main(String[] args) {
/*Tiene que ser estatica para llamar a la funcion principal */
       saludaDesdeJava("Hola desde funcion de Java"/*Dentro ya del uso de la funcion es un argumento lo que estamos usando  */); 
       saludaDesdeJava("Adios"/*Sn reutilizables con un numero de usos ilimitados */); 


}
}
