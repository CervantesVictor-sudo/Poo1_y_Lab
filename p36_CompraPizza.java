/**
 * p36_CompraPizza - Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), 
 * luego elige la cantidad, si la compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%.
 * Diseñe un programa que permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada,
 * total compra, descuento, total de compra con descuento.
 */

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        float subtotal, precio, porcentaje;
        double desc, total;
        subtotal = 0;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Buen día, aquí comienza el proceso de ordenar tu pizza.\n");
        System.out.println("[1] Chica-$5 --- [2] Mediana-$10 --- [3] Grande-$20\n");
        System.out.print("Comienza eligiendo el tamaño: "); 
        int tam = new Scanner(System.in).nextInt();
        
        switch (tam) {
            case 1: System.out.println("\nTamaño seleccionado: Chico. "); 
                    precio = 5;
                    System.out.print("\n¿Cuántas pizzas deseas ordenar? "); 
                    int canCh = new Scanner(System.in).nextInt();
                    float canCh1 = canCh;
                    subtotal = precio * canCh;
                    System.out.printf("El subtotal de %d pizzas de tamaño Chico es de: $%.2f pesos.", canCh, subtotal);
                    break;

            case 2: System.out.println("\nTamaño seleccionado: Mediano."); 
                    precio = 10;
                    System.out.print("\n¿Cuántas pizzas deseas ordenar? "); 
                    int canM = new Scanner(System.in).nextInt();
                    float canM1 = canM;
                    subtotal = precio * canM;
                    System.out.printf("El subtotal de %d pizzas de tamaño Mediano es de: $%.2f pesos.", canM, subtotal);
                    break;

            case 3: System.out.println("\nTamaño seleccionado: Grande."); 
                    precio = 20;
                    System.out.print("\n¿Cuántas pizzas deseas ordenar? "); 
                    int canG = new Scanner(System.in).nextInt();
                    float canG1 = canG;
                    subtotal = precio * canG;
                    System.out.printf("El subtotal de %d pizzas de tamaño Grande es de: $%.2f pesos.", canG, subtotal);
                    break;

            default: 
            System.out.println("\nERROR - Seleccionaste un tamaño inexistente."); break;
        }

        if (subtotal>=2000) {
            desc = subtotal * 0.15;
            total = subtotal - desc;
            System.out.printf("\n¡Felicidades! Obtuviste un descuento de: $%.2f pesos", desc); 
            System.out.printf("\nEl total con descuento de tu compra es de: $%.2f pesos.", total);
        } else {
            System.out.print("\nNo aplica para descuento.");
            System.out.printf("\nEl total de tu compra es de: $%.2f pesos.", subtotal);
        }
    }
}