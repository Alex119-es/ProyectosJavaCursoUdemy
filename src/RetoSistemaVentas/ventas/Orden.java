package RetoSistemaVentas.ventas;

public class Orden {
    private final int idOrden;
    // EL ARREGLO DE OBJETOS ES EN BASE A QUE PRIMERO SE NECESITA la clase PRODUCTOS
    // PTMADRE
    private Producto[] productos;
    private static int incrementoIdOrden;
    private int contadorProductos;// para calcular el total de productos necesitamos un contador
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.incrementoIdOrden;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(/* Recibir un objeto de tipo producto */Producto producto) {
        /*
         * Utilizamos el arreglo y si trabajaramos manualmente la asignacion de los
         * indices seria 0 pero como agregamos mas productos esto tiene que ser mas y
         * usamos el contador de productos
         */
        if (this.contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++]=producto;
        } 
        else{System.out.println("Se ha superado el maximo de productos: "+Orden.MAX_PRODUCTOS);
            
        }
        
    }

}
