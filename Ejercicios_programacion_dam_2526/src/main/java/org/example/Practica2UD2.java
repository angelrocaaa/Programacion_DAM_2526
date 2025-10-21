package org.example;

import java.util.Scanner;

public class Practica2UD2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        double resultado = 0;
        double operando1 = 0;
        double operando2 = 0;

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        try {
            System.out.println("Introduce el primer operando: ");
            operando1 = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("ERROR. El formato introducido no es correcto");
            return;
        }

        System.out.println("--------------------");
        System.out.println("  [+]  ->  sumar");
        System.out.println("  [-]  ->  restar");
        System.out.println("  [x]  ->  multiplicar");
        System.out.println("  [/]  ->  dividir");
        System.out.println("  [R]  ->  raíz cudrada");
        System.out.println("--------------------");
        System.out.println("Elige una operación: ");
        String operacion = teclado.next();

        if (!operacion.equals("R")) {
            try {
                System.out.println("Introduce el segundo operando: ");
                operando2 = teclado.nextDouble();
            } catch (Exception e) {
                System.out.println("ERROR. El formato introducido no es correcto");
                return;
            }

        }
        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                System.out.println("El resultado de " + operando1 + " + " + operando2 + " es " + resultado);
                break;
            case "-":
                resultado = operando1 - operando2;
                System.out.println("El resultado de " + operando1 + " - " + operando2 + " es " + resultado);
                break;
            case "x":
                resultado = operando1 * operando2;
                System.out.println("El resultado de " + operando1 + " * " + operando2 + " es " + resultado);
                break;
            case "/":
                if (operando2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de " + operando1 + " / " + operando2 + " es " + resultado);
                }
                break;
            case "R":
                if (operando1 < 0) {
                    System.out.println("No se puede hacer la raíz cuadrada de números negativos");
                }
                resultado = Math.sqrt(operando1);
                System.out.println("El resultado de la raíz cuadrada de " + operando1 + " es " + resultado);
                break;
            default:
                System.out.println("ERROR. Operación no disponible");
                break;
        }
    }
}
