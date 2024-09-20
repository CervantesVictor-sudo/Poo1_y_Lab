/**
 * p77_DiaSemana - Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva
 * el día de la semana con letra. Deberá validar que el número está en el rango adecuado.
 */

import java.util.Scanner;

public class p77_DiaSemana {

    public static int DiaSemana (int dia) {
        switch (dia) {
            case 1: System.out.println("\nEl 1 es: Domingo"); break;
            case 2: System.out.println("\nEl 2 es: Lunes"); break;
            case 3: System.out.println("\nEl 3 es: Martes"); break;
            case 4: System.out.println("\nEl 4 es: Miercoles"); break;
            case 5: System.out.println("\nEl 5 es: Jueves"); break;
            case 6: System.out.println("\nEl 6 es: Viernes"); break;
            case 7: System.out.println("\nEl 7 es: Sabado"); break;
            default:
            System.out.println("\n-ERROR-\nPor favor, ingresa un rango que sea correcto. "); break;
        }
        return dia;
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.println("Dame un número entre 1 y 7 y te dire el día de la semana con letra.\n");
        int dia = new Scanner(System.in).nextInt();
        
        DiaSemana(dia);
    }
}