/**
 * p81_InicializaArregloNumeros - Inicializar un arreglo con valores flotantes.
 */

import java.util.Scanner;

public class p81_InicializaArregloNumeros {
    public static void main(String[] args) {

        double [] nums = new double[7];

        nums [0] = 5.0;
        nums [1] = 10.0;
        nums [2] = 15.5;
        nums [3] = 20.5;
        nums [4] = 25.0;
        nums [5] = 100.22;
        nums [6] = 90.0;
        //nums [7] = 100; // No existe posición 7.

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Primer elemento: " + nums[0]);
        System.out.println("Último elemento: " + nums[6]);
        //System.out.println("Otro: " + nums[7]); // No es posible, fuera de rango

        System.out.println("Todos los elementos del arreglo con un For en base al índice");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nTodos los elementos del arreglo con un For sin índice");
        for (double i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nTodo ha terminado...");
        
    }
}