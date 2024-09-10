/**
* p61_SecuenciaNumeros1 - Se desea imprimir la secuencia de números 
* mostrados el número de renglones que el usuario desee.
*/

import java.util.Scanner;

public class p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Se desea imprimir una secuencia de números en forma de piramide.");
        System.out.print("\n¿ De cuántos renglones lo quieres   ? ");
        int r = obj.nextInt();
        int c = 1;
 
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=i; j++)
                System.out.print(c);
                c += 1;
             
            System.out.println();
        }
        System.out.println("\nProceso finalizado.");
        obj.close();
    }
}