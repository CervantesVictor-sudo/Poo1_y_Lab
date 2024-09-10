/**
 * p58_Piramide - Imprimir una piramide de n renglones del caracter deseado.
 */

import java.util.Scanner;

public class p58_Piramide {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("De cuántos renglones lo quieres   ? "); int r = obj.nextInt();
        System.out.print("Qué caracter quieres              ? "); char c = obj.next().charAt(0);

        for (int i=1; i<=r; i++) {
            for (int j=1; j<=i; j++)
                System.out.print(c);
            
            System.out.println();
        }
        obj.close();

    }
}