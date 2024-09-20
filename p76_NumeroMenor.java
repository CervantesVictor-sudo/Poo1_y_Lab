/**
 * p76_NumeroMenor - Diseña un programa con una función que pida 4 números
 *                   enteros y devuelva el menor de ellos.
 */

import java.util.Scanner;

public class p76_NumeroMenor {

    public static int Menor (int num1, int num2, int num3, int num4) {
        int menor = 0;
        if (num1<num2 && num1<num3 && num1<num4) 
            menor = num1;
        else if (num2<num1 && num2<num3 && num2<num4)
            menor = num2;
        else if (num3<num1 && num3<num2 && num3<num4)
            menor = num3;
        else if (num4<num1 && num4<num2 && num4<num3)
            menor = num4;

        return menor;
    } 

    public static void main(String[] args) {
        int num1, num2, num3, num4, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Dame cuatro números enteros aleatorios.");
        System.out.print("\nNúmero 1: "); num1 = obj.nextInt(); 
        System.out.print("\nNúmero 2: "); num2 = obj.nextInt();
        System.out.print("\nNúmero 3: "); num3 = obj.nextInt();
        System.out.print("\nNúmero 4: "); num4 = obj.nextInt();

        res = Menor(num1, num2, num3, num4);
        if (! (res==-1))
            System.out.println("\nEl Menor de los 4 números es el: " + Menor(num1, num2, num3, num4));
        else 
            System.out.println("No hay un número menor entre los ingresados.");
        obj.close();
    }
}