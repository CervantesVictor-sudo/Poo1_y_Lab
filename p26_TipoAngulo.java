// p26_TipoAngulo - Determina el tipo de ángulo en base a su magnitud: <90 agudo, =90 recto, >90 y <180 obtuso,
// =180 llano, >180 y <360 concavo, =30 completo.

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame algún ángulo entre el 0 y el 360 grados y te diré que tipo es.");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo<0 || angulo>360) {
            System.out.println("¿De cuál te fumaste?\nInténtalo otra vez.");
        } else {
            System.out.print("El tipo de ángulo es: ");
            if (angulo<90) 
                System.out.println("Agudo");
            if (angulo==90) 
                System.out.println("Recto");
            if (angulo>90 && angulo<180) 
                System.out.println("Obtuso");
            if (angulo==180) 
                System.out.println("Llano");
            if (angulo>180 && angulo<360) 
                System.out.println("Concavo");
            if (angulo==30) 
                System.out.println("Completo");
        System.out.println("\nYa casi te estás ganando tu torta de lomo del comedor...");
        }
    }
}
