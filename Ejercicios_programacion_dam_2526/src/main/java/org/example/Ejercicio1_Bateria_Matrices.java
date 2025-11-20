package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_Bateria_Matrices {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        System.out.println("Introduce numeros para llenar la matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int numeros = teclado.nextInt();
                matriz[i][j] = numeros;
            }
        }

        System.out.println("Matriz:");

        for (int filas[] : matriz) {
            System.out.println(Arrays.toString(filas));
        }

        System.out.println("Número a buscar: ");
        int buscar = teclado.nextInt();

        externo:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (buscar == matriz[i][j]) {
                    System.out.println("Salida: ");
                    System.out.println("El número " + buscar + " se encuentra en la posición " + "(" + i + ", " + j + ").");
                    break externo;
                }
            }
        }




    }
}
