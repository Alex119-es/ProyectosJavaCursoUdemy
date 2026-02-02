package TEMASBASE.Operadores_Java;

public class Operadores_Unarios {

    public static void main(String[] args) {
        System.out.println("Operadores Unarios");
        int a = 3, b = -2, resultado;
        var c = true;
        /* operador unario + y - */
        resultado = +a;
        /*
         * nota: a+=b es como :a=a+b,si tuviese mas letras seria a=a+(b+c)
         * este de aqui asigna valores y sinse sigue usando mantiene los valores
         * antiguos que ya se hayan usado con los nuevos
         * a=+b es como :a=+5 este cambia valores
         */
        System.out.println(
                """
                        nota: a+=b es como :a=a+b,si tuviese mas letras seria a=a+(b+c)
                        este de aqui asigna valores y si se sigue usando mantiene los valores antiguos que ya se hayan usado con los nuevos\n
                          a=+b es como :a=+5
                        este cambia valores \n \n
                        """);

        System.out.println("resultado =+a es: " + resultado);
        resultado = -a;
        System.out.println("resultado=-a: " + resultado);

        /*
         * Operadores unarios uncremento/decremento/
         * /Pre-incremento
         */
        a = 3;
        resultado = ++a;
        System.out.println("Resultado = ++a= es: " + resultado);
        System.out.println("\"a\" ya se incremento:" + a);
        /* Post-incremento */
        a = 3;
        resultado = a++;/*
                         * primero se usa el valor y despues se incrementa hasta que se vuelva a usar la
                         * variable de "a" tiene un incremento pendiente
                         */
        System.out.println("Resultado a++ es: " + resultado);
        System.out.println(
                "Pero \"a\" ahora va a incrementar su valor porque lo ejecutamos en la otra instruccion de resultado: "
                        + a);
        /* Pre-decremento */
        b = -2;
        resultado = --b;
        System.out.println("\nresultado --b: " + resultado);
        System.out.println("variable b originaria ya decrementada: " + b);
        /* Post-decremento */
        b = -2;
        resultado = b--;
        System.out.println("resultado= b-- : " + resultado);
        System.out.println("Ejecucion de b variable originaria(decremento pendiente realizado): " + b);

    }

}