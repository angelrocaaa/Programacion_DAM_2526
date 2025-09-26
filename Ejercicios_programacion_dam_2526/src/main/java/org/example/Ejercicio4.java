package org.example;

import java.util.Scanner;

public class Ejercicio4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int num3 = teclado.nextInt();

        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        } else if (num1 < num2) {
            int min = num1;
            System.out.println("El numero" + min "es el mínimo");
        } else if (num1 < num3) {
            int min = num3;
            System.out.println("El numero" + min "es el mínimo");
        } else if (num2 < num3) {
            int min = num2;
            System.out.println("El numero" + min "es el mínimo");
    }
    }

}
