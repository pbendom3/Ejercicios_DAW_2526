package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        final int JORNADA_SIN_EXTRAS = 40;
        final double PLUS_TARIFA_EXTRA = 1.5;

        System.out.println("Introduce las horas trabajadas: ");
        int horas = teclado.nextInt();

        System.out.println("Tarifa a aplicar: ");
        double tarifa = teclado.nextDouble();

        if (horas>JORNADA_SIN_EXTRAS){ //si

            double extras = horas - JORNADA_SIN_EXTRAS;
            double tarifa_extra = tarifa * PLUS_TARIFA_EXTRA;
            double salario_extra = extras*tarifa_extra;

            System.out.println("Salario (con extra): " + (salario_extra + (JORNADA_SIN_EXTRAS*tarifa)) + "€");

        }else{ //sino

            double salario = horas * tarifa;
            System.out.println("Salario: " +  salario + "€");
        }

    }
}
