package org.example;

public class CosasSwitch {

    static void main() {

        char dia_de_la_semana = 'D';

        switch (dia_de_la_semana){

            case 'L':
            case 'M':
            case 'X':
            case 'J':
            case 'V':
                System.out.println("ENTRE SEMANA");
                break;
            case 'S':
            case 'D':
                System.out.print("FIN DE SEMANA \n HOLA \n");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }

    }
}
