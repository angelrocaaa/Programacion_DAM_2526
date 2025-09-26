package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de horas: ");
        double horas = teclado.nextDouble();

        System.out.println("Introduce la tarifa por hora: ");
        double tarifa = teclado.nextDouble();

        double salario = horas * tarifa;
        System.out.println("Salario: " + salario + "€");


    }
}
