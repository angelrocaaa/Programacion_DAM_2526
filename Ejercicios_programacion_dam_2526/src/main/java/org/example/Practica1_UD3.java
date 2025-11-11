package org.example;

import java.util.Random;
import java.util.Scanner;

public class Practica1_UD3 {

    static void main() {
<<<<<<< HEAD

        //Teclado y aleatorio
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //Constantes y variables
=======
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
        final int NUM_SAMURAIS = 7;
        final int TOTAL_POTENCIAS = 30;
        int suma = 0;

<<<<<<< HEAD
        //Vectores con el número de samurais que es siete
        int equipo1[] = new int[NUM_SAMURAIS];
        int equipo2[] = new int[NUM_SAMURAIS];

        //Nos pida introducir la potencia mientras se cumpla la condicion
=======
        int equipo1[] = new int[NUM_SAMURAIS];
        int equipo2[] = new int[NUM_SAMURAIS];

>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
        do {
            suma = 0;
            System.out.println("Equipo 1");
            System.out.println("Introduce potencia de los samuráis (7 números separados por espacio):");
            String linea = teclado.nextLine();
            String[] partes = linea.split(" ");

            if (partes.length != NUM_SAMURAIS) {
                System.out.println("ERROR. Debes introducir exactamente 7 números.");
                continue;
            }

<<<<<<< HEAD
            for (int i = 0;i<NUM_SAMURAIS;i++) {
                equipo1[i] = Integer.parseInt(partes[i]);
                suma += equipo1[i];
=======
            int i = 0;
            while (i < NUM_SAMURAIS) {
                equipo1[i] = Integer.parseInt(partes[i]);
                suma += equipo1[i];
                i++;
>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
            }

            if (suma != TOTAL_POTENCIAS) {
                System.out.println("ERROR. La potencia total no suma 30.");
            }

        } while (suma != TOTAL_POTENCIAS);
        System.out.println("Equipo completado.");

<<<<<<< HEAD
        //Nos pida introducir la potencia mientras se cumpla la condicion
=======
>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
        do {
            suma = 0;
            System.out.println("Equipo 2");
            System.out.println("Introduce potencia de los samuráis (7 números separados por espacio):");
            String linea = teclado.nextLine();
            String[] partes = linea.trim().split(" ");

            if (partes.length != NUM_SAMURAIS) {
                System.out.println("ERROR. Debes introducir exactamente 7 números.");
                continue;
            }

<<<<<<< HEAD
            for (int i = 0;i<NUM_SAMURAIS;i++) {
                equipo2[i] = Integer.parseInt(partes[i]);
                suma += equipo2[i];
=======
            int i = 0;
            while (i < NUM_SAMURAIS) {
                equipo2[i] = Integer.parseInt(partes[i]);
                suma += equipo2[i];
                i++;
>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
            }

            if (suma != TOTAL_POTENCIAS) {
                System.out.println("ERROR. La potencia total no suma 30.");
            }

        } while (suma != TOTAL_POTENCIAS);
        System.out.println("Equipo completado.");

<<<<<<< HEAD
        //Un aleatorio para los numeros de las potencias
=======
>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
        System.out.println("¡Empieza la batalla!");
        int turno = aleatorio.nextInt(NUM_SAMURAIS);
        System.out.println("La batalla inicia con el Samurai " + (turno + 1));

<<<<<<< HEAD
        //Declaramos las bajas de cada equipo
        int bajas_equipo1 = 0;
        int bajas_equipo2 = 0;

        //Mientras que la baja sea menor que el numero de samurais dividido entre 2 por cada equipo empiezan a batallar
=======
        int bajas_equipo1 = 0;
        int bajas_equipo2 = 0;

>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
        while (bajas_equipo1 <= NUM_SAMURAIS / 2 && bajas_equipo2 <= NUM_SAMURAIS / 2) {
            int potencia_equipo1 = equipo1[turno];
            int potencia_equipo2 = equipo2[turno];

            if (potencia_equipo1 > potencia_equipo2) {
                System.out.println("Samurai " + (turno + 1) + ". Gana Equipo 1. " + potencia_equipo1 + " vs " + potencia_equipo2);
                equipo2[turno] = 0;
                bajas_equipo2++;
            } else if (potencia_equipo2 > potencia_equipo1) {
                System.out.println("Samurai " + (turno + 1) + ". Gana Equipo 2. " + potencia_equipo1 + " vs " + potencia_equipo2);
                equipo1[turno] = 0;
                bajas_equipo1++;
            } else {
                System.out.println("Samurai " + (turno + 1) + ". Empate. Mueren ambos (" + potencia_equipo1 + " vs " + potencia_equipo2 + ")");
                equipo1[turno] = 0;
                equipo2[turno] = 0;
                bajas_equipo1++;
                bajas_equipo2++;
            }

            turno++;
            if (turno == NUM_SAMURAIS) {
                turno = 0;
            }
        }

<<<<<<< HEAD
        //El número de bajas que sea mayor es el que habrá ganado
=======
>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
        if (bajas_equipo1 > NUM_SAMURAIS / 2 && bajas_equipo2 > NUM_SAMURAIS / 2) {
            System.out.println("¡Empate! Ambos equipos han perdido más de la mitad de sus samuráis.");
        } else if (bajas_equipo1 > NUM_SAMURAIS / 2) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajas_equipo1 + " bajas.");
        } else {
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajas_equipo2 + " bajas.");
        }
    }
<<<<<<< HEAD
}
=======
}

>>>>>>> 1ab06d1db768e9c1084b32978f3eb73a30c17046
