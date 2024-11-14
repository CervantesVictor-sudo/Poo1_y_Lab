/**
* p63_SumaTerminos1 - Se desea imprimir la secuencia de términos armónicos del número de renglones que el usuario desee y su suma.
*/

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int n;
        float suma = 0;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Se desea imprimir la secuencia de términos armónicos del número de renglones que el usuario desee y su suma.\n");
        System.out.print("¿Cuántos términos? "); n = obj.nextInt();

        for (int i=1; i<=n; i++){
            float f = 0;
            System.out.print("(1 / ");
            for (int j=1; j<=i; j++){
                f += 1;
            }
            suma = suma + 1 / f;
            System.out.printf("%.0f) %s", f, (i==n ? " " : "+ "));
        }
        System.out.printf("= %.2f\n", suma);
        System.out.println("\nProceso finalizado.");
        obj.close();
    }
}