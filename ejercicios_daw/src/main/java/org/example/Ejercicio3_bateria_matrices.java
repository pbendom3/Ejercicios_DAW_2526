package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3_bateria_matrices {

    static void main() {

        Scanner teclado =  new Scanner(System.in);

        System.out.println("¿cuántos estudiantes tienes?: ");
        int estudiantes = teclado.nextInt();
        System.out.println("¿cuántas asignaturas cursan?:");
        int asignaturas = teclado.nextInt();

        String notas[][] = new String[estudiantes+1][asignaturas+1];

        notas[0][0] =  "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("introduce el alumno " + i + ":");
            notas[i][0]=teclado.next();
        }

        for (int i = 1; i < notas[0].length; i++) {
            System.out.println("Introduce la asignatura " + i + ":");
            notas[0][i] = teclado.next();
        }

        for (int i = 1; i < notas.length; i++) {
            for (int j = 1; j < notas[i].length; j++) {
                System.out.println("Inserta la nota para " + notas[i][0] + " en la asignatura de " + notas[0][j]);
                notas[i][j] = teclado.next();
            }
        }

        for (String fila[] : notas){
            System.out.println(Arrays.toString(fila));
        }

        int suma_notas = 0;
        for (int i = 1; i < notas.length; i++) {
            suma_notas = 0;
            for (int j = 1; j < notas[i].length; j++) {
                suma_notas += Integer.parseInt(notas[i][j]);
            }
            System.out.println("La media de " + notas[i][0] + " es " + (double) (suma_notas/asignaturas));
        }

        for (int i = 1; i < notas[0].length; i++) {
            suma_notas = 0;
            for (int j = 1; j < notas.length; j++) {
                suma_notas += Integer.parseInt(notas[j][i]);
            }
            System.out.println("La media de " + notas[0][i] + " es " + (double) (suma_notas/estudiantes));
        }








    }
}
