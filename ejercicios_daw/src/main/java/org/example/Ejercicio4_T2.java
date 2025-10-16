package org.example;

public class Ejercicio4_T2 {
    static void main() {

        String texto = "Hola Mundo, Mundo bienvenido a Mundo. Mundo mundo es genial.";
        String palabra = "Mundo";

        texto = texto.toUpperCase();
        palabra = palabra.toUpperCase();

        int tamanyo_texto = texto.length();
//        boolean esta = texto.contains("Albaricoque");
//        System.out.println(esta);
        texto = texto.replace(palabra,"");
        int tamanyo_texto_nuevo = texto.length();

        int veces = (tamanyo_texto-tamanyo_texto_nuevo)/palabra.length();
        System.out.println(veces);






    }
}
