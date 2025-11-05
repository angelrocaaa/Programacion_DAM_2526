package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Arrays {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int vector[] = new int[25];

        int contador = 0;


            for (int i=0;i< vector.length;i++) {
                vector[i]=aleatorio.nextInt(101);
            }

            System.out.println(Arrays.toString(vector));

            System.out.println("Ingrese un número para buscar [0,100]: ");
            int num = teclado.nextInt();

            for (int i=0;i< vector.length;i++) {
                if (vector[i] == num) {
                    contador++;
                }
            }

        System.out.println("El número " + num + " aparece " + contador + " veces en el array");

    }

}
