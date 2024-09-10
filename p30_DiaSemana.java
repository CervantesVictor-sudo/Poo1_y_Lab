/**
 * p30_DiaSemana - Dado un número entero entre 1 y 7, nos muestra el día de la semana con el letra.
 */

import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame un número entre 1 y 7 y te dire el día de la semana con letra.\n");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miercoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sabado"); break;
            default:
            System.out.println("Aver .. quieres salir temprano o no ?"); break;
        }
        System.out.println("\nTe estas ganando tus chilaquiles.");
    }
}