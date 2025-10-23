package org.example;

import java.util.Scanner;

public class Bucle4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();
        int letras = palabra.length();

        for (int i=letras-1;i>=0;i--){ //desde el último caracter hasta el primero
            System.out.println(palabra.charAt(i));

        }

        for (int i=0;i<letras;i++){ //desde el primer caracter hasta el último
            System.out.println(palabra.charAt(i));

        }

    }
}
