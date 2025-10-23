package org.example;

import java.util.Scanner;

public class Bucle5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cualquier número: ");
        int num = teclado.nextInt();

        for (int i=0;i<=10;i++) {
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }
    }
}
