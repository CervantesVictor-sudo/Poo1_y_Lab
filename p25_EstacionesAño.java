// p25_EstacionesAño - Manda un mensaje en base al número de estación del año.

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("\nDame un número entre el 1 y el 4, y te diré qué estación del año es: \n");
        int n = new Scanner(System.in).nextInt();

        if (n>=1 && n<=4) {
            System.out.println("\nChido\n");
            if (n==1) System.out.println("El 1 es: Primavera");
            if (n==2) System.out.println("El 2 es: Verano");
            if (n==3) System.out.println("El 3 es: Otoño");
            if (n==4) System.out.println("El 4 es: Invierno");

        } else
            System.out.println("Vuelve a intentarlo, el número es incorrecto.");

    }
    
}
