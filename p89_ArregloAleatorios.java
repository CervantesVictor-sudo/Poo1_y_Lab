/**
 * p89_ArregloAleatorios - Genera dos arreglos de números aleatorios y los suma.
 */

import java.util.Random;

public class p89_ArregloAleatorios {

    public static void Mostrar (float[] x) {
        for (int i = 0; i < x.length; i++) 
            System.out.printf("%.2f ", x[i]);
        System.out.println();
    }

    public static void GeneraAleatorios (float[] x) {
        float min = 1.5f, max = 10.5f; 
        for (int i = 0; i < x.length; i++) 
            x[i] = new Random().nextFloat(max - min) + min;
    }

    public static void SumaArreglos (float[] x, float[] y, float[] z) {
        for (int i = 0; i < z.length; i++) {
            z [i] = x [i] + y [i];
        }
    }

    public static void main(String[] args) {
        int Max = 3;
        float[] f1 = new float[Max];
        float[] f2 = new float[Max];
        float[] f3 = new float[Max];

        System.out.print("\033[H\033[2J");
        GeneraAleatorios(f1);
        GeneraAleatorios(f2);
        System.out.println("Arreglos de números aleatorios:");
        Mostrar(f1);
        Mostrar(f2);
        System.out.println("El arreglo con la suma de los dos arreglos es:");
        SumaArreglos(f1, f2, f3);
        Mostrar(f3);
    }
}