package org.example;

import java.util.Scanner;

public class Ejercicio5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double dividendo =0;
        double divisor = 0;
        boolean repetir = true;
        do{
            try{
                System.out.println("Introduce el dividendo...");
                dividendo = teclado.nextDouble();
                System.out.println("Introduce el divisor...");
                divisor = teclado.nextDouble();
                repetir=false;
            }catch(Exception err){
                System.out.println("Introduce un formato correcto");

            }

            if (divisor==0){
                System.out.println("NO SE PUEDEEE");
                repetir = true;
            }else{
                double resultado = dividendo/divisor;
                System.out.println("Resultado: " + resultado);
                repetir=false;
            }

            teclado.nextLine();

        }while(repetir);

        int altura = 0;
        do{
            altura = teclado.nextInt();
        }while(altura<0);





    }
}
