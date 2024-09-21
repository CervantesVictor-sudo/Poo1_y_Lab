/**
 * p82_InicializaArregloCadenas - Inicializar un arreglo de cadenas.
 */

import java.util.Scanner;

public class p82_InicializaArregloCadenas {
    public static void main(String[] args) {

        String [] muns = new String[10];

        muns[0] = "Apozol";
        muns[1] = "Apulco";
        muns[2] = "Cañitas";
        muns[3] = "Jerez";
        muns[4] = "Fresnillo";
        muns[5] = "Rio Grande";
        muns[6] = "Sain Alto";
        muns[7] = "Sombrerete";
        muns[8] = "Teul de Gonzalez Ortega";
        muns[9] = "Zacatecas";
        //nums [7] = 100; // No existe posición 7.

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Primer elemento: " + muns[0]);
        System.out.println("Último elemento: " + muns[6]);
        //System.out.println("Otro: " + nums[7]); // No es posible, fuera de rango

        System.out.println("Todos los elementos del arreglo con un For en base al índice");
        for (int i = 0; i < muns.length; i++) {
            System.out.print(muns[i] + " ");
        }
        System.out.println("\nTodos los elementos del arreglo con un For sin índice");
        for (String m : muns) {
            System.out.print(m + " ");
        }
        System.out.println("\nTodo ha terminado...");
    }
}