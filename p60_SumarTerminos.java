/**
 * p60_SumarTerminos - 
 */

import java.util.Scanner;

public class p60_SumarTerminos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Hasta qué número deseas el factorial? "); 
        int n = new Scanner(System.in).nextInt();

        float suma = 0;

        for (int i=1; i<=n; i++){
            float f = 1;
            System.out.print("(1 / ");
            for (int j=1; j<=i; j++){
                f = f * j;
            }
            suma = suma + 1 / f;
            System.out.printf("%.0f) %s", f, (i==n ? " " : "+ "));
        }
        System.out.printf(" = %f", suma);
    }
}