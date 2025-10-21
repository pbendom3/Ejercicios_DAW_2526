package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Correc {

    static void main() {

        int cantidad = 1;

        System.out.println("La letra A ha aparecido " + cantidad + " " +(cantidad == 1 ? "vez" : "veces"));


        int a = 1, b = 2, c = 3;

        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println(resultado);

        a = 1;
        b = 2;
        c = 3;
        resultado = 0;
        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;
        System.out.println(resultado);

        a = 1;
        b = 2;
        c = 3;
        resultado = 0;
        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        b == c ? a++ : a--;
        System.out.println(resultado);

    }
}
