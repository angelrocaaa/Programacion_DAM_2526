package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("El número 0 es natural");
        } else {
            if (numero > 0) {
                System.out.println("El número introducido es mayor que 0");
            } else {
                System.out.println("El número introducido es menor que 0");
            }
        }
    }
}
