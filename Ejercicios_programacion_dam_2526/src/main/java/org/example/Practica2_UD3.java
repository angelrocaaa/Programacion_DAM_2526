package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2_UD3 {

    static void main() {

        // Scanner para introducir por teclado cuando nos lo pida y el random para hacer aleatorios
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce los datos de tu boleto:");
        String boleto = teclado.nextLine();

        // Validación del formato de los números de la primitiva con el matches
        if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
            System.out.println("ERROR. El formato introducido es incorrecto.");
            return;
        }

        // Los separadores que utilizaremos que son - y /
        String vector[] = boleto.split("[-/]");
        int numeros_jugador[] = new int[6];

        for (int i = 0; i < 6; i++) {
            numeros_jugador[i] = Integer.parseInt(vector[i]);
        }

        int reintegroUsuario = Integer.parseInt(vector[6]);

        int sorteo[] = new int[6];
        boolean numeros_repetidos = true;

        // Con el while hacemos que se repita mientras que haya repetidos
        while (numeros_repetidos) {
            for (int i = 0; i < 6; i++) {
                sorteo[i] = aleatorio.nextInt(49) + 1;
            }

            // Ordenamos los numeros del sorteo
            Arrays.sort(sorteo);

            // Comprobamos si hay repetidos
            numeros_repetidos = false;
            for (int i = 0; i < 5; i++) {
                if (sorteo[i] == sorteo[i + 1]) {
                    numeros_repetidos = true;
                }
            }
        }

        int complementario = aleatorio.nextInt(49) + 1;

        // Si el complementario es número repetido del sorteo entonces le pedimos que nos vuelve a calcular otro numero con el aleatorio
        boolean repetido = true;
        while (repetido) {
            repetido = false;

            for (int i = 0; i < 6; i++) {
                if (complementario == sorteo[i]) {
                    repetido = true;
                    complementario = aleatorio.nextInt(49) + 1;
                }
            }
        }

        int reintegro = aleatorio.nextInt(10); // 0–9

        System.out.println("SORTEO:");
        System.out.println(Arrays.toString(sorteo));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegro);

        int aciertos = 0;
        int acierto_complementario = 0;
        int acierto_reintegro = 0;

        // Contamos todos los aciertos que tenga el jugador
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numeros_jugador[i] == sorteo[j]) {
                    aciertos++;
                }
            }
        }

        // Miramos si el complementario ha sido acertado por el jugador
        for (int i = 0; i < 6; i++) {
            if (numeros_jugador[i] == complementario) {
                acierto_complementario = 1;
            }
        }

        // Miramos si el reintegro ha sido acertado por el jugador
        if (reintegroUsuario == reintegro) {
            acierto_reintegro = 1;
        }

        String categoria;

        if (aciertos == 6 && acierto_reintegro == 1) {
            categoria = "Categoría Especial";
        }
        else if (aciertos == 6) {
            categoria = "1ª Categoría";
        }
        else if (aciertos == 5 && acierto_complementario == 1) {
            categoria = "2ª Categoría";
        }
        else if (aciertos == 5) {
            categoria = "3ª Categoría";
        }
        else if (aciertos == 4) {
            categoria = "4ª Categoría";
        }
        else if (aciertos == 3) {
            categoria = "5ª Categoría";
        }
        else if (acierto_reintegro == 1) {
            categoria = "Reintegro";
        }
        else {
            categoria = "No premiado";
        }
        System.out.println("RESULTADOS:");
        System.out.println(aciertos + " acierto");

        if (acierto_reintegro == 1) {
            System.out.println("Reintegro.");
        }

        System.out.println("Tu resultado: " + categoria);
    }
}
