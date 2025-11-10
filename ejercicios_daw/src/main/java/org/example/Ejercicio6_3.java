package org.example;

public class Ejercicio6_3 {

    static void main() {

        int vector[] = {1,2,3,2,1};

        boolean es_o_no = true;
        for (int i=0;i< vector.length;i++){

            if (vector[i]!=vector[vector.length-1-i]){
                System.out.println("No es");
                es_o_no=false;
                break;
            }

        }

        if (es_o_no) System.out.println("Es palíndromo");





    }
}
