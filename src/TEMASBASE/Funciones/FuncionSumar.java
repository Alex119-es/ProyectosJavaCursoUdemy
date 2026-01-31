package Funciones;

public class FuncionSumar {

/*Definimos la funcion de sumar */
static int sumar(int a, int b){
    var almacenaResultado=a+b;
    // return a+b;
    return almacenaResultado;
}

    public static void main(String[] args) {
  int arg1=3,arg2=8;
var resultado_funcion=sumar(arg1, arg2);
System.out.println("Resultado de la funcion "+resultado_funcion);
/*Cada dato pertenece unicamente dentro de su sector de bloque de codigo es decir main dentro del main 
y funcion dentro de funcion tomando en cuenta el contexto es decir pasan por la funcion pero despues son eliminadas las asignaciones */
System.out.println("Tambien se puede concadenar con la funcion directamente: "+sumar(3,2));

resultado_funcion=sumar(10, 20);
System.out.println("Resultado de la funcion "+resultado_funcion);

}
}
