import java.util.Scanner;

/**
 * p92_MayorMenor - Permita al usuario capturar n números en un arreglo de números enteros, tambien muestre los elementos del arreglo, 
 * encuentre cuál es el número mayor dentro del arreglo y lo muestre, encuentre cuál es el número menor dentro del arreglo y lo muestre.
 */



public class p92_MayorMenor {

    public static void Mostrar(int[] x){
        for(int i=0; i<x.length; i++)
            System.out.print(x[i] + "   ");
        System.out.println();
    }

    public static int Mayor(int[] x){
        int m = x[0];
        for(int i=1; i <x.length; i++)
            if (x[i] > m) m=x[i];
            return m; 
    }

    public static int Menor(int[] x){
        int m = x[0];
        for(int i=1; i <x.length; i++)
            if (x[i] < m) m=x[i];
            return m; 
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Cuántos numeros vas a ingresar? "); n = obj.nextInt();
        int [] num = new int[n];

        System.out.println("Introduce los " + n + " numeros: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Numero["+(i+1)+"] = ");
            num [i] = obj.nextInt();
        }
        System.out.println("\nLos numeros capturados fueron: "); Mostrar(num);
        System.out.print("\nEl numero MAYOR dentro del arreglo es: "); Mayor(num);
        System.out.print("\nEl numero MENOR dentro del arreglo es: "); Menor(num);
        obj.close();
    }
}