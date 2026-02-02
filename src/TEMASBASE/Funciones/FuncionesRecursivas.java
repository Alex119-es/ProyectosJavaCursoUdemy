package TEMASBASE.Funciones;

public class FuncionesRecursivas {

    static void funcionRecursiva(int numero){
        /*Caso Base: detiene la recursión cuando numero == 1*/
        if (numero == 1) {
            System.out.print(numero + " ");
        }
        else {
            /*Caso recursivo: primero llama recursivamente con numero-1,
            luego (cuando regresa) imprime el número actual.
            Esto produce orden ASCENDENTE: 1 2 3 4 5*/
            funcionRecursiva(numero - 1);
            System.out.print(numero + " "); // Se ejecuta al regresar
        }
    }
    
    static void funcionRecursivaDescendente(int numero){
        /*Caso Base: detiene la recursión cuando numero == 1*/
        if (numero == 1) {
            System.out.print(numero + " ");
        }
        else {
            /*Caso recursivo: primero imprime el número actual,
            luego llama recursivamente con numero-1.
            Esto produce orden DESCENDENTE: 5 4 3 2 1*/
            System.out.print(numero + " "); // Se ejecuta antes de llamar
            funcionRecursivaDescendente(numero - 1);
        }
    }

    /*Función recursiva: función que se llama a sí misma.
    Reglas fundamentales:
    1. Debe tener un CASO BASE que detenga la recursión
    2. Cada llamada recursiva debe acercarse al caso base
    3. Sin caso base = recursión infinita = StackOverflowError
    */
    
    public static void main(String[] args) {
        System.out.println("Orden ascendente:");
        funcionRecursiva(5); // Imprime: 1 2 3 4 5
        
        System.out.println("\n\nOrden descendente:");
        funcionRecursivaDescendente(5); // Imprime: 5 4 3 2 1
    }
}
