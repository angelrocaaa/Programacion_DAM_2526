package org.example;

import java.util.Arrays;

public class Vectores {

    static void main() {

        int vector[] = {1,3,4,6,10};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        vector[0] = 33;
        vector[3] = 67;

        System.out.println(Arrays.toString(vector));

        String vector2[] = new String[5];
        System.out.println(Arrays.toString(vector2));

        for (int i=0;i<vector.length;i++) {
            System.out.println(vector[i]);
        }

        System.out.println("--------- Ángel Rocamora Santa ---------");

        for (int i=vector.length-1;i>=0;i--) {
            System.out.println(vector[i]);
        }

    }
}