package org.example;

import java.util.Scanner;

public class Practica4 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        //declaramos las variables
        int num1 = 0;
        int num2 = 0;

        //hacemos uso del buleano para que nos repita la pregunta del try
        boolean repetir = true;

        //el do se ejecutara gracias al while ya que mientras que sea repetir==false se ejecutara otra vez hasta que el usuario introduzca 3 numeros.
        do {
            repetir = false;
            //el try catch es para cuando veamos que nos puede dar un error para hacer una excepción por si salta el error que que nos muestre un mensaje
            try {
                System.out.println("Introduce el multiplicando (3 cifras): ");
                num1 = teclado.nextInt();
                repetir = true;
            } catch (Exception e) {
                System.out.println("El formato no es el adecuado");
            }
            //condición de si num1 es mayor que 999 o mayor que 100 y el buleano sea true entonces nos devuelva que el numero no es de 3 cifras
            if ((num1 > 999 || num1 < 100) && repetir==true) {
                System.out.println("El multiplicando introducido no es de 3 cifras");
                repetir = false;
            }
            teclado.nextLine();
        } while (repetir==false);

        //el do se ejecutara gracias al while ya que mientras que sea repetir==false se ejecutara otra vez hasta que el usuario introduzca 3 numeros.
        do {
            //el try catch es para cuando veamos que nos puede dar un error para hacer una excepción por si salta el error que que nos muestre un mensaje.
            repetir = false;
            try {
                System.out.println("Introduce el multiplicador (3 cifras): ");
                num2 = teclado.nextInt();
                repetir = true;
            } catch (Exception e) {
                System.out.println("El formato no es el adecuado");
            }

            //condición de si num2 es mayor que 999 o mayor que 100 y el buleano sea true entonces nos devuelva que el numero no es de 3 cifras
            if ((num2 > 999 || num2 < 100) && repetir==true) {
                System.out.println("El multiplicador introducido no es de 3 cifras");
                repetir = false;
            }
            teclado.nextLine();
        } while (repetir==false);

        //num2 cogemos el caracter de la posicion 2 hasta la posicion 3 y después hacemos la multiplicación
        String num2_1 = Integer.toString(num2);
        String num2_2 = num2_1.substring(2,3);
        int num2_3 = Integer.parseInt(num2_2);
        int resultado_1 = num1 * num2_3;

        //num2 cogemos el caracter de la posicion 1 hasta la posicion 2 y después hacemos la multiplicación
        String num2_4 = Integer.toString(num2);
        String num2_5 = num2_4.substring(1,2);
        int num2_6 = Integer.parseInt(num2_5);
        int resultado_2 = num1 * num2_6;

        //num2 cogemos el caracter de la posicion 0 hasta la posicion 1 y después hacemos la multiplicación
        String num2_7 = Integer.toString(num2);
        String num2_8 = num2_7.substring(0,1);
        int num2_9 = Integer.parseInt(num2_8);
        int resultado_3 = num1 * num2_9;

        //calculamos el resultado total y mostramos por pantalla el proceso de la multiplicación
        int resultado_total = num1 * num2;
        System.out.println("El producto de la multiplicación es: " + resultado_total);
        System.out.println("El proceso es:");
        System.out.println("  " + num1);
        System.out.println("x " + num2);
        System.out.println("--------");
        System.out.println("  " + resultado_1);
        System.out.println("" + resultado_2 + "x");
        System.out.println("" + resultado_3 + "xx");
        System.out.println("--------");
        System.out.println(resultado_total);

    }
}
