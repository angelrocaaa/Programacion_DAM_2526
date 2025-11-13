package org.example;

public class BurbujaDescendente {

    static void main() {

        int vector[] = {1,2,3,4,5,6,7,8,9};

        int aux;
        for (int i = vector.length; i > 0; i++) {
            for (int j = vector.length - i - 1; j > 0; j++) {
                //El valor máximo lo más a la derecha posible
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }
}
