package org.example;

import java.util.Arrays;
import java.util.Random;

public class Vectores {

    static void main() {

        Random aleatorio = new Random();

        int vector[] = new int[5];

        int vector2[] = new int[5];

        vector2[3]=10;
        vector2[0]=100;

//        vector=vector2;
//
//        vector2[2]=23;

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

        vector = vector2.clone();

        vector2[3]=5;

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));

        System.out.println(vector.length);

        for (int i=vector.length-1; i >= 0 ;i--){
            System.out.println("Numerito: " + vector[i]);
        }

        int numeros[] = new int[8];
        int contador = 0;

        for (int i=0; i< numeros.length;i++){
            numeros[i] = aleatorio.nextInt(501);
            contador += numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("El resultad es " + contador);



    }
}
