package org.example;

import java.util.Scanner;

public class Ejercicio4BuclesAnidados {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor m: ");
        int m = teclado.nextInt();

        externo:
        for (int i=2;i<=m;i++) {
            interno:
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    continue externo;
                }
            }

            System.out.print(i + " ");
        }

    }
}
