package org.example;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Fakejack {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("**** BIENVENIDO AL FAKEJACK ****");

        int numero_banco = aleatorio.nextInt(5)+17;
// aleatorio.nextInt(max - min + 1) + min
//numero_banco = aleatorio.nextInt(21-17+1)+17;

        System.out.println(numero_banco);

        int puntuacion = 0;
        int numero_jugador = 0;
        String opcion = "s";

        do {

            numero_jugador = aleatorio.nextInt(10)+2;
            puntuacion+=numero_jugador;

            System.out.println("Tu carta es: " + numero_jugador);
            System.out.println("Puntuación actual: " + puntuacion);

            System.out.println("-------------------------------");

            if (puntuacion > 21){
                System.out.println("TE HAS PASADO. LA BANCA GANA!!");
                break;
            }

            System.out.println("¿Quieres otra? (S/N)");

            opcion = teclado.next();

            if (opcion.toLowerCase().equals("n")){
                break;
            }

        }while(true);

        if (opcion.toLowerCase().equals("n")){

            if (puntuacion > numero_banco){
                System.out.println("HAS GANADO!");
            } else if (puntuacion < numero_banco) {
                System.out.println("HAS PERDIDO! GANA LA BANCA");
            }else{
                System.out.println("EMPATE");
            }

            System.out.println("Puntos jugador: " + puntuacion);
            System.out.println("Puntos banca: " + numero_banco);

        }



    }
}
