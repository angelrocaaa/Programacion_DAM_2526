package org.example;

import java.util.Scanner;

public class Practica2UD2 {
    static void main() {

        //Declaramos las variables
        Scanner teclado = new Scanner(System.in);
        double resultado = 0;
        double operando1 = 0;
        double operando2 = 0;

        //Bienvenida
        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        //Hacemos el try catch ya que le estamos pidiendo que nos escriba un número y nos puede saltar el catch si no se introduce un número
        try {
            System.out.println("Introduce el primer operando: ");
            operando1 = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("ERROR. El formato introducido no es correcto");
            return;
        }

        //Menú que veremos por pantalla
        System.out.println("--------------------");
        System.out.println("  [+]  ->  sumar");
        System.out.println("  [-]  ->  restar");
        System.out.println("  [x]  ->  multiplicar");
        System.out.println("  [/]  ->  dividir");
        System.out.println("  [R]  ->  raíz cudrada");
        System.out.println("--------------------");
        System.out.println("Elige una operación: ");
        String operacion = teclado.next();

        //Si la variable operación es distinto a R entonces le pediremos que introduzca el segundo operando
        if (!operacion.equals("R")) {
            //Hacemos el try catch ya que le estamos pidiendo que nos escriba un número y nos puede saltar el catch si no se introduce un número
            try {
                System.out.println("Introduce el segundo operando: ");
                operando2 = teclado.nextDouble();
            } catch (Exception e) {
                System.out.println("ERROR. El formato introducido no es correcto");
                return;
            }

        }
        //La variable operación depende el valor que tenga hara una de las siguientes operaciones y si no es ninguna de las que hay salta el default diciendo que operación no disponible
        switch (operacion) {
            case "+":
                //Hacemos la suma
                resultado = operando1 + operando2;
                System.out.println("El resultado de " + operando1 + " + " + operando2 + " es " + resultado);
                break;
            case "-":
                //Hacemos la resta
                resultado = operando1 - operando2;
                System.out.println("El resultado de " + operando1 + " - " + operando2 + " es " + resultado);
                break;
            case "x":
                //Hacemos la multiplicación
                resultado = operando1 * operando2;
                System.out.println("El resultado de " + operando1 + " * " + operando2 + " es " + resultado);
                break;
            case "/":
                //Hacemos la división si el operando2 no es igual a 0, si es igual la división no se hará
                if (operando2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    resultado = operando1 / operando2;
                    System.out.println("El resultado de " + operando1 + " / " + operando2 + " es " + resultado);
                }
                break;
            case "R":
                //Hacemos la raíz cuadrada si el operando 1 es mayor que 0, si no lo es no se hace la raíz cuadrada ya que no se puede hacer de números negativos
                if (operando1 < 0) {
                    System.out.println("No se puede hacer la raíz cuadrada de números negativos");
                } else {
                    resultado = Math.sqrt(operando1);
                    System.out.println("El resultado de la raíz cuadrada de " + operando1 + " es " + resultado);
                }
                break;
            default:
                //Si no es ninguna de las opciones anteriores salta ERROR. Operación no disponible
                System.out.println("ERROR. Operación no disponible");
                break;
        }
    }
}
