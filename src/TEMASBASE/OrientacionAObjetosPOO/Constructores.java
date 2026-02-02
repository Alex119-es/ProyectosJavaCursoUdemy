package TEMASBASE.OrientacionAObjetosPOO;
/* usaremos los valores de la clase de Aritmetica dentro de este paquete */
public class Constructores {

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
/*Podemos igualmente crear el constructor vacio tal que asi: los constructores solo tienen un modificador de acceso,no tienen designados un tipo 
de dato  que puede ser opcional
si agregamos mas constructores con diferenteas tipos de parametros ya no se designa automaticamente como constructor vacio esto sirve generalmente
para procesar cualquier valor al momento de crear el objeto y no designar los valores directamente por proceso sino simplemente poner valores y que
 procese directamente en el momento en el que se cree ese objeto con x parametros
*/

public Constructores(){
   System.out.println("Ejecutando constructor vacio");/*Preferiblemente dejarlo vacio como se dice XD */
}
/*Constructor con dos argumentos ,
como hemos creado dos constructores nos metemos en el area de sobrecarga de constructores  */
public Constructores(int ope1,int ope2){
    System.out.println("Ejecutando constructor con dos parametros dentro de sus argumentos para proceso directo");
    operando1=ope1;/*Hay que asignar los parametros a los operandos ya que aunque ingreses esos parametros sino hay un proceso despues para 
    asignarlos dentro de su funcion de suma o resta jamas pasaran a suma o resta dejandonos un resultado default de 0 */
    operando2=ope2;
}
    public static void main(String[] args) {
 System.out.println("Ejemplo Aritmetica");
        var instanciarClase=new Constructores();/*Al new se considera como el constructor de nuestra clase ya que sino especificamos
        se agrega de manera automatica el constructor vacio */
    instanciarClase.operando1=5;
    instanciarClase.operando2=7;
    instanciarClase.sumar();
    instanciarClase.restar();

    var instanciarClase2=new Constructores();
    instanciarClase2.operando1=12;
    instanciarClase2.operando2=16;
    instanciarClase2.sumar();
    instanciarClase2.restar();

    var instanciarClase3=new Constructores(5,7);
    instanciarClase3.sumar();
    instanciarClase3.restar();
    

}
}


