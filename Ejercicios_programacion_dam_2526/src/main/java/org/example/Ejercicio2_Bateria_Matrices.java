package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2_Bateria_Matrices {

    static void main() {

        int contador = 0;

        Random aleatorio = new Random();

        int matriz[][] = new int[aleatorio.nextInt(5)+1][aleatorio.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(20)+10;
            }

        }

        System.out.println("Matriz:");

        for (int fila[] : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Suma de filas:");

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma=0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            System.out.println("Fila " + (i+1) + ": " + suma);
        }

        System.out.println();

        System.out.println("Suma de columnas:");

        for (int i = 0; i < matriz[0].length; i++) {
            suma=0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[j][i];
            }

            System.out.println("Columna " + (i+1) + ": " + suma);
        }

        suma = 0;
        int fila2 = aleatorio.nextInt(matriz.length-1);
        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[fila2][i];
        }

        System.out.println("1 fila: " + suma);


    }
}
