package org.example;

import java.util.Scanner;

public class Practica1UD2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        String ejemplo = "dd/mm/aaaa";
        String fecha = "";
        boolean repetir = true;

        do {
            try {
                System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
                fecha = teclado.nextLine();
                repetir = false;

            } catch (Exception e) {
                System.out.println("El formato no es el adecuado");
            }

            teclado.nextLine();
        } while (repetir==true);



        int tamanyo_fecha = fecha.length();
        int tamanyo_ejemplo = ejemplo.length();

        if (tamanyo_fecha == tamanyo_ejemplo) {

        }






    }
}
