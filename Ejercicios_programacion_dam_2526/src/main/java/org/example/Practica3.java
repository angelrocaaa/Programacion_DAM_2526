package org.example;

import java.util.Scanner;

public class Practica3 {
    static void main() {

        //escribimos scanner teclado para que pueda leer lo que escribimos por teclado
        Scanner teclado = new Scanner(System.in);

        //declaramos las constantes y variables
        int altura = 0;
        final int ALTURA_MIN = 140;
        final int ALTURA_MAX = 230;
        final int PESO_MAX = 120;
        int peso = 0;
        double peso_min = 0;

        //Bienvenido
        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        //Pedimos la edad, ponemos el try catch por si escriben por teclado algo que no es número y entonces terminaria la ejecución
        try {
            System.out.println("Introduzca su altura (en cm)...");
            altura = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("El formato no es el adecuado");
            return;
        }

        //Condición si la altura es menos que la mínima termina ejecución y sino miramos que no se pase la altura máxima.
        if (altura < ALTURA_MIN && altura > 0) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN." + " Te faltan " + (ALTURA_MIN-altura) + " cm de altura.");
            return;
        } else if (altura > ALTURA_MAX || altura < 0) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
            return;
        }


        //Pedimos el peso, ponemos el try catch por si escriben por teclado algo que no es número y entonces terminaria la ejecución
        //Calculamos el peso mínimo
        try {
            peso_min = (altura * 2) / 8;
            System.out.println("Introduzca su peso (en kg)...");
            peso = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("El formato no es el adecuado");
            return;
        }


        //Condicion para el peso y si su peso es mayor que el mínimo puede subir a la atracción, si se pasa del peso no podrá subir.
        if (peso > peso_min && peso < PESO_MAX) {
            System.out.println("Pesas " + peso + " kg." + " Peso mínimo calculado: " + peso_min + " kg.");
            System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
        } else {
            System.out.println("LO SIENTO. Sobrepasas " + (peso - PESO_MAX) + " kg el límite de la atracción.");
        }


    }
}
