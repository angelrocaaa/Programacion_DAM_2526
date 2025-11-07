package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
//
//        int vector[] = {1,3,4,6,10};
//        System.out.println(Arrays.toString(vector));
//        System.out.println(vector.length);
//
//        vector[0] = 33;
//        vector[3] = 67;
//
//        System.out.println(Arrays.toString(vector));
//
//        String vector2[] = new String[5];
//        System.out.println(Arrays.toString(vector2));
//
//        for (int i=0;i<vector.length;i++) {
//            System.out.println(vector[i]);
//        }
//
//        System.out.println("--------- Ángel Rocamora Santa ---------");
//
//        for (int i=vector.length-1;i>=0;i--) {
//            System.out.println(vector[i]);
//        }
//
//        int vector3[] = new int [8];
//
//        vector3=vector;
//
//        vector3=vector.clone();
//
//        System.out.println(Arrays.toString(vector3));
//
//        for (int i=0;i< vector3.length;i++) {
//            vector3[i]=aleatorio.nextInt(501);
//        }
//
//        System.out.println(Arrays.toString(vector3));

        int vector4[] = new int[4];

        for (int i=0;i< vector4.length;i++) {
            try {
                vector4[i] = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor incorrecto introducido");
            }

        }

        System.out.println(Arrays.toString(vector4));



    }
}