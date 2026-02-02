package TEMASBASE.Ejercicios_iniciales;

public class ComparacionDeCadenas {
    public static void main(String []args){
        var cadena1="Hola";
        var cadena2="Hola";
        /*Estos dos apuntan a la misma cadena creada como objeto*/
        var cadena3=new String("Hola");
        /*se crea el nuevo objeto que apunta a otro lugar de memoria*/
        /*aplicamos comparadores relacionales*/
      System.out.print("Comparamos referencia cadena 1 y cadena2: ");
        System.out.println(cadena1==cadena2);
           System.out.print("Comparamos referencia cadena 1 y cadena3: ");
        System.out.println(cadena1==cadena3);
        System.out.print("Comparamos cadenas 1 y 3 con metodo equals lo que compara contenido en lugar de referencia/memoria: ");
        System.out.println(cadena1.equals(cadena3));
        
        
        
    }
}