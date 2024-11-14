/**
 * p48_ImparesAscendente - Imprimir solo números impares de forma ascendente empezando por el 1 hasta el número que el usuario establesca.
 */

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        char resp;
        int con,num,suma;
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Imprime impares de forma ascendente de 1 hasta cualquier número.\n");
            System.out.print("¿Hasta donde deseas los números impares? "); num = obj.nextInt();
            con=1; num=suma=0;
            while (con <= num) {
                System.out.printf("%d ", c);
                suma +=con;
                con +=2;
            }
            System.out.printf("\nLa suma de los números impares hasta %d es %d ", num, suma);
            System.out.print("\n¿ Quieres hacerlo otra vez (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        System.out.println("\nProceso terminado.");
    }
}