/**
 * p29_Calculadora - Realiza operaciones matemáticas básicas sobre dos números.
 */

import java.util.Scanner;

public class p29_Calculadora {

    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nEfectuando operaciones matemáticas básicas sobre 2 números.");
        System.out.print("Dame el primero número: "); n1 = obj.nextFloat();
        System.out.print("Dame el segundo número: "); n2 = obj.nextFloat();    
        System.out.print("Operación + - * / ^   : "); op = obj.next().charAt(0);

        switch (op) {
            case '+': System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
            break;
            case '-': System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
            break;
            case '*': System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
            break;
            case '/': System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
            break;
            case '^': System.out.printf("%.2f / %.2f = %.2f", n1, n2, Math.pow(n1, n2));
            break;
            default: System.out.println("\nEs operaacion no esta implementada");
            break;
        }
        System.out.println("\nTe estas ganando tus chilaquiles.");
    }
}