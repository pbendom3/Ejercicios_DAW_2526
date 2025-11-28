package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Olivas {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("**** OLIVÓMETRO ****");

        int ancho;
        int largo;

        do {
            try {
                System.out.println("Tamaño de la plantación...");
                System.out.println("Ancho: ");
                ancho = teclado.nextInt();
                System.out.println("Largo: ");
                largo = teclado.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Introduce números");
                teclado.nextLine();
            }
        }while(true);

        int bancal[][] =  new int[largo][ancho];

        teclado.nextLine();

        bancal:
        for (int i = 0; i < bancal.length; i++) {

            String fila[] = teclado.nextLine().split(" ");

            if (fila.length == bancal[i].length){
                for (int j = 0; j < bancal[i].length; j++) {
                    if (fila[j].matches("[\\d]{1,2}")){
                        if (Integer.parseInt(fila[j]) < 1 || Integer.parseInt(fila[j]) > 50 ){
                            System.out.println("Introduce valores válidos 1-50)");
                            i--;
                            continue bancal;
                        }else{
                            bancal[i][j] = Integer.parseInt(fila[j]);
                        }
                    }else{
                        System.out.println("Introduce números");
                        i--;
                        continue bancal;
                    }
                }
            }else{
                System.out.println("El formato no es correcto");
                i--;
            }
        }

        for (int fila[] : bancal){
            System.out.println(Arrays.toString(fila));
        }

    }
}
