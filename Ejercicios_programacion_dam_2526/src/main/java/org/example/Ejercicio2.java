package org.example;

import java.util.Scanner;

public class Ejercicio2 {

    static void main() {

        final double JORNADA = 40;
        final double EXTRA = 1.5;
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
        } while (repetir==true);

        if (horas > 40) {
            double horas_extra = horas - JORNADA;
            double tarifa_extra = tarifa * EXTRA;
            double salario_extra = horas_extra * tarifa_extra;
            System.out.println("Salario extra: " + (salario_extra+JORNADA*tarifa) + "€");
        } else {
            double salario = horas * tarifa;
            System.out.println("Salario: " + salario + "€");
        }




    }
}
