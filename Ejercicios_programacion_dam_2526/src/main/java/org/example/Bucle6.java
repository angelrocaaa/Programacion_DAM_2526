package org.example;

import java.util.Scanner;

public class Bucle6 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos números quieres sumar?: ");
        int num = teclado.nextInt();

        for (int i=1;i<=10;i++) {
            System.out.println("Inserta nº" + i + ":");
        }
    }
}
