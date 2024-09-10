/**
 * p51_SerieFibonaci - Se desean imprimir los primeros n números de la serie de Fibonacci.
 */

import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char  resp;
        int x, y, z, i, Max;

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("¿Número de términos que deseas imprimir? "); Max = obj.nextInt();
            x = 0; y = 1; i = 0;
            System.out.printf("\nLos primeros %d términos de la sucesión Fibonacci son: \n", Max);
            while ( i < Max) {
            i++;
                System.out.print( x + " " );
                z = x + y;
                x = y;
                y = z;
            }
            System.out.print("\n¿ Quieres hacerlo otra vez (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        System.out.println("\nProceso Terminado.");
    }
}