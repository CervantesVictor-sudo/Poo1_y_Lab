/**
 * p80_Angulo - Determina el tipo de ángulo en base a su magnitud: <90 agudo, =90 recto, >90 y <180 obtuso,
 * =180 llano, >180 y <360 concavo, =30 completo.
 */

import java.util.Scanner;

public class p80_Angulo {
    public static int TipoAngulo (int angulo) {
        
        if (angulo<90) 
             System.out.println("Es un ángulo: Agudo");
        else if (angulo==90) 
             System.out.println("Es un ángulo: Recto");
        else if (angulo>90 && angulo<180) 
             System.out.println("Es un ángulo: Obtuso");
        else if (angulo==180) 
             System.out.println("Es un ángulo: Llano");
        else if (angulo>180 && angulo<360) 
             System.out.println("Es un ángulo: Concavo");
        else if (angulo==360) 
             System.out.println("Es un ángulo: Completo");

        return angulo;
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Dame algún ángulo entre el 0 y el 360 grados y te diré que tipo es.");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo<0 || angulo>360 ) {
            System.out.print("\n-ERROR-\nPor favor ingresa un ángulo que sea válido.");
            
        } else 
            System.out.print(TipoAngulo(angulo));
         
    }
}