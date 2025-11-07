package org.example;

import java.util.Arrays;

public class Split {

    static void main() {

        String cadena = "patri;liber;fabian;silvia;angel;manuela;vero";

        String profesores[] = cadena.split(";");

        System.out.println(Arrays.toString(profesores));

        int vector[] = new int[profesores.length];

        for (int i=0;i< profesores.length;i++) {
            vector[i] = Integer.parseInt(profesores[i]);
        }

    }
}
