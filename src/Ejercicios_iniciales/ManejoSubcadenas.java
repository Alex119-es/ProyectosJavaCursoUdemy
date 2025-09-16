package Ejercicios_iniciales;

public class ManejoSubcadenas {
    
    public static void main(String[] args) {
        var cadena1="Hola mundo";
        System.out.println(cadena1);
        var cadena2=cadena1.substring(0,4);
        System.out.println(cadena2);
        /*al final en cada ultimo numero de
         * indicacion es n-1 en seccion de recorrido de
         * elementos osea recorre 0-3 y 5-9*/
         
        var cadena3=cadena1.substring(5,10);
        System.out.println(cadena3);
    }
    
}