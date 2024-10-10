// p14_CalculoTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos.

import java.util.Scanner;

public class p14_CalculoTiempo {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        double horas, dias, minutos, segundos;
        Scanner obj = new Scanner(System.in);

        System.out.print("\nDame una cantidad de Horas para convertir: ");
        horas = obj.nextDouble();

        System.out.print("\033[H\033[2J"); System.out.flush();
        dias = horas/24;
        minutos = 60*horas;
        segundos = 60*minutos;

        System.out.println(String.format("\nDada la cantidad de Horas de: %.2f", horas));
        System.out.println(String.format("\nSu equivalente en Días es de: %.2f", dias));
        System.out.println(String.format("\nSu equivalente en Minutos es de: %.2f", minutos));
        System.out.println(String.format("\nSu equivalente en Segundos es de: %.2f", segundos));
    }
}