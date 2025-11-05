package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2Arrays {

    static void main() {

        int vector[] = {1,9,8,3,2};
        int aux = 0;

        System.out.println("Array original: " + Arrays.toString(vector));


        for (int i=0;i< vector.length/2;i++) {

            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }

        System.out.println("Array invertido: " + Arrays.toString(vector));
    }
}
