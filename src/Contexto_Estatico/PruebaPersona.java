package Contexto_Estatico;
// Aqui tambien abarcamos el tema "Ejemplo id unico"
public class PruebaPersona {
public static void main(String[] args) {
    System.out.println("***Creacion de clase y objetos persona***\n");
    // System.out.println("Variable estatica: "+Persona.contadorPersonasCreadas);
    System.out.println("Variable estatica: "+Persona.getContadorPersonas());
    var variableReferenciaInstancia=new Persona("Layla ","Acosta");
    System.out.println(variableReferenciaInstancia.toString());
    System.out.println("Variable estatica: "+Persona.getContadorPersonas());// ya no es acceso por atributo estatico en si es acceso por METODO ESTATICO
    // System.out.println("Variable estatica: "+Persona.contadorPersonasCreadas);
    var variableReferenciaInstancia2=new Persona("Ian ","Gomez");
    System.out.println(variableReferenciaInstancia2);
    // System.out.println("Variable dinamica "+Persona.contadorPersonasCreadas);
    System.out.println("Variable estatica: "+Persona.getContadorPersonas());
    // Igualmente desde el contexto dinamico es decir por parte de la referencia a objeto o instancia podemos acceder al atributo dentro de la clase 
    var variableReferenciaInstancia3=new Persona("Alex","Quishpe");
    System.out.println(variableReferenciaInstancia3);
    System.out.println("Variable estatica: "+variableReferenciaInstancia3.getContadorPersonas());// nuevamente podemos entrar de manera dinamica pero no es recomendada
    // System.out.println(variableReferenciaInstancia3.contadorPersonasCreadas);/*Aqui entramos por contexto dinamico y como podremos ver si sirve sin embargo no es buena practica */
    // ESTATICO=por nombre de la clase,DINAMICO=por referencia a esa clase
}
}
