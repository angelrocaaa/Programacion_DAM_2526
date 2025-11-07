package org.example;

import java.util.Random;
import java.util.Scanner;

public class Practica1_UD3 {

    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        final int NUMERO_EQUIPOS = 2;
        final int TOTAL_POTENCIAS = 30;
        int suma_potencias = 0;
        String potencia = "";
        int contador = 1;

        int vector_final[] = new int[7];

        for (int i = 1;i<NUMERO_EQUIPOS ; i++) {
            System.out.println("Equipo " + contador);
            System.out.println("Introduce potencia de los samurais: ");
            potencia = teclado.nextLine();
            String vector[] = potencia.split(" ");
            vector_final[i] = Integer.parseInt(vector[i]);
            suma_potencias += vector_final[i];
            if (suma_potencias == TOTAL_POTENCIAS) {
                System.out.println("Equipo completado");
                contador++;
                continue;
            } else {
                System.out.println("ERROR. La potencia total no suma 30.");
                continue;
            }

        }
    }

}
