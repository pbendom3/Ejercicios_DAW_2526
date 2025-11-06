package org.example;

import java.util.Arrays;

public class Ejercicio4_3 {

    static void main() {

        int vector[] = {3,4,6,5,2};

        int nuevo[] = new int[vector.length-1];

        int posicion_borrar = 3;

        for (int i=0;i<nuevo.length;i++){

            if (i>=posicion_borrar){
                nuevo[i]=vector[i+1];
            }else{
                nuevo[i]=vector[i];
            }

        }

        System.out.println(Arrays.toString(nuevo));





    }
}
