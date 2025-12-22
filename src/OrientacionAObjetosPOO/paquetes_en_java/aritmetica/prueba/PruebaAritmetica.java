package OrientacionAObjetosPOO.paquetes_en_java.aritmetica.prueba;

import OrientacionAObjetosPOO.paquetes_en_java.aritmetica.Aritmetica;

public class PruebaAritmetica {


    public static void main(String[] args) {
 System.out.println("Ejemplo Aritmetica");
        var instanciarClase=new Aritmetica();/*Al new se considera como el constructor de nuestra clase */
        
    instanciarClase.operando1=5;
    instanciarClase.operando2=7;
    instanciarClase.sumar();
    instanciarClase.restar();

    var instanciarClase2=new Aritmetica(12,16);

    instanciarClase2.sumar();
    instanciarClase2.restar();
    

}

}
