// p11_CalcularAngulo - Calcula el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo.

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\nDame el valor del ángulo 1: ");
        angulo1 = obj.nextDouble();
        System.out.print("\nDame el valor del ángulo 2: ");
        angulo2 = obj.nextDouble();

        System.out.print("\033[H\033[2J"); System.out.flush();
        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("\nEl valor del tercer ángulo es de: %.2f", angulo3));
        System.out.println(String.format("Con el ángulo 1 de: %.2f\nY con el ángulo 2 de: %.2f", angulo1, angulo2));
    }
}
