package TEMASBASE.RetoSistemaVentas.ventas;

public class Producto {
    private final int idProducto;// como asignamos final no podemos tener set ya que es un valor que no se puede cambiar
    private String nombre;
private double precio;
private static int contadorProductos;

// creo que lo que mas me costo deducir erea añdir una variable estatica idnependiente de lo que se refiere el encapsulamiento para asi poder mostrarlo unicamente ese id que se incrementa
// al crear objetos en el metodo toString()
public Producto(String nombre, double precio) {
    this.idProducto = ++Producto.contadorProductos;
    this.nombre = nombre;
    this.precio = precio;
}
public Producto() {
        this.idProducto = ++Producto.contadorProductos;
}
public int getIdProducto() {
    return this.idProducto;
}
public String getNombre() {
    return this.nombre;
}
public double getPrecio() {
    return this.precio;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setPrecio(double precio) {
    this.precio = precio;
}
@Override
public String toString() {
    return "Producto [idProducto=" + this.idProducto + ", nombre=" + this.nombre + ", precio=" + this.precio + "]";
}
}
