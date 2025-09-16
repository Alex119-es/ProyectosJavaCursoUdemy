package Ejercicios_ScannerYPosterior;

import java.util.Scanner;

public class RetoRecetasCocina {
static Scanner teclado=new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Cual es el nombre de la receta: ");
    String nombreReceta=teclado.nextLine();
System.out.println("Cuales son los ingredientes principales: ");
String ingredientesReceta=teclado.nextLine();
System.out.println("Tiempo de preparacion: ");
double tiempoReceta=Double.valueOf(teclado.nextLine());
System.out.println("Dificultad de la receta: ");
String dificultadReceta=teclado.nextLine();
System.out.println("Nombre: "+nombreReceta+"\nIngredientes de la receta: "+ingredientesReceta+"\nTiempo de demora de la receta: $%.2f".formatted(tiempoReceta) +"\nDificultad: "+dificultadReceta);

}}