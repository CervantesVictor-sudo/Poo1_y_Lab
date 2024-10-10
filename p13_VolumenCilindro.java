// p13_VolumenCilindro - Se desea calcular el volumen de un cilindro dado su radio y altura.

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        double radio, altura, volumen;
        Scanner obj = new Scanner(System.in);

        System.out.print("\nDame el Radio del cilindro: ");
        radio = obj.nextDouble();
        System.out.print("\nDame la Altura del cilindro: ");
        altura = obj.nextDouble();

        System.out.print("\033[H\033[2J"); System.out.flush();
        volumen = (Math.PI) * (radio*radio) * altura;

        System.out.println(String.format("\nCon un radio de: %.2f", radio));
        System.out.println(String.format("\nY una altura de: %.2f", altura));
        System.out.println(String.format("\nEl volumen del cilindro es de: %.2f", volumen));
    }
}
