import java.util.InputMismatchException;
import java.util.Scanner;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        try {
            int reparto, num, dul;
            Scanner obj = new Scanner(System.in);
            System.out.print("¿Cuántos niños hay en el barrio? "); num = obj.nextInt();
            System.out.print("\n¿Cuántos dulces hay en existencia? "); dul = obj.nextInt();
            reparto = (dul/num);
            System.out.printf("\nA cada niño le tocan %.2s dulces.", reparto);
        } catch (InputMismatchException e) { 
            System.out.println("Los niños y/o los dulces, deben ser cantidades numéricas.");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay dulces, no puedo repartir dulces.");
        }

    }
}
