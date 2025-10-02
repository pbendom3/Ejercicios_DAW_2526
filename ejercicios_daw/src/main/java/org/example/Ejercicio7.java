package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hay jamón? (S/N)");
        char jamon = teclado.next().charAt(0);

        System.out.println("¿Hay aceite? (S/N)");
        char aceite = teclado.next().charAt(0);

        System.out.println("¿Hay tomate? (S/N)");
        char tomate = teclado.next().charAt(0);

        if (aceite=='S' && jamon=='S' && tomate=='S'){
            System.out.println("No vamos");
        }else{
            System.out.println("Vamos");
        }

        if (aceite=='N' || jamon=='N' || tomate=='N'){
            System.out.println("Vamos");
        }else{
            System.out.println("No vamos");
        }


    }
}
