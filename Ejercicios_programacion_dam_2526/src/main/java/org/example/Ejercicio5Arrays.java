package org.example;

import java.util.Arrays;

public class Ejercicio5Arrays {

    static void main() {

        int vector[] = {5,6,7,8,9};
        int aux = 0;

        System.out.println(Arrays.toString(vector));

        for (int i=vector.length-1;i>=0;i--) {
            if (i == vector.length-1) {
                aux = vector[i];
                vector[i]=vector[i+1];
            } else {
                vector[i]=vector[i-1];
            }
        }

        vector[0]=aux;

        System.out.println(Arrays.toString(vector));
        System.out.println(aux);


    }
}