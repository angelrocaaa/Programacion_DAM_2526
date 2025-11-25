package org.example;

import java.util.Arrays;

public class MatrizResultante {

    static void main() {

        String vector[] = {"Pepe","Juan","Patri","Carlos","Bruna"};
        String matriz[][] = new String[3][5];
        for (int i = 0; i < matriz[0].length; i++) {
            matriz[2][1] = vector[i];
        }

        for (String fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
