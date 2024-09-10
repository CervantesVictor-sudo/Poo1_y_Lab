/**
 * p49_ParesDescendente - Imprimir solo números pares de forma descendiente empezando por el número que el usuario establesca hasta el 0.
 */

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char resp;
        int con1, n, s, con2;
        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.println("Imprime pares de forma descendente de 100 hasta n\n");
            System.out.print("Hasta donde deseas los pares? "); n = obj.nextInt();
            con2 = 0; con1 = 100; n = s = 0;
            while (con1 >= n){
                System.out.printf("%d ", con1);
                con2 ++;
                s += con1;
                con1 -= 2;
            }
            System.out.printf("\nLa suma de los números pares hasta %d es %d, y su promedio es %d", n, s, s/con2);
            System.out.printf("\n¿ Quieres hacerlo otra vez (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));
            
        } while (resp != 'N');
        System.out.println("\nProceso Terminado.");
    }
}