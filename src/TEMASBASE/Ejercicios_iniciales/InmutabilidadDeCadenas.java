package TEMASBASE.Ejercicios_iniciales;

public class InmutabilidadDeCadenas {
    public static void main(String[] args) {
        var cadenaInmutable1 = "Hola soy el primer mensaje al que apunta el dato String";

        System.out.println("muestro la cadena inmutable:" + cadenaInmutable1);
        /*
         * guardamos la cadena en otra variable y ahora hacemos que apunte a otra cadena
         */

        var cadenaAlmacenadaDel1 = cadenaInmutable1;

        System.out.println(cadenaAlmacenadaDel1);

        /*
         * hacemos a que apunte otra cadena laisma variable pero anteriormente
         * se almacena la respuesta de atras
         */
        cadenaInmutable1 = "Segunda cadena que apunta sustituida del primer mensaje";
        System.out.println(cadenaInmutable1);
    }
}