package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1_bateria_matrices {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] =  new int[3][3];

        System.out.println("Introduce los valores de la matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("Número a buscar: ");
        int numero = teclado.nextInt();

        matriz:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==numero){
                    System.out.println("El número " + numero + " está en la posición (" + i + "," + j + ").");
                    break matriz;
                }
            }
        }






    }
}
