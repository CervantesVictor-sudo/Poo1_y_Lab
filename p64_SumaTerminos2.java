/**
* p64_SumaTerminos2 - Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma.
*/

import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma.\n");
        System.out.print("¿Cuántos términos? "); n = obj.nextInt();
    
        String suma = "";
        for (int i=1; i<=n; i++) {
            String toto = "1".repeat(i);
            System.out.printf("%s %s", toto, (i==n ? " " : "+ "));
            suma = suma + Integer.toString(i);
        }
        System.out.print("\nsuma: " + suma);
        obj.close();
    }
}