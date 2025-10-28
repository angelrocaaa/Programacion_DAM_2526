package org.example;

import java.util.Random;

public class Ejercio1Random {

    static void main() {
        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6)+1;
        int dado2 = aleatorio.nextInt(6)+1;
        int resultado = dado1 + dado2;

        System.out.println("El resultado del primer dado es: " + dado1);
        System.out.println("El resultado del segundo dado es: " + dado2);
        System.out.println("La suma total de los dos dados es: " + resultado);


    }
}
