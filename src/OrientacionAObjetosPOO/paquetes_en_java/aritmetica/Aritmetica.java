package OrientacionAObjetosPOO.paquetes_en_java.aritmetica;

public class Aritmetica {
    /* 
     * Estos atributos deben ser 'public' para que clases de otros paquetes 
     * (como PruebaAritmetica en el paquete 'prueba') puedan acceder a ellos directamente.
     * Sin 'public', tendrían visibilidad de paquete (default) y solo serían accesibles
     * desde clases dentro del mismo paquete 'aritmetica'.
     */
    public int operando1;
    public int operando2;
    /*lo mismo con las funciones cuando no son publicas solo pueden acceder otras clases DENTRO DEL MISMO PAQUETE*/
    public void sumar(){
        var resultado=operando1+operando2;
    System.out.println("Resultado Suma: "+resultado);
    }
    public void restar(){
        var resultado=operando1-operando2;
        System.out.println("Resultado Suma: "+resultado);
    }
    /*Si le quitamos la propiedad public lo que hacemos es converitr los constructores solo para el uso de esta clase mas no de las demas clases */
     public Aritmetica(int operando1,int operando2){
        System.out.println("Ejecutando constructor con dos parametros dentro de sus argumentos para proceso directo");
       this.operando1=operando1;
        this.operando2=operando2;
        System.out.println("Dirreccion a la que apunta el operador this: "+this);
    }
     public Aritmetica(){

    }
        public static void main(String[] args) {
     System.out.println("Ejemplo Aritmetica");
            var instanciarClase=new Aritmetica();/*Al new se considera como el constructor de nuestra clase */
        instanciarClase.operando1=5;
        instanciarClase.operando2=7;
        instanciarClase.sumar();
        instanciarClase.restar();
        var instanciarClase2=new Aritmetica();
        instanciarClase2.operando1=12;
        instanciarClase2.operando2=16;
        instanciarClase2.sumar();
        instanciarClase2.restar();
        

    }
}
