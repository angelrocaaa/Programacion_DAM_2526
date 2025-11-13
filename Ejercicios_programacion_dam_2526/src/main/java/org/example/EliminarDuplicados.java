package org.example;

import java.util.Arrays;

public class EliminarDuplicados {

    static void main() {

        int vector[] = {1,3,5,5,7,7,9};

        int auxiliar[] = new int[vector.length];

        int tam = 0;

        for (int i=0;i<= vector.length-1;i++) {
            if (i==vector.length-1) {
                auxiliar[i]=vector[i];
                tam++;
            } else if (vector[i]!=vector[i+1]) {
                auxiliar[i]=vector[i];
                tam++;
            }
        }

        System.out.println(Arrays.toString(auxiliar));
        System.out.println(tam);

        int limpio[] = new int[tam];
        int j = 0;

        for (int i=0;i<auxiliar.length;i++) {
            if (auxiliar[i]!=0) {
               limpio[j]=auxiliar[i];
               j++;
            }
        }

        System.out.println(Arrays.toString(limpio));
    }
}
