// p10_HipotenusaTriangulo - Calcula la hipotenusa de cualquier triángulo ingresando la longitud de ambos catetos.

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double cat1, cat2, hip;
        Scanner obj = new Scanner(System.in);

        System.out.print("Dame la longitud del cateto 1: ");
        cat1 = obj.nextDouble();
        System.out.print("Dame la longitud del cateto 2: ");
        cat2 = obj.nextDouble();

        System.out.print("\033[H\033[2J"); System.out.flush();
        hip = Math.sqrt((cat1*cat1)+(cat2*cat2));

        System.out.println(String.format("La longitud de la hipotenusa es de: %.2f", hip));
        System.out.println(String.format("Con el cateto 1 de: %.2f\nY con el cateto 2 de: %.2f", cat1, cat2));
    }
}