/**
 * p34_NumeroMayor - Dados tres números enteros, verificar cual es el mayor.
 */

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Escribe 3 números enteros y se te mostrará cual es el mayor.\n ");
        System.out.print("\nDame el primer número: "); n1 = obj.nextInt();
        System.out.print("\nDame el segundo número: "); n2 = obj.nextInt();
        System.out.print("\nDame el tercer número: "); n3 = obj.nextInt();

        if (n1>n2 && n1>n3) {
            System.out.println(String.format("\nDe los números %d - %d - %d el número mayor es el: %d ", n1, n2, n3, n1));
        }
        if (n2>n1 && n2>n3) {
            System.out.println(String.format("\nDe los números %d - %d - %d el número mayor es el: %d ", n1, n2, n3, n2));
        }
        if (n3>n1 && n3>n2) {
            System.out.println(String.format("\nDe los números %d - %d - %d el número mayor es el: %d ", n1, n2, n3, n3));
        }
    }
}