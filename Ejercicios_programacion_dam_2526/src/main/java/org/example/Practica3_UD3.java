package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3_UD3 {

    static void main() {

        //Declaramos el teclado para que podamos escribir por pantalla y declaramos variables y constantes
        Scanner teclado = new Scanner(System.in);

        final int MAXIMO = 48;
        int ancho = 0;
        int alto = 0;
        int contador = 0;
        String letra1 = "";
        String letra2 = "";

        //Mostramos por pantalla el nombre del validador y hacemos la pregunta para que introduzca el ancho y alto
        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        //Hacemos un bucle do while para que al menos nos lo pregunte una vez y si no se cumple la condicion que nos pide lo volvera a preguntar asi hasta que se cumpla la condicion
        do {
            System.out.println("Ancho:");
            ancho = teclado.nextInt();
            System.out.println("Alto:");
            alto = teclado.nextInt();
        } while (ancho % 8 != 0 || alto % 8 != 0 || ancho > MAXIMO || alto > MAXIMO);

        //Creamos la matriz con el alto y el ancho introducido por el usuario por teclado
        String matriz[][] = new String[alto][ancho];

        System.out.println("Introduce línea a línea) los colores de tu imagen para cada píxel:");

        //Rellenamos la matriz de letras con ninguna separacion y recorremos cada fila para ver si se cumple el matches, sino lo hace le restara una a i para que esa fila se elimine y salto un mensaje de error pero el bucle sigue su ejecución
        for (int i = 0; i < matriz.length; i++) {
            String fila[] = teclado.next().split("");
            matriz[i] = fila;
            for (String letra : fila) {
                if (!letra.matches("[A-O]")) {
                    System.out.println("Has introducido un valor de píxel incorrecto (A-O)");
                    i--;
                }
            }
        }

        //Imprimimos por pantalla la matriz cada numero con un espacio de separacion
        for (String fila[] : matriz) {
            for (String num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //Recorremos la matriz y vemos si hay mas de dos numeros gracias al contador si hay mas de dos numeros no sera compatible no he hecho lo de que vaya sumando 8 porque no he sabido hacerlo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String pixel = matriz[i][j];

                if (letra1 == "") {
                    letra1 = pixel;
                    contador = 1;
                } else if (pixel != letra1 && letra2 == "") {
                    letra2 = pixel;
                    contador = 2;
                } else if (pixel != letra1 && pixel != letra2) {
                    contador = 3;
                }
            }
        }

        if (contador<=2) {
            System.out.println("Es compatible con un ZX Spectrum");
        } else {
            System.out.println("No es compatible con un ZX Spectrum");
        }
    }
}
