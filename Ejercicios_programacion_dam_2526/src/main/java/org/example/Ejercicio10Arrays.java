package org.example;

import java.util.Scanner;

public class Ejercicio10Arrays {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String palabra[] = {"angel","denis","jacobo","joaquin"};

        System.out.println("Introduce una letra (inicial)...");
        char letra = teclado.next().charAt(0);

        for (int i = 0;i< palabra.length;i++) {
            if (letra == palabra[i].charAt(0)) {
                System.out.println(palabra[i]);
            }
        }
    }
}
