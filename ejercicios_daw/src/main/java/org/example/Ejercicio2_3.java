package org.example;

import java.util.Arrays;

public class Ejercicio2_3 {

    static void main() {

        int vector[] = {3,4,2,5,6,7};
        int aux = 0;

        for (int i=0;i<vector.length/2;i++){

            aux = vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }

        System.out.println(Arrays.toString(vector));

    }
}
