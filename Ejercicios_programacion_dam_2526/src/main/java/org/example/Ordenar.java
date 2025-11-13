package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Ordenar {

    static void main() {

        Integer vector[] = {4,2,3,5,0};

        Integer vector2[] = vector.clone();

        Arrays.sort(vector2);

        System.out.println(Arrays.toString(vector));

        Arrays.sort(vector2, Collections.reverseOrder());

    }
}
