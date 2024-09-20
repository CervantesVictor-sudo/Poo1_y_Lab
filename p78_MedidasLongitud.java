/**
 * p78_MedidasLongitud - Convertir medidas de metros a pulgadas y de pulgadas a metros.
 */

import java.util.Scanner;

public class p78_MedidasLongitud {

    public static float MetToIn (float m) {
        m = m * 3.28f;
        return m;
    }

    public static float InToMet (float in) {
        in = in * 2.54f;
        return in;
    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Float in, m;
        int op;

        do{
        System.out.print("\033[H\033[2J");

        System.out.println("Conversion de Longitudes");
        System.out.println("1. Metro a pulgada.\n2. Pulgada a metro.\n3. Salir");
        System.out.print("Elige: "); op = obj.nextInt();

        switch (op) {
            case 1:
            System.out.println("Convertir de Metro a pulgadas.");
            System.out.print("\nDame los metros: "); m = obj.nextFloat();
            System.out.print("\nEl resultado es: "+ MetToIn(m));

            break;
            case 2:
            System.out.println("Convertir de Pulgadas a metros");
            System.out.print("\nDame las pulgadas: "); in = obj.nextFloat();
            System.out.print("\nEl resultado es: "+ InToMet(in)); 

            break;
            case 3:
            System.out.println("\nGracias por utilizar este programa"); break;
        
            default:
                break;
        }

            System.out.println("\n<Presiona cualquier tecla para continuar>");obj.nextLine();obj.nextLine();
        } while (op!=3);
        System.out.println("\nPrograma terminado.");
        obj.close(); 
    }
}