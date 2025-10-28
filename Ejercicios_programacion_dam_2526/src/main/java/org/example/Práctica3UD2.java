package org.example;

import java.util.Scanner; // Para leer datos del teclado

public class Práctica3UD2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //Declaramos variables
        int opcion = 0;
        int valor_x = 10;

        //Mostramos el menú por pantalla
        System.out.println("***** VALIDADOR ISBN *****");
        System.out.println("---------------------------");
        System.out.println("1 - Validar ISBN");
        System.out.println("2 - Reparar ISBN");
        System.out.println("3 - SALIR");
        System.out.println("---------------------------");

        //Hacemos uso del try catch por si no es un numero el que se introduce
        try {
            System.out.print("Elige la opción que deseas: ");
            opcion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR. El formato no es el adecuado");
            return;
        }

        switch (opcion) {
            case 1:
                //Preguntamos sobre el ISBN
                System.out.print("Introduce el ISBN: ");
                String isbn = teclado.next();

                if (isbn.length() != 10) {
                    System.out.println("El ISBN debe tener 10 caracteres.");
                    return;
                }

                int suma = 0;

                //Recorremos del 0 al 9
                for (int i = 0; i < 10; i++) {
                    char caracter_isbn = isbn.charAt(i);
                    if (i == 9 && caracter_isbn == 'X') {
                        valor_x = 10;
                    } else {
                        //Vemos la posición
                        valor_x = Integer.parseInt(String.valueOf(caracter_isbn));
                    }
                    suma += valor_x * (10 - i);
                }

                if (suma % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                } else {
                    System.out.println("El ISBN NO es válido.");
                }
                break;

            case 2:
                System.out.print("Introduce el ISBN que desees reparar: ");
                String reparar_isbn = teclado.next();

                if (reparar_isbn.length() != 10 || !reparar_isbn.contains("?")) {
                    System.out.println("El ISBN debe tener 10 caracteres y contener '?'");
                    return;
                }

                int posicion = reparar_isbn.indexOf('?');

                //Probamos todos los dígitos del 0 al 9
                for (int i = 0; i <= 9; i++) {
                    char caracter_posible = (char) ('0' + i);

                    //Creamos el posible ISBN
                    String posible = reparar_isbn.substring(0, posicion) + caracter_posible + reparar_isbn.substring(posicion + 1);

                    int suma2 = 0;

                    //Calculamos la suma
                    for (int valor_posible = 0; valor_posible < 10; valor_posible++) {
                        char c = posible.charAt(valor_posible);
                        int valor = c - '0';
                        suma2 += valor * (10 - valor_posible);
                    }

                    //Si la suma es válida mostraremos el resultado y salimos
                    if (suma2 % 11 == 0) {
                        System.out.println("ISBN corregido: " + posible);
                        return;
                    }
                }

                //No se ha podido reparar
                System.out.println("No se ha podido reparar el ISBN.");
                break;

            //Sale si escribimos 3 en la opcion
            case 3:
                System.out.println("Saliendo del validador de ISBN...");
                break;

            //Si es distinto a 1, 2 o 3 opción no valida y termina
            default:
                System.out.println("ERROR. Opción no válida.");
                break;
        }
    }
}