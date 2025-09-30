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
        }
    }

}
