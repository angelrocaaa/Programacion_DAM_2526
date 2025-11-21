package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3_UD3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        final int MAXIMO = 48;
        int ancho = 0;
        int alto = 0;

        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        do {
            System.out.println("Ancho:");
            ancho = teclado.nextInt();
            System.out.println("Alto:");
            alto = teclado.nextInt();
        } while (ancho % 8 == 1 || alto % 8 == 1 || ancho > MAXIMO || alto > MAXIMO);

        String matriz[][] = new String[alto][ancho];

        externo:
        for (int i = 0; i < matriz.length; i++) {
            interno:
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce línea a línea) los colores de tu imagen para cada píxel:");
                String letra = teclado.next();

                if (!letra.matches("[A-O]")) {
                    System.out.println("Has introducido un valor de píxel incorrecto (A-O)");
                    i--;
                    continue externo;
                }
            }
        }

    }
}
