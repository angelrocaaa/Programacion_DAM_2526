package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Ordenar {

    static void main() {

        int vector[] = {4,2,3,5,0};

        int vector2[] = vector.clone();

//        Integer numero_buscar = 5;

        Arrays.sort(vector2);

        System.out.println(Arrays.toString(vector2));

//        Arrays.sort(vector2, Collections.reverseOrder());

        System.out.println(Arrays.toString(vector2));

        int posicion = Arrays.binarySearch(vector2, 5);

        System.out.println(posicion);

    }
}
