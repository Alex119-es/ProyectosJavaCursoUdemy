package OrientacionAObjetosPOO.paquetes_en_java.aritmetica.prueba;

import OrientacionAObjetosPOO.paquetes_en_java.aritmetica.Aritmetica;

public class PruebaAritmetica {


    public static void main(String[] args) {
 System.out.println("Ejemplo Aritmetica");
        var instanciarClase=new Aritmetica(5,7);/*Al new se considera como el constructor de nuestra clase */
        System.out.println("Atributo operando1 por medio de metodo get:"+
            instanciarClase.getOperando1()
        );
        instanciarClase.setOperando1(6);
        instanciarClase.setOperando2(6);
    // instanciarClase.operando1=5;/*ahora mismo comentamos estas dos lineas ya que no podemos acceder a los atributos por medio de instancia con el constructor ya que los atributos estan
    // privados */
    // instanciarClase.operando2=7;
    instanciarClase.sumar();
    instanciarClase.restar();

    var instanciarClase2=new Aritmetica(12,16);

    instanciarClase2.sumar();
    instanciarClase2.restar();
    

}

}
