/**
 * p69_TablaMultiplicar - Imprime una tabla de multiplicar que el usuario quiera hasta donde él quiera.
 */

import java.util.Scanner;

public class p69_TablaMultiplicar {

    public static void Tabla (int tabla, int limite){
        for (int i=1; i<=limite; i++) {
            System.out.printf("%d x %d = %d\n", tabla, i, tabla * i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");   
        Scanner obj = new Scanner(System.in);

        System.out.print("¿ Que tabla de multiplicar deseas ? "); int tabla = obj.nextInt();
        System.out.print("¿ Hasta donde la quieres ? "); int limite = obj.nextInt();

        Tabla(tabla, limite);

        obj.close();
    }
}