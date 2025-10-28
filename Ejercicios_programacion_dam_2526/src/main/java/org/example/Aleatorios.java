package org.example;

import java.util.Random;

public class Aleatorios {

    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10)+1;
        int numero2 = aleatorio.nextInt(5,11);
        System.out.println(numero);
        System.out.println(numero2);

        double numero3 = aleatorio.nextDouble()*10 +1;
        System.out.println(numero3);

        double numero4 = Math.random()*10 + 1;
        System.out.println(numero4);


    }
}
