package org.example;

public class Traza2UD3 {

    static void main() {
        bucle1:
        for (int i = 5; i >= 1; i--) {
            bucle2:
            for (int j = 1; j <= i ; j++) {
                if (i == 3 && j ==3) {
                    break bucle1;
                }
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
