package org.example;

import java.util.Scanner;

public class Ejercicio2 {

    static void main() {

        final double JORNADA = 40;
        final double EXTRA = 1.5;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de horas: ");
        double horas = teclado.nextDouble();
        System.out.println("Introduce la tarifa por hora: ");
        double tarifa = teclado.nextDouble();

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
