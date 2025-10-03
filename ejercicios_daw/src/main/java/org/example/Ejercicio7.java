package org.example;

import java.util.Scanner;

public class Ejercicio7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hay jamón? (S/N)"); //pregunto al usuario si hay jamón
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

        //miro si tengo todos los ingredientes
        if (aceite=='N' || jamon=='N' || tomate=='N'){
            System.out.println("Vamos"); //si los tengo, no voy a comprar
        }else{
            System.out.println("No vamos");
        }


    }
}
