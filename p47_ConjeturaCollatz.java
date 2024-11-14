/**
 * p47_ConjeturaCollatz - Imprime los números de la conjetura de Colatz.
 */

import java.util.Scanner;

public class p47_ConjeturaCollatz {
    public static void main(String[] args) {
        
        char resp;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime los números de la conjetura de Collatz. \n");
        System.out.print("Dame un número entero: "); int n = new Scanner(System.in).nextInt();

        do {
             do {
                    System.out.printf("%d ", n);
                    if (n % 2 == 0) {
                        n = n / 2;
                    } else 
                        n = n * 3 + 1;
        
                } while (n != 1);
                System.out.printf("%d ", n);
        
            System.out.print("\n¿ Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
            
        } while (resp != 'N');
    }
}
