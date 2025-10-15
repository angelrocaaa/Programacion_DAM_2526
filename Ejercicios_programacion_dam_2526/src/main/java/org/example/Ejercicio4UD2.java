package org.example;

import java.util.Scanner;

public class Ejercicio4UD2 {

    static void main() {

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";

        int texto_tamanyo = texto.length();
        int palabra_tamanyo = palabra.length();

        String frase_sin = texto.replace(palabra,"");
        int conteo = frase_sin.length();
        int resta = texto_tamanyo - conteo;
        int resultado = resta / palabra_tamanyo;
        System.out.println("El resultado es: " + resultado);






    }
}
