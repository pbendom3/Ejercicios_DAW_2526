package org.example;

import java.util.Random;

public class Aleatorios {

    static void main() {

        Random aleatorio = new Random();

//        int numero = aleatorio.nextInt(5)+5;
//
//       int numero2 = (int) (Math.random()*10 +1) ;
//
//       double numero3 = aleatorio.nextDouble()*100 + 1;

//        System.out.println(numero3);

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contrasenya = "";

        for (int i=0;i<12;i++){

            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));

        }

        System.out.println(contrasenya);

    }
}
