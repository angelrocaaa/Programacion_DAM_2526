package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {


        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        boolean repetir = true;

        do {
            try {
                System.out.println("Introduce un número: ");
                numero = teclado.nextInt();
                repetir = false;
            } catch (Exception e) {
                System.out.println("Debes de introducir");
            }
            teclado.nextLine();
        } while (repetir==true);


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
