package org.example;

public class StringsTema2 {

    static void main() {

        String frase = "Al palo Juanfran del Atleti palo";

        int tamanyo = frase.length();
        System.out.println(tamanyo);

        System.out.println(frase.charAt(8));

        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo", 10);
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        String base_datos = "Raúl                           ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        boolean igual = base_datos.equals("Manolo");
        System.out.println(igual);

        boolean igual2 = base_datos.trim().equals("Raúl");
        System.out.println(igual);

        boolean igual_sin_mayusculas = "Raúl".equalsIgnoreCase("raúl");
        System.out.println(igual_sin_mayusculas);

        String frase_reemplazos = frase.replace("palo", "Florentino");
        System.out.println(frase_reemplazos);

        int numero = 1;
        char caracter = 'A';
        String palabra = "Angel";

        switch (palabra) {
            case "Raúl":
                System.out.println("El alumno Raúl");
                break;
            case "Angel":
                System.out.println("El alumno Ángel");
                break;
            default:
                System.out.println("No conozco ese nombre");
                break;
        }

        switch (numero) {
            case 1:
                System.out.println("El alumno Raúl");
                break;
            case 2:
                System.out.println("El alumno Ángel");
                break;
            default:
                System.out.println("No conozco ese nombre");
                break;
        }

        switch (caracter) {
            case 'x':
                System.out.println("El alumno Raúl");
                break;
            case 'A':
                System.out.println("El alumno Ángel");
                break;
            default:
                System.out.println("No conozco ese nombre");
                break;
        }



    }
}
