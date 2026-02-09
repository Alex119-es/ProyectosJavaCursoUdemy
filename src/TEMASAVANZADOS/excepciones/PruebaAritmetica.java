package TEMASAVANZADOS.excepciones;

public class PruebaAritmetica {
public static void main(String[] args) {
    try{ 
    var resultadoAritmetica=Aritmetica.division(10, 0);
System.out.println(resultadoAritmetica);
 }
 catch(Exception e){
    System.out.println("Error division a 0: "+e);
 }
}
}
