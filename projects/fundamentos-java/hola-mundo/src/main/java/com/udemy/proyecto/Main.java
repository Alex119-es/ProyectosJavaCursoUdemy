package com.udemy.proyecto;

/**
 * Programa Hola Mundo en Java
 * Curso de Java - Udemy
 * 
 * Este es el programa más básico en Java que demuestra:
 * - Estructura de una clase Java
 * - El método main como punto de entrada
 * - Uso de System.out.println para mostrar texto
 */
public class Main {
    public static void main(String[] args) {
        // Mostrar mensaje básico
        System.out.println("¡Hola Mundo desde Java!");
        
        // Demostrar algunos conceptos básicos
        System.out.println("Bienvenido al curso de Java de Udemy");
        
        // Variables básicas
        String nombre = "Estudiante";
        int edad = 25;
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
        
        // Operaciones matemáticas básicas
        int suma = 5 + 3;
        System.out.println("5 + 3 = " + suma);
    }
}