package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4Arrays {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int vector[] = {2,4,5,7,9};

        int filtrado[] = new int[vector.length-1];

        System.out.println("Array original: " + Arrays.toString(vector));
        System.out.println("Ingresa el índice a eliminar: ");
        int eliminar = teclado.nextInt();

        for (int i=0;i<filtrado.length;i++) {
            if (i >= eliminar) {
                filtrado[i]=vector[i+1];
            }else {
                filtrado[i]=vector[i];
            }
        }

        System.out.println(Arrays.toString(filtrado));

    }
}
