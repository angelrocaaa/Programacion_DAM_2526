package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        double horas = 0;
        double tarifa = 0;

        boolean repetir = true;

        Scanner teclado = new Scanner(System.in);

        do {
            try {
                System.out.println("Introduce el número de horas: ");
                horas = teclado.nextDouble();
                System.out.println("Introduce la tarifa por hora: ");
                tarifa = teclado.nextDouble();
                repetir = false;
            } catch (Exception e) {
                System.out.println("Debes de introducir un número");
            }
            teclado.nextLine();

        }while (repetir==true);

        double salario = horas * tarifa;
        System.out.println("Salario: " + salario + "€");
    }
}
