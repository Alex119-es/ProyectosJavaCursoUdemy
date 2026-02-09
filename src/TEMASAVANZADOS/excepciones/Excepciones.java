package TEMASAVANZADOS.excepciones;

public class Excepciones {
public static void main(String[] args) {
    int valor1=10,valor2=0;
    try{
    var resultado=valor1/valor2;
    System.out.println("resultado= "+resultado); }/*lee lo que pueda tener error por excepcion*/
    catch(Exception e){
// respuesta excepcion
System.out.println("Ocurrio un error: "+e);
    }
}
}
