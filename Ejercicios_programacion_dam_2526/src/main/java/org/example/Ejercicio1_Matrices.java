package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1_Matrices {

    static void main() {

        Random aleatorio = new Random();

        int filas = aleatorio.nextInt(6)+2;

        int matriz[][] = new int [filas][filas];

        for (int i=0;i< matriz.length;i++) {

            for (int j=0;j<matriz[i].length;j++) {
                matriz[i][j] = aleatorio.nextInt(1000)+1;
            }
        }

        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        for (int i=0;i< matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                if (i==j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println();

        for (int i=0;i<matriz.length;i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        for (int i=0;i<matriz.length;i++) {
                System.out.print(matriz[i][matriz.length-1-i] + " ");
        }

    }
}