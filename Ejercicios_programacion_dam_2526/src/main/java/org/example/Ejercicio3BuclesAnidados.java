package org.example;

import java.util.Scanner;

public class Ejercicio3BuclesAnidados {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Introduce el número máximo: ");
        int max = teclado.nextInt();

        externo:
        for (int i=1;i<=9;i++) {
            System.out.println();
            System.out.println("Tabla del " + i);
            interno:
            for (int j=1;j<=10;j++) {
                resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
                if (max < resultado) {
                    break externo;
                }
            }
        }


    }
}
