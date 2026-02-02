package TEMASBASE.OrientacionAObjetosPOO.PosConstructor;

public class OperadorThis {
// usamos parte del codigo de constructores/aritmetica que son  clases de este paquete 
int operando1;
int operando2;
void sumar(){
    var resultado=this.operando1+this.operando2;
System.out.println("Resultado Suma: "+resultado);
}
/*Generalmente se pide de buenas practicas el hecho de que usemos el operador this para asi no confundirnos con el hecho de que sea una 
variable de tipo local */
void restar(){
    var resultado=this.operando1-this.operando2;
    System.out.println("Resultado Suma: "+resultado);
}

public OperadorThis(){
   System.out.println("Ejecutando constructor vacio");/*Preferiblemente dejarlo vacio como se dice XD */
}
/*Primero la sentencia this representa a atributo o metodos de clase SOLO FUNCIONA DENTRO DE LA CLASE y es una sentencia para referirse a el dato
 que se ha creado dentro de la unidad de memoria asignado como operando 1 y operando2 en este caso de abajo al utilizar el this nos estamos 
 refiriendo a lo que se refiere el tipo de dato creado dentro de la clase */
public OperadorThis(int operando1,int operando2){
    System.out.println("Ejecutando constructor con dos parametros dentro de sus argumentos para proceso directo");
   this.operando1=operando1;
    this.operando2=operando2;
    System.out.println("Dirreccion a la que apunta el operador this: "+this);
}
/*El elemento que instancia y el elemento this apuntan al mismo objeto */
    public static void main(String[] args) {
 System.out.println("Ejemplo Aritmetica");
        var instanciarClase=new OperadorThis(5,7);
    instanciarClase.sumar();
    instanciarClase.restar();
    System.out.println("Dirreccion de Memoria del  objeto1: "+instanciarClase);

    /*Creamos un segundo objeto y cuando se crea ese mismo objeto no se crea un nuevo this sino que el mismo this apunta posterior a el siguiente
    objeto al terminar de trabajar con ese objeto*/
    System.out.println();

    var instanciaClase2=new OperadorThis(12,16);
    instanciaClase2.sumar();
    instanciaClase2.restar();
    System.out.println("Dirreccion de Memoria del  objeto2: "+instanciaClase2);

    
}
}
