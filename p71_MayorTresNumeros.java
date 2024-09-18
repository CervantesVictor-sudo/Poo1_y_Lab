/**
 * p71_MayorTresNumeros - Calcula e imprime el mayor de 3 números.
 */

import java.util.Scanner;

public class p71_MayorTresNumeros {

    public static float Mayor (float num1, float num2, float num3) {
        float mayor = 0;
        if (num1>num2 && num1>num3) 
            mayor = num1;
        else if (num2>num1 && num2>num3)
            mayor = num2;
        else if (num3>num1 && num3>num1)
        mayor = num3;

        return mayor;
    } 
    public static void main(String[] args) {
        float num1, num2, num3, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Dame tres numeros separados por espacio.");
        num1 = obj.nextFloat(); num2 = obj.nextFloat(); num3 = obj.nextFloat();

        res = Mayor(num1, num2, num3);
        if (! (res==-1))
            System.out.println("\nEl mayor de los 3 numeros es: " + Mayor(num1, num2, num3));
        else 
            System.out.println("No hay un numero mayor entre los numeros ingresados.");
    }
}