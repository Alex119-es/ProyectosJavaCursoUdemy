package RetoSistemaVentas.ventas;

public class PruebaVentas {
public static void main(String[] args) {
    System.out.println("***Sistema de ventas****");
    var producto1=new Producto("Blusa",30.25);
    // System.out.println(producto1.toString());
    var producto2 =new Producto("Zapatos",50.00);
    // System.out.println(producto2.toString());

// PRIMERA ORDEN
var orden1=new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
// orden1.mostrarOrden();
System.out.println(orden1);

// Segunda orden
var orden2=new Orden();
orden2.agregarProducto(new Producto("Playera",15.75));
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
// orden2.mostrarOrden();

// TAMBIEN SE PUEDE MOSTRAR CON EL TOSTRING 
System.out.println(orden2);


}
}
