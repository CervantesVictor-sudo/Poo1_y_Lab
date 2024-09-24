/**
 * p88_Aleatorios - Genera números aleatorios 
 */

import java.util.Random;

public class p88_Aleatorios {

    public static void main(String[] args) {
        Random rnd = new Random();
        int a1 = rnd.nextInt();                     // Genera un número aleatorio en el rango de los números enteros
        int a2 = rnd.nextInt(30)+1;                 // Genera un número aleatorio en el rango de 1 a 30.
        int min = 50, max = 60;
        int a3 = rnd.nextInt(max - min + 1) + min;  // Genera un número aleatorio en el rango de 50 a 60.

        System.out.print("\033[H\033[2J");
        System.out.println("Número entero aleatorio positivo: " + Math.abs(a1));
        System.out.println("Número entero aleatorio 1..30   : " + Math.abs(a2));
        System.out.println("Número entero aleatorio 50..60   : " + Math.abs(a3));
    }
}