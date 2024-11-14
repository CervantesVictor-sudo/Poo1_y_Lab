/**
 * p33_NumerosConsecutivos - Dados tres números enteros, verificar si son consecutivos (9,10,11) y
 * mandar mensaje confirmándolo, si no lo son (1,4,6) mandar mensaje de error.
 */

import java.util.Scanner;

public class p33_NumerosConsecutivos {
        public static void main(String[] args) {
            
            int n1, n2, n3;
            Scanner obj = new Scanner(System.in);

            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Escribe 3 números enteros cualquiera para verificar si son consecutivos o no.\n ");
            System.out.print("\nDame el primer número: "); n1 = obj.nextInt();
            System.out.print("\nDame el segundo número: "); n2 = obj.nextInt();
            System.out.print("\nDame el tercer número: "); n3 = obj.nextInt();

            if (n1+1==n2) {
                if (n2+1==n3) {
                    System.out.println(String.format("Los números %d - %d - %d son números consecutivos.", n1, n2, n3));
                }
                else {
                    System.out.println(String.format("\nERROR : los números %d - %d - %d no son números consecutivos.", n1, n2, n3));
                }
            }
            else {
                System.out.println(String.format("\nERROR : los números %d - %d - %d no son números consecutivos.", n1, n2, n3));
            }

        }
}