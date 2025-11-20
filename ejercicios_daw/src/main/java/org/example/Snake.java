package org.example;

import java.util.Scanner;

public class Snake {

    static void main() {

        String matriz[][] = new String[10][20];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "-";
            }
        }

        matriz[0][0] = "*";

        int i = 0;
        int j=0;

        while (true){

            for (String fila[] : matriz){
                for (String casilla : fila) {
                    System.out.print(casilla);
                }
                System.out.println();
            }

            switch(teclado.next().charAt(0)){

                case 'w':
                    i--;
                    break;
                case 'a':
                    j--;
                    break;
                case 's':
                    i++;
                    break;
                case 'd':
                    j++;
                    break;
            }

            matriz[i][j] = "*";

        }

    }
}
