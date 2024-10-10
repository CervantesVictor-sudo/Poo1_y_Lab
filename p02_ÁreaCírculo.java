// p02_ÁreaCírculo - Calcular el área de un círculo

import java.util.Scanner;

public class p02_ÁreaCírculo {

    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el área de un círculo/n");
        System.err.print("Dame el radio del círculo: ");
        radio = lradio.nextFloat();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("\nEl círculo con radio de " + radio + " tiene un área de " + area);
    }
}
