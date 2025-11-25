package org.example;

import java.util.Arrays;

public class Practica2 {

    static void main() {

        int nums[] = {1,2,3,4,5};
        int[] copiaArray;
        copiaArray = nums;
        copiaArray[3] = 0;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(copiaArray));
    }
}
