package org.example;

import java.util.Scanner;

public class Bucle3 {

    static void main() {

        for (int i=1;i<=50;i++) {

            if (i % 3 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
