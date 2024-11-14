/**
 * p28_LeyDeNewton - Calcula la Segunda Ley de Newton.
 * f = m * a, m = f / a, a = f / m
 */

import java.util.Scanner;

public class p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m, a;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elige lo que deseas calcular.");
        System.out.println("[F]uerza        (f = m * a)");
        System.out.println("[M]asa          (m = f / a)");
        System.out.println("[A]celeracion   (a = f / m)");
        System.out.println("[S]alir del sistema...");
        System.out.print("\nElige una opción:"); op = obj.next().charAt(0);
        op = Character.toUpperCase(op);
        f = m = a = 0;

        if (op == 'F') {
            System.out.println("Calculando la Fuerza:\n");
            System.out.println("Dame la Masa               :"); m = obj.nextFloat();
            System.out.println("Dame la Aceleración        :"); a = obj.nextFloat();
            f = m * a;
            System.out.printf("La Fuerza es: %.2f \n", f);
            
        } else if (op == 'M') {
            System.out.println("Calculando la Masa:\n");
            System.out.println("Dame la Fuerza             :"); f = obj.nextFloat();
            System.out.println("Dame la Aceleración        :"); a = obj.nextFloat();
            m = f / a;
            System.out.printf("La Masa es: %.2f \n", m);

        } else if (op == 'A') {
            System.out.println("Calculando la Aceleración:\n");
            System.out.println("Dame la Fuerza              :"); f = obj.nextFloat();
            System.out.println("Dame la Masa                :"); m = obj.nextFloat();
            a = f / m;
            System.out.printf("La Fuerza es: %.2f \n", f);

        } else if (op == 'S') {
            System.out.println("Te vas porque yo quiero que te vayas, a la hora que yo quiera te detengo...\n");
        } else  
            System.out.println("Opción Inválida...\n");

        System.out.println("Jale o no jale, nos vamos a lonchar!!!");
    }
}