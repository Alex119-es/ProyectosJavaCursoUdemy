package RetoSistemaVentas.ventas;

public class PruebaVentas {
public static void main(String[] args) {
    System.out.println("***Sistema de ventas****");
    var producto1=new Producto("Blusa",30.25);
    System.out.println(producto1.toString());
    var producto2 =new Producto("Zapatos",50.00);
    System.out.println(producto2.toString());
}
}
