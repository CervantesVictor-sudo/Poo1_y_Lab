/**
 * p38_AceptarEstudianteV2 - Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones,
 * decidir si el estudiante es aceptado. La Universidad Kitty Kat SA es solo para mujeres mayores de
 * 21 años con un promedio de entre 8 y 9.5.
 */

import java.util.Scanner;

public class p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        
        String nombre, sexo;
        int edad;
        double cal1, cal2, cal3, prom;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Universidad Kitty Kat SA\nSistema de Admisión\n");
        System.out.print("Ingresa tu nombre: "); nombre = obj.nextLine();
        System.out.print("[H / M] \nIngresa tu sexo: "); sexo = obj.nextLine();

        switch (sexo) {
            case "H": System.out.println("\nNo aceptamos Hombres en esta Universidad..."); break;

            case "M": System.out.print("Ingresa tu edad: "); edad = obj.nextInt();
                        if (edad<21) System.out.println("\nNo aceptamos menores de edad en esta Universidad...");
                        else {
                            System.out.print("\nDame la calificación 1: "); cal1 = obj.nextFloat();
                            System.out.print("\nDame la calificación 2: "); cal2 = obj.nextFloat();
                            System.out.print("\nDame la calificación 3: "); cal3 = obj.nextFloat();
                            prom = (cal1+cal2+cal3)/3;
                            System.out.printf("\nTu promedio es de: %.2f", prom);
                                if (prom<8 && prom>9.5)System.out.println("\nNo tienes el promedio adecuado para estar en ésta Universidad...");
                                    else System.out.printf("\n%s eres bienvenido en ésta Universidad.", nombre);
            }
            default: break;
        }
        System.out.println("\nGracias por utilizar este sistema...");
    }
}