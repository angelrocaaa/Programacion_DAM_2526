package org.example;

import java.util.Random;

public class Ejercicio4Random {

    static void main() {

        Random aleatorio = new Random();

        final int MIN = 5;
        final int MAX = 9;

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String contrasenya = "";
        int rango = aleatorio.nextInt(MAX - MIN + 1) + MIN;

        for (int i=0;i<rango ; i++) {
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }

        contrasenya += mayus.charAt(aleatorio.nextInt( mayus.length() - 1));
        contrasenya += minus.charAt(aleatorio.nextInt( minus.length() - 1));
        contrasenya += num.charAt(aleatorio.nextInt( num.length() - 1));

        System.out.println(contrasenya);
    }
}