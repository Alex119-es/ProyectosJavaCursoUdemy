package Ejercicios_ScannerYPosterior;

public class FormateoCadenaMultilinea {

    public static void main(String[] args) {
        /*
         * diferencia bien % (sustitucion de datos y activacion de comandos) de \
         * (activacion de comandos y caracteres especiales) \s sirve para dejar un
         * espacio en blanco
         */
        var nombre = "Alex";
        var edad=23;
        var salario=1700.842f;
var numeroEmpleado=18;
        // ¡CORREGIDO! El contenido empieza en la siguiente línea
        var cadenaMultilinea = """
            METODO \""".FORMATTED
        Formateo cadena multilinea:
                -------------------------------------------------------
                \tNombre: %s
        \t Numero Empleado: %04d
        \t Edad: %d
        \t Salario: %.2f
                """.formatted(nombre,numeroEmpleado,edad,salario);

        System.out.println(cadenaMultilinea); // No olvides esta línea para ver el resultado
        System.out.printf("""
            METODO PRINTF
        Formateo cadena multilinea:
                -------------------------------------------------------
                \tNombre: %s
        \t Numero Empleado: %04d
        \t Edad: %d
        \t Salario: %.2f
                """.formatted(nombre,numeroEmpleado,edad,salario));
        
        
        
    }

}

