// p27_AceptarEstudiante - Acepta a algún estudiante en base a su edad y dos calificaciones:
// edad>=18 y las calificaciones c1>8 y c2>8

import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        double c1, c2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Universidad Patito SA de CV\nSistema de Admisión\n");
        System.out.print("Dame tu nombre: "); nombre = obj.nextLine();
        System.out.print("Dame tu edad: "); edad = obj.nextInt();

        if (edad<18) System.out.println("\nNo aceptamos menores de edad en esta Universidad...");
        else {
            System.out.println("Dame la calificación 1: "); c1 = obj.nextFloat();
            System.out.println("Dame la calificación 2: "); c2 = obj.nextFloat();
            if (c1<8 || c2<8)System.out.println("\nNo tienes el promedio adecuado para estar en ésta Universidad...");
            else System.out.printf("\n%s Bienvenido a esta Universidad, sientete como en tu casa, pero aquí si bájale al baño y recoge tu basura.\n", nombre);
        }
        System.out.println("\nGracias por utilizar este sistema...");
        
    }
}
