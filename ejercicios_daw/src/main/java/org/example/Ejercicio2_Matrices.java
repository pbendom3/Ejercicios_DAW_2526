package org.example;

import java.util.Arrays;

public class Ejercicio2_Matrices {

    static void main() {

        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{4,1,7},{2,10,2},{20,0,91}};

        int m[][] = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > b[i][j]){
                    m[i][j] = a[i][j];
                }else{
                    m[i][j] = b[i][j];
                }
            }
        }

        for (int fila[] : m){
            System.out.println(Arrays.toString(fila));
        }


    }
}
