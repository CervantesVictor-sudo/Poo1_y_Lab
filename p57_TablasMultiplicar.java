/**
 * p57_TablasMultiplicar - Imprimir las tablas del 1 al 1o hasta el 10.
 */

import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main (String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean repite = true;

        while (repite) {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Qué tabla de multiplicar quieres? "); int n = obj.nextInt(); 
            System.out.print("Hasta donde la quieres? "); int m = obj.nextInt(); 
    
            for (int i = 1; i<=n; i++) {
                System.out.println("Tabla del: " + i);
                for (int j = 1; j<=m; j++){
                    System.out.println(i + " x " + j + " = " + i*j);
                }
                System.out.println();
            }
            System.out.print("¿Deseas intentarlo otra vez? (S/N) ");
            String resp = obj.next().toUpperCase();
            repite = resp.equals("S");
        }
        System.out.print("\nProceso terminado.");
        obj.close();

    }
}