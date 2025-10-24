package org.example;

import java.util.Scanner;

public class Práctica3UD2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un ISBN");
        String isbn = teclado.next();
        int tamanyo_isbn = isbn.length();

        System.out.println("***** VALIDADOR ISBN *****");
        System.out.println("---------------------------");
        System.out.println("1 - Validar ISBN");
        System.out.println("2 - Reparar ISBN");
        System.out.println("3 - SALIR");
        System.out.println("---------------------------");
        System.out.println("Elige la opción que deseas hacer con el ISBN: ");
        int opcion = teclado.nextInt();

        if (tamanyo_isbn == 10) {
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("No es ninguna opción de las ofrecidas");
                    break;
            }
        } else if (tamanyo_isbn > 10){
            System.out.println("Has introducido más de 10 dígitos");
        } else {
            System.out.println("Has introducido menos de 10 dígitos");
        }





    }
}
