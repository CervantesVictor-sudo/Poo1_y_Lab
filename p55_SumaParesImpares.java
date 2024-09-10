/**
 * p55_SumaParesImpares - Imprime pares de 1 a n, pares de n a 1 y la suma de amboos casos.
 */

import java.util.Scanner;

public class p55_SumaParesImpares {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, s = 0;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime pares de 1 a n, pares de n a 1 y la suma de amboos casos.");
        System.out.println("Números de 1 a n - impares .... [ 1 ]");
        System.out.println("Números de n a 1 - pares   .... [ 2 ]");
        System.out.println("Salir   ....................... [ 3 ]");
        System.out.print("Elije: "); int op = obj.nextInt();

        switch (op) {
            case 1:
                System.out.println("Imprimiendo de 1 a n ...");
                System.out.print("Hasta donde ? "); n = obj.nextInt();
                for ( int i=1; i<=n; i+=2){
                    System.out.print(i + " ");
                    s += i;
                }
                System.out.println("\nLa suma de impares es: " + s);
                break;

            case 2:
                System.out.println("Imprimiendo de n a 1 ...");
                System.out.print("Desde donde ? "); n = obj.nextInt();
                n = (n%2==0 ? n : --n);
                for ( int i=n; i>=1; i-=2){
                    System.out.print(i + " ");
                    s += i;
                }
                System.out.println("\nLa suma de pares es: " + s);
                break;

            case 3:
                System.out.println("\nHaz decidido salir del sistema.\n");
                break;

            default:
                System.out.println("\nOpción inválida."); break;
        }
        System.out.println("\nEl proceso ha terminado.");
        obj.close();
    }
}