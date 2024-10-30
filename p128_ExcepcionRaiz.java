import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        try {
            float num;
            double raiz;
            Scanner obj = new Scanner(System.in);
            System.out.print("Introduce un número : "); num = obj.nextFloat();
            raiz = Math.sqrt(num);
            System.out.println("El reultado es: " + raiz);
        } catch (Exception e) { 
            System.out.println("ERROR - No puedo calcular la raíz cuadrada.");
        }
    }
}
