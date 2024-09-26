/**
 * p91_MayoresPromedio - Permita al usuario capturar n calificaciones en un arreglo de números flotantes.
 * También muestre los elementos del arreglo, calcule y muestre la suma y el promedio de los elementos del arreglo
 * y muestre solo aquellos elementos mayores al promedio y cuente cuantos son.
 */

import java.util.Scanner;

public class p91_MayoresPromedio {

    public static void Mayor (float[] x, float promedio, int c) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] > promedio) {
                System.out.print(x[i] + "  ");
                c += 1;
            }
        }
    }
    public static void main(String[] args) {
        int n=0, c=0;
        float suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Cuántas calificaciones vas a ingresar? "); n = obj.nextInt();

        float [] califs = new float[n];

        System.out.println("Introduce las " + n + " calificaciones: ");
        for (int i = 0; i < califs.length; i++) {
            System.out.print("Calificación["+(i+1)+"] = ");
            califs [i] = obj.nextFloat();
        }
        System.out.println("\nLas calificaciones capturadas son: ");
        for (float cal : califs) {
            System.out.print(cal + "    ");
            suma = suma + cal;
        }
        promedio = suma / califs.length;
        System.out.println("\n\nLa suma es    : " + suma);
        System.out.println("\nEl promedio es: " + promedio);

        for (int i = 0; i < califs.length; i++) {
            if (califs[i] > promedio) {
                c += 1;
            }
        }

        System.out.print("\nEl numero de elementos mayores al promedio es de " + c);
        System.out.print("\nY los elementos son: "); Mayor(califs, promedio, n);
        
        
    }
}