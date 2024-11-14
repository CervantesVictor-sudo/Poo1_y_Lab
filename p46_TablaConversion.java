/**
 * p46_TablaConversion - Imprime tabla de conversión de peso a dólar en un rango determinado.
 */

import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args) {
        
        int ini, fin, c;
        float tc = 18.74f, te = 25.00f;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Tabla de conversión de $ Peso a $$ Dólar y a $$$ Euro.");

        do {
            do {
                System.out.print("Dame el Inicio    : "); ini = obj.nextInt();
                System.out.print("Dame el Final     : "); fin = obj.nextInt();
            } while (fin < ini);        //Valida que el inicio sea menor que el fin.
    
            c = ini;
            System.out.println("Pesos \t\t Dollar \t Euro");
            System.out.println("----------------------------------------------------------------");
            while (c <= fin) {
                System.out.printf("%10d \t %10.2f \t %10.2f \n", c, c * tc, c * te);
                c++;
            }
            System.out.println("----------------------------------------------------------------");
    
            System.out.print("\n¿ Deseas continuar (S/N) ? "); resp = Character.toUpperCase(obj.next().charAt(0));
            
        } while (resp != 'N');
        

    }
}