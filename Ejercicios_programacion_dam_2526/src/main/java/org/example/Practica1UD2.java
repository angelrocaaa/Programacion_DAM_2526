package org.example;

import java.util.Scanner;

public class Practica1UD2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //Declaramos las variables, las constantes y la fecha de ejemplo que la utilizaremos para compararla con la real
        String ejemplo = "dd/mm/aaaa";
        int dia = 0;
        int mes = 0;
        int anyo = 0;
        final int ANYO_MAX = 2025;
        final int ANYO_MIN = 1900;
        final int MES_MAX = 12;
        final int DIA_MAX = 31;

        //Le preguntamos que introduzca por teclado la fecha de nacimiento y la guardamos en un string
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = teclado.nextLine();

        //Medimos la longitud de la fecha de ejemplo y la fecha que introduce por teclado
        int tamanyo_fecha = fecha.length();
        int tamanyo_ejemplo = ejemplo.length();

        //Si nuestra fecha contiene "-" nos estará indicando que el usuario ha introduce números negativos por pantalla y por eso salta el error
        if (fecha.contains("-")){
            System.out.println("ERROR. No debes introducir valores negativos en la fecha");
        } else {
            //Si en la posicion 2 hay una contrabarra y en la posición 5 hay una contrabarra y el tamaño de la fecha es igual que al del ejemplo entonces hara el if
            if (fecha.substring(2, 3).equals("/") && fecha.substring(5, 6).equals("/") && tamanyo_fecha == tamanyo_ejemplo) {
                String dd = fecha.substring(0, 2);
                String mm = fecha.substring(3, 5);
                String aaaa = fecha.substring(6, 10);

                //Hacemos uso del try catch ya que nos puede saltar un error al ser numeros y entonces tendra que saltar el catch dandonos un error
                try {
                    dia = Integer.parseInt(dd);
                    mes = Integer.parseInt(mm);
                    anyo = Integer.parseInt(aaaa);
                } catch (Exception e) {
                    System.out.println("ERROR. Debes de introducir números");
                }

                //Si el dia es mayor que el DIA_MAX o dia es menor que 1 nos salta el error pero si no pasa a la siguiente condición
                if (dia > DIA_MAX || dia < 1) {
                    System.out.println("ERROR. Los días van desde el 1 hasta el 31");
                } else if (mes > MES_MAX || mes < 1) {
                    System.out.println("ERROR. Los meses van desde el 1 hasta el 12");
                } else if (anyo > ANYO_MAX || anyo < ANYO_MIN) {
                    System.out.println("ERROR. Los anyos van desde el 1900 hasta el 2025");
                } else {
                    //Una vez se haya pasado todas las condiciones y la fecha sea correcta pasamos a calcular el resultado de la suma del dia + mes + año
                    int resultado = dia + mes + anyo;
                    System.out.println(dia + "+" + mes + "+" + anyo + " = " + resultado);

                    //Cogemos el resultado y cada número del resultado lo guardamos
                    String resultado_string = Integer.toString(resultado);
                    String num1 = resultado_string.substring(0, 1);
                    String num2 = resultado_string.substring(1, 2);
                    String num3 = resultado_string.substring(2, 3);
                    String num4 = resultado_string.substring(3, 4);

                    //Pasamos los números recogidos a números enteros y hacemos la suma con esos números para que nos de el número de la suerte
                    int num1_suma = Integer.parseInt(num1);
                    int num2_suma = Integer.parseInt(num2);
                    int num3_suma = Integer.parseInt(num3);
                    int num4_suma = Integer.parseInt(num4);
                    int total_suerte = num1_suma + num2_suma + num3_suma + num4_suma;
                    System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + total_suerte);
                    System.out.println("Tu número de la suerte es " + total_suerte);
                }
                //Si nos falla la condición de arriba donde ponemos el separador nos salta el mensaje
            } else {
                System.out.println("ERROR. Fallo en el formato de la fecha");
            }
        }
    }
}
