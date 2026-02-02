package TEMASBASE.RetoSistemaVentas.ventas;

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
    public double calcularTotal(){
        double total=0;
for (int i = 0; i < this.contadorProductos/*se menciona contador porque se deberia basar mas en
    la cantidad metida lo que contador porductos si tiene si usasemos productos fijamos con su max productos que es el limite 
     */; i++) {
    var producto=this.productos[i];/*si haces que tenga el valor de un objeto creado de la clase Producto
    automaticamente esa variable que tiene referencia y resultado puede acceder a los metodos disponibles */
    total+=producto.getPrecio();
}
return total;
    }

// NOTA:se puede meter una funcion o metodo dentro de otra misma,si se pone igual a un objeto
// ya creado de esa clase aparte de tener los valores tambien tiene acceso a sus metodos que esten disponibles

public void mostrarOrden(){
    System.out.println("Id_orden: "+this.idOrden);
    var totalOrden=this.calcularTotal();
    System.out.println("\t Total de la Orden: $: "+totalOrden);
    System.out.println("\t Productos de la orden: ");
    for (int i = 0; i <this.contadorProductos; i++) {
        System.out.println("\t\t "+this.productos[i]);
    }
}
// TAMBIEN SE PUEDE MOSTRAR CON EL TOSTRING 

@Override
public String toString(){   
    
    var resultado="Id_orden: "+this.idOrden+"\n";
    var totalOrden=this.calcularTotal();
 resultado+="\t Total de la Orden: $: "+totalOrden+"\n";
    resultado+="\t Productos de la orden: "+"\n";
    for (int i = 0; i <this.contadorProductos; i++) {
        resultado+="\t\t "+this.productos[i]+"\n";}
return resultado;
// para concadenar una cadena puedes usar += asi como cuando concadenas valores o los incrementas
// en enteros
} }
