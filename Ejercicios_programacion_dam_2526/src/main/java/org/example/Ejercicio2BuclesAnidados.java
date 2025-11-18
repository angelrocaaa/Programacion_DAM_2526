package org.example;

import java.util.Scanner;

public class Ejercicio2BuclesAnidados {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        int altura = teclado.nextInt();

        for (int i=1;i<=altura;i++) {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
