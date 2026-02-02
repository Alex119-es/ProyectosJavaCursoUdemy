package TEMASBASE.Ejercicios_iniciales;

public class CalculoNombresFamiliaDosMetodos {
    private static String construyeNombreCompleto(String nombre, String apellido1, String apellido2) {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    private static void pintarNombreCompleto(String nombreCompleto) {
        System.out.println(nombreCompleto);
    }

    public static void main(String[] args) {
        String nombrehijo1 = args[2];
        String nombrehijo2 = args[3];
        String nombrehijo3 = args[4];
        String nombrepadre = args[5];
        String nombremadre = args[6];
        String apellidopadre = args[0];
        String apellidomadre = args[1];
        /*
         * Reciclamos codigo y abarcamos que el primer metodo muestre el parametro que
         * recibira
         * a la vez que el otro metofo que construye es un tipo String y rellenara los
         * valores
         * dentro de los parametros de ese otro metodo con los valorea de los argumentos
         * que tambien son Tipos
         * String una cosa que no me di cuenta es que con mi metodo void tambien
         * puedo hacer que muestre el parametro y sincronizarlo con otro metodo en si es
         * una
         * FUSION DE METODOS aparte de que no usamos directamente en Syste.out.println
         * solo el metodo ya que no se puede abarcar dos System.out.println a la vez
         * segun yo
         * ya que esta dentro del metodo
         */
        System.out.print("Nombre del padre:");
        pintarNombreCompleto(construyeNombreCompleto(nombrepadre, apellidopadre, ""));
        System.out.print("Nombre de la madre:");
        pintarNombreCompleto(construyeNombreCompleto(nombremadre, apellidomadre, ""));
        /* lonque si se puede hacer con sout */
        System.out.print("Nombre del primer hijo:");
        pintarNombreCompleto(construyeNombreCompleto(nombrehijo1, apellidopadre, apellidomadre));

        System.out.println("Nombre del segundo hijo:");
        pintarNombreCompleto(construyeNombreCompleto(nombrehijo2, apellidopadre, apellidomadre));

        System.out.println("Nombre del tercer hijo:");
        pintarNombreCompleto(construyeNombreCompleto(nombrehijo3, apellidopadre, apellidomadre));

    }
}