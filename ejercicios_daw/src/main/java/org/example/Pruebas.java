package org.example;

import java.util.Arrays;

public class Pruebas {

    static void main() {

        int vector[] = {3,4,1,0,6};

        int aux = 0;

        for (int i = 0; i < vector.length; i++) {

            if (i == vector.length-1){
                vector[0]=vector[i];
            }else{
                aux = vector[i+1];
                vector[i+1]=vector[i];
            }

        }

        System.out.println(Arrays.toString(vector));

    }
}
