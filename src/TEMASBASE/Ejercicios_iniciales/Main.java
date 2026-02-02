package TEMASBASE.Ejercicios_iniciales;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String nombre_completo_persona = "Giovanni Alejandro Quishpe Chiliquinga";
        int edad_persona_main = 21;
        double altura_persona_main = 1.72;
        String pais_origen_persona_main = "España";
        char casado = 'C';
        char soltero = 'S';
        System.out.println(String.join("\n",
                nombre_completo_persona, String.valueOf(edad_persona_main),
                String.valueOf(altura_persona_main), pais_origen_persona_main, String.valueOf(casado),
                String.valueOf(soltero)));
        System.out.println(Producto_a_mostrar_impreso.nombreProducto);
        System.out.println(Producto_a_mostrar_impreso.precio);
        System.out.println(Producto_a_mostrar_impreso.estaDisponibleParaVenta);
        System.out.println(Producto_a_mostrar_impreso.cantidadDisponible);
        Producto_a_mostrar_impreso.nombreProducto = "Azucar blanco";
        Producto_a_mostrar_impreso.precio = 2;
        Producto_a_mostrar_impreso.estaDisponibleParaVenta = false;
        Producto_a_mostrar_impreso.cantidadDisponible = 0;
        System.out.println(Producto_a_mostrar_impreso.nombreProducto);
        System.out.println(Producto_a_mostrar_impreso.precio);
        System.out.println(Producto_a_mostrar_impreso.estaDisponibleParaVenta);
        System.out.println(Producto_a_mostrar_impreso.cantidadDisponible);
        System.out.println("A CONTINUACION SE MUESTRA UN EJERCICIO USANDO UN METODO Y A LA VEZ USANDO ARGUMENTOS");
        System.out.println(
                "Nota extra:el metodo lo hicimos en otra clase ni en el main debido a eso tuvimos que llamar a la Clase.metodo hacienzo el metodo publico al igual");
        System.out.println(
                "que vimos antes para hacer un concat_ws similar en Java al usar String.join y cambiar los valores diferentes usando la Clase.valueOf() lo mismo podremos hacer con Integer pero este solo funcionara con numeros dentro del argumento sino fuese asi no podria salir resultados");
        System.out.println(
                "Si hubiesemos hecho el metodo sumar en el main no tendriamos que aplicar la Clase.metodo sino simplemente el metodo con parametros o variables");
        System.out.println("****************************************");
        System.out.println("Por aqui estan las decisiones de cada valor aunque no se muestren en la terminal");
        int numCliente = Integer.valueOf(args[0]);
        int numEmpleados = Integer.valueOf(args[1]);
        int numSillas = Integer.valueOf(args[2]);
        int numMesas = Integer.valueOf(args[3]);
        int numContratos = Integer.valueOf(args[4]);
        int numReclamaciones = Integer.valueOf(args[5]);
        System.out.println("Aqui se muestra el procedimiento de las sumas totales aunque no se muestre en la terminal");
        int numPersonas = ClaseParaSumar.sumar(numCliente, numEmpleados);
        int numMuebles = ClaseParaSumar.sumar(numSillas, numMesas);
        int numExpedientes = ClaseParaSumar.sumar(numContratos, numReclamaciones);

        System.out.println("Por ultimo en conclusion mostramos todos los datos del proceso:"
                + "el total de personas es de = " + numPersonas + " el total de muebles es = " + numMuebles
                + "el total de Expedientes es =" + numExpedientes);

    }

}