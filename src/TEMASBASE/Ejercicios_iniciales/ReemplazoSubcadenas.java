package Ejercicios_iniciales;

public class ReemplazoSubcadenas {
    
    public static void main(String[] args) {
        var cadena1="Hola mundo";
        System.out.println("cadena1: "+cadena1);
        var cadenaNueva=cadena1.replace("Hola","Saludos");
        System.out.println(cadenaNueva);
        cadenaNueva=cadena1.replace("mundo","Transeuntes");
        System.out.println("cadena que esta generada tambien con la misma variable y se considera un nuevo objeto no apunta en si a su anterior cambio sino solo apunta a la cadena original y crea ese objeto: "+cadenaNueva);
        
    }
    
}