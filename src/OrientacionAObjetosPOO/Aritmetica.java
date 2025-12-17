package OrientacionAObjetosPOO;

public class Aritmetica {

int operando1;
int operando2;
void sumar(){
    var resultado=operando1+operando2;
System.out.println("Resultado Suma: "+resultado);
}
void restar(){
    var resultado=operando1-operando2;
    System.out.println("Resultado Suma: "+resultado);
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
