// p21_VerificaNumero - Verifica si cualquier número ingresado es positivo, negativo o 0.

import java.util.Scanner;

public class p21_VerificaNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        int n;
        System.out.println("Verfica si un número es postivo, negativo o cero.\n");
        System.out.print("Dame cualquier número: ");
        n = new Scanner(System.in).nextInt();

            if ( n>0 ) {
                System.out.println("El número es POSITIVO");
            }

            if ( n<0 ) {
                System.out.println("El número es NEGATIVO");
            }

            if ( n==0 ) {
                System.out.println("El número es CERO");
            }
        System.out.println("\nGracias por utilizar este programa\n");
    }
}
