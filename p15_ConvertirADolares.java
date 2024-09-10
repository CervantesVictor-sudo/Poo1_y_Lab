// p15_ConvertirADolares - Dada una cantidad en pesos y la cotización del dólar, 
// se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double pesos, dolar, divisa;
        Scanner obj = new Scanner(System.in);

        System.out.print("\nDame una cantidad de pesos para convertir a dólares: ");
        pesos = obj.nextDouble();

        System.out.print("\033[H\033[2J"); System.out.flush();
        divisa = 18.70;
        dolar = pesos / divisa;

        System.out.println(String.format("\nDada la cantidad de Pesos de: $%.2f", pesos));
        System.out.println(String.format("\nY el valor de su divisa de: $%.2f", divisa));
        System.out.println(String.format("\nSu equivalente en Dólares es de: $%.2f", dolar));
    }
}
