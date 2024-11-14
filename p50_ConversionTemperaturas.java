/**
 * p50_ConversionTemperaturas - Convertir la temperatura ingresada de Grados Celcius a Grados Farenheit en el rango establecido por el usuario.
 */

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        char resp;
        float inicio, fin, cent, tc;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Tabla de conversion de Grados Centigrados a Gradoos Farenheit");

        do {       
            System.out.print("Dame el inicio   :   "); inicio = obj.nextInt();
            System.out.print("Dame el fin      :   "); fin = obj.nextInt();
        if (inicio > fin) {
            System.out.print("ERROR - Ingrese nuevamente el inicio de la conversión.");
        } else {
            cent = inicio;
            tc = (cent * 9f / 5f) + 32;
            System.out.println("\nCentigrados \t Farenheit ");
            System.out.println("============================================");
            while (cent <= fin) {
                System.out.printf("%.2f     =  %10.2f \n", cent, tc);
                cent++;
                tc+=1.8;
            }
        }
        System.out.println("============================================");
        System.out.print("\n¿ Quieres hacerlo otra vez (S/N) ?"); resp = Character.toUpperCase(obj.next().charAt(0));

        }while (resp != 'N');
        System.out.println("\nProceso Terminado.");
    }
}