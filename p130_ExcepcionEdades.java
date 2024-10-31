import java.util.InputMismatchException;
import java.util.Scanner;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int personas[] = new int[5];
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Capture la edad de 5 personas: ");
            for (int i=0; i<5; i++) {
                System.out.printf("\nEdad persona %.2s: ", i+1); 
                personas [i] = obj.nextInt();
            }
            System.out.println("\nLas edades ingresadas son: ");
            for (int i : personas) {
                System.out.print(i + "  ");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Introduce un número entero.");
        }

    }
}
