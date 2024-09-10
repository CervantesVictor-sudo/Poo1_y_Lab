// p03_ÁreaTriangulo - Calcular el área de un triangulo

import java.util.Scanner;

public class p03_ÁreaTriangulo {

    public static void main(String[] args) {
        int base, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el área de un triangulo");
        System.out.print("Dame la base del triangulo: ");
        base = obj.nextInt();
        System.out.print("Dame la altura: ");
        altura = obj.nextInt();

        area = ( base * altura ) / 2;

        System.out.println("Para un triangulo con base de " + base + " y altura de " + altura + ", el área es de: " + area);

    }
}