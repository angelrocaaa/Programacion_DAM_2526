package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2_Matrices {

    static void main() {

        Random aleatorio = new Random();

        int matriz[][] = new int[3][4];
        int matriz2[][] = new int[3][4];
        int m[][] = new int[3][4];

        for (int i=0;i< matriz.length;i++) {
            for (int j=0; j<matriz[i].length;j++) {

                matriz[i][j] = aleatorio.nextInt(20)+1;
                matriz2[i][j] = aleatorio.nextInt(20)+1;

                if (matriz[i][j]> matriz2[i][j]) {
                    m[i][j] = matriz[i][j];
                } else {
                    m[i][j] = matriz2[i][j];
                }
            }
        }

        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println();

        for (int fila[] : matriz2) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println();

        for (int fila[] : m) {
            System.out.println(Arrays.toString(fila));
        }




    }
}
