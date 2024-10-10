// p12_ConvertirTemperatura - Convierte temperatura registrada en grados Fahrenheit a grados Celsius.

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double fahrenheit, celsius;
        Scanner obj = new Scanner(System.in);

        System.out.print("\nDame los grados en fahrenheit: ");
        fahrenheit = obj.nextDouble();

        System.out.print("\033[H\033[2J"); System.out.flush();
        celsius = (fahrenheit-32)*5/9;

        System.out.println(String.format("\nSi la temperatura en grados Fahrenheit es de: %.2f", fahrenheit));
        System.out.println(String.format("\nLa temperatura en grados Celsius es de: %.2f", celsius));
    }
}
