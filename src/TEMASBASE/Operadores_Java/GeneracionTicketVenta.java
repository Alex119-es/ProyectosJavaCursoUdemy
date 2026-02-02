package TEMASBASE.Operadores_Java;

import java.util.*;

public class GeneracionTicketVenta {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Generacion TIcket de Venta");

        System.out.println("Precio leche ");
        var precioLeche = Double.valueOf(teclado.nextLine());

        System.out.println("precio del pan");
        var precioPan = Double.valueOf(teclado.nextLine());
        System.out.println("Precio lechuga?: ");
        var precioLechuga = Double.valueOf(teclado.nextLine());

        System.out.println("Precio platanos?: ");
        var precioPlatanos = Double.valueOf(teclado.nextLine());

        /* SEGUNDA PARTE: Añadimos un descuento */
        System.out.println("Aplicar algun descuento (%)?:");
        var descuentoPorcentaje = Integer.valueOf(teclado.nextLine());

        /* Calculo del subtotal sin impuestos */
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        /* Aplicar el descuento */
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

        /* Subtotal con descuento */
        var subtotalConDescuentoAplicado = subtotal - descuento;

        /* Calculo con impuestos */
        var impuestoAplicado = /* subtotal */subtotalConDescuentoAplicado * 0.16;

        /* Calculo tota de la compra(con impuestos) */
        var costoTotalCompra = /* subtotal */subtotalConDescuentoAplicado + impuestoAplicado;
        /* Imprimir el ticket de venta */
        System.out.printf("""
                %n Ticket de venta ****
                %n--------
                        Subtotal: $%.2f
                        Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                costo total de la compra: $%.2f
                        """, subtotal, descuento, descuentoPorcentaje, impuestoAplicado, costoTotalCompra);

    }
}
