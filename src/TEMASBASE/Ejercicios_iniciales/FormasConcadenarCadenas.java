package TEMASBASE.Ejercicios_iniciales;

public class FormasConcadenarCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        /* la concadenacion normal sumando */

        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("metodo suma (el mas normal de todas las concadenaciones): " + cadena3);
        var cadenaConConcat = cadena1.concat(" ").concat(cadena2);
        System.out.println("Metodo concat: " + cadenaConConcat);

        var constructorDeCadenasStringBuilder = new StringBuilder();
        constructorDeCadenasStringBuilder.append(cadena1).append(" ").append(cadena2);
        System.out.println("Metodo StringBuilder: " + constructorDeCadenasStringBuilder);
        /*
         * Con el Sout muestra pero sobretodo si queremos convertirlo en un
         * objetonString necesitamos
         * almacenarla en una variable tipo String usando toString()
         */
        var resultadoDeBuilderAString = constructorDeCadenasStringBuilder.toString();
        System.out.println("Almacenado en una variable para hacerle toString(): " + resultadoDeBuilderAString);
        var constructorDeCadenasStringBuffer = new StringBuffer();
        constructorDeCadenasStringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("Metodo StringBuffer: " + constructorDeCadenasStringBuffer);
        System.out.println(
                "NOTA:no es necesario usar toString() al parecer lo lee la maquina y lo aplica automaticamente solo usas append(dato ) y ya esta");

        var constructorCadenaConJoin = String.join(" ", cadena1, cadena2);
        System.out.println("Metodo String.join(se puede aplicar dentro del Sout o en una variable tipo String) : "
                + constructorCadenaConJoin);
        System.out.println(
                "Nota: al usar este metodo di hay algun dato que no sea tipo string habra que juntarlo o convertirlo con el metodo String.valueOf es decir: String.join(dato tipo String,String.valueOf(dato primitivo que no es String),String.valueOf(otro dato primitivo que no es String)");

    }
}