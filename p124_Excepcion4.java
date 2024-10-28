import java.util.InputMismatchException;
import java.util.Scanner;

//la diferencia con el programa anterior es que las excepciones las atrapamos en un mismo catch.

public class p124_Excepcion4{
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);

        System.out.print("\033[H\033[2J");

        try {
            System.out.println("Valor del numerador     : "); int a = obj.nextInt();
            System.out.println("Valor del denominador   : "); int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado de la división es : " + c);
        } catch (InputMismatchException | ArithmeticException e) { 
            System.out.println("Tanto el numerador como el denominador deben ser números.");
            System.out.println("No se puede dividir entre 0.");
        } finally {
            System.out.println("\nHaya sido como haya sido ya nos vamos a desayunar.");
        }
    }
}