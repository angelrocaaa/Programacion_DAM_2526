package org.example;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Random {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int rango = 0;
        int min = 0;
        int max = 0;
        int num_aleatorio = 0;

        try {
            System.out.println("Introduce el rango mínimo: ");
            min = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("El formato no es el adecuado");
            return;
        }

        try {
            System.out.println("Introduce el rango máximo: ");
            max = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("El formato no es el adecuado");
            return;
        }
        if (min >= max) {
            System.out.println("El rango mínimo no puede ser mayor o igual que el rango máximo");
        } else {
            try {
                System.out.println("Introduce el número de aleatorios que quieres: ");
                num_aleatorio = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("El formato no es el adecuado");
                return;
            }

            for (int i = 0; i<num_aleatorio;i++) {
                rango = aleatorio.nextInt(max - min + 1) + min;
                System.out.println(rango);
            }
        }

    }
}
