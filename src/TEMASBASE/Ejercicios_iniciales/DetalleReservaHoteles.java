package Ejercicios_iniciales;
/*trataremos de trabajar con var para asignar los datos 
 * a la vez que pondremos algunas notas:
 * var no se puede dejar como variable nula y se tiene que asignar un valor o definirlo
 * para que funcione no puede estar vacio cuando es float lo tienes que indiciar con F o long con L si es a secas es int*/
 
public class DetalleReservaHoteles {
    public static void main (String[]args){
        /*al parecer sale rojo como sino funcionara pero
        eso solo sale asi porque estamos dentro de la app 
si usamos termux seguira funcionando el dato primitivo var        */
        var nombreCliente="Alejandro";
        System.out.println(nombreCliente);
        var diasDeEstancia=3;
        System.out.println("Dias de estancia: "+diasDeEstancia);
        var tarifaDiaria=23.34;
        var vistaAlMar=false;
        System.out.println("Tarifa diaria: "+tarifaDiaria+"\n"+"vista al mar?: "+vistaAlMar);
    }
}