package org.example;

import java.util.Scanner;

public class Bucle1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String buena = "admin1234";

        do {
            System.out.println("Introduce tu contraseña: ");
            String contrasenya = teclado.next();

            if (contrasenya.equals(buena)) {
                break;
            }

        } while (true);



    }
}
