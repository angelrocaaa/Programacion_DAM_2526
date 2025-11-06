package org.example;

public class Ejercicio6Arrays {

    static void main() {

        int vector[] = {3,9,1,9,3};

        boolean es_o_no =true;

        for (int i=0;i< vector.length/2;i++) {
            if (vector[i]!=vector[vector.length-1-i]) {
                System.out.println("No es palindromo");
                es_o_no=false;
                break;
            }
        }

        if (es_o_no) System.out.println("Es palindromo");
    }
}
