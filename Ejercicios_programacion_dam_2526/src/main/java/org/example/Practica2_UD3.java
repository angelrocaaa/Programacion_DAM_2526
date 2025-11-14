package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2_UD3 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        int numeros[] = new int[6];

        System.out.println("Introduce los datos de tu boleto: ");

        for (int i = 0; i< numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(50);
        }

        System.out.println(Arrays.toString(numeros));

        boolean comprobar = true;

        while (comprobar){

            comprobar = false;
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));

            for (int i=0;i< numeros.length;i++) {
                if (i!= numeros.length-1 && numeros[i]==numeros[i+1]) {
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(50)+1;
                    comprobar = true;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));

    }
}
