package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int vector[] = new int [aleatorio.nextInt(31)+10];
        int matriz[][] = new int[3][3];


        for (int i = 0; i< vector.length; i++) {
            vector[i]=aleatorio.nextInt(90)+1;
        }

        boolean comprobar = true;

        while (comprobar) {
            comprobar = false;
            for (int i=0;i< vector.length;i++) {
                Arrays.sort(vector);
                if (i!= vector.length-1 && vector[i]==vector[i+1]) {
                    vector[i] = aleatorio.nextInt(90)+1;
                    comprobar = true;
                }
            }
        }

        System.out.println("*** BIENVENIDO AL BINGO DEL CASINO CANTÁBRICO ***");

        System.out.println(vector.length + " bolas extraídas hasta ahora: " + Arrays.toString(vector));

        System.out.println("*** Introduce los datos de tu cartón ***");

        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Fila " + (i+1));
            String entrada = teclado.next();

            if (!entrada.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")) {
                System.out.println("Cerrando programa... Introduce valores con el formato correcto (N-N-N)");
                return;
            }

            String partes[] = entrada.split("-");

            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(partes[j]);
            }
        }

        System.out.println("Datos del carton introducido:");

        for (int fila[] : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("PREMIOS:");

        int contador_bingo = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int bola : vector) {
                    if (matriz[i][j] == bola) {
                        contador_bingo++;
                        break;
                    }
                }
            }
        }

        if (contador_bingo == 9) {
            System.out.println("¡¡BINGO CORRECTO!!");
        } else {
            System.out.println("No hay BINGO.");
            for (int i = 0; i < matriz.length; i++) {
                int contador_linea = 0;
                for (int j = 0; j < matriz[i].length; j++) {
                    for (int bola : vector) {
                        if (matriz[i][j] == bola) {
                            contador_linea++;
                            break;
                        }
                    }
                }

                if (contador_linea == 3) {
                    System.out.println("Línea " + (i + 1) + ": CORRECTA!!");
                } else {
                    System.out.println("Línea " + (i + 1) + ": NO");
                }
            }
        }



    }
}
