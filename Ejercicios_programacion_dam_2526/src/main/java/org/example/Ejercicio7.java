package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hay tomate (S/N)?");
        char tomate = teclado.next().charAt(0);
        System.out.println("¿Hay aceite (S/N)?");
        char aceite = teclado.next().charAt(0);
        System.out.println("¿Hay jamón (S/N)?");
        char jamon = teclado.next().charAt(0);

        if (tomate=='N' || aceite=='N' || jamon=='N') {
            System.out.println("¡Tenemos que ir a comprar!");
        } else {
            System.out.println("¡No tenemos que ir a comprar!");
        }

    }
}
