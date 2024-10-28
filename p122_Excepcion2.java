import java.util.Scanner;

public class p122_Excepcion2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        try {
            System.out.print("Dame un valor : ");
            int val = new Scanner(System.in).nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es " + val);

        } catch (Exception e) { // Aqui ponemos los mensajes personalizados
            System.out.println("No friegues, debes ponerle un número!!");
        }

        System.out.println("El mundo sigue!");

    }
}
