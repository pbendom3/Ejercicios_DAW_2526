package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número...");
        int numero = teclado.nextInt();

        if (numero>0){
            System.out.println("El número " + numero + " es POSITIVO");
        }else{
            if (numero<0){
                System.out.println("El número " + numero + " es NEGATIVO");
            }else{
                System.out.println("El número " + numero + " es NATURAL");
            }
        }

//        if (numero>0){
//            System.out.println("El número " + numero + " es POSITIVO");
//        } else if (numero<0){
//                System.out.println("El número " + numero + " es NEGATIVO");
//        }else{
//            System.out.println("El número " + numero + " es NATURAL");
//        }

    }
}
