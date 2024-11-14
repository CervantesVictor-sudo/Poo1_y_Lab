/**
 * p32_PagoEstacionamiento - Administra el pago del estacionamiento de acuerdo a la zona
 * norte 3 %, Sur 5 %, Este 10 %, Oeste 20 %.
 */

import java.util.Scanner;

public class p32_PagoEstacionamiento {
    public static void main(String[] args) {
        
        float pago, total, imp;
        char est;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elije el tipo de estacionamiento que usaste: ");
        System.out.println("Estacionamiento [N]orte - 3 % ");
        System.out.println("Estacionamiento [S]ur - 5 % ");
        System.out.println("Estacionamiento [E]ste - 10 % ");
        System.out.println("Estacionamiento [O]este - 20 % "); 
        est = Character.toUpperCase( obj.next().charAt(0) );
        switch (est) {
            case 'N': imp = 0.03f; break;
            case 'S': imp = 0.05f; break;
            case 'E': imp = 0.10f; break;
            case 'O': imp = 0.20f; break;
            default: break;
        }
        imp = obj.nextFloat(); 
        System.out.println("Cuanto pagaste: "); pago = obj.nextFloat();
        total = pago * ( 1 + imp);

        System.out.printf("Pagaste %.2f y un impuesto de %.2f en el total pagaste %.2f", pago, imp, total);
        
    }
}