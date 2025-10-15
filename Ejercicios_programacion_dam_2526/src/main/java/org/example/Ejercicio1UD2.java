package org.example;

import java.util.Scanner;

public class Ejercicio1UD2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase: ");
        String frase = teclado.nextLine();

        System.out.println("Texto original: " + frase);

        int tamanyo = frase.length();
        System.out.println("La longitud del texto es: " + tamanyo);

        String frase_reemplazos = frase.replace(" ", "");
        System.out.println("Texto sin espacios: " + frase_reemplazos);

        

    }
}
