// p04_PagaTrabajador - Calcula la paga de un chambeador

import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagaBruta, pagaNeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando la paga de un trabajador.");
        //Entrada
        System.out.print("Dame el nombre del trabajador: "); nombre = obj.nextLine();
        System.out.print("Horas trabajadas:              "); horas = obj.nextInt();
        System.out.print("Paga por hora:                 "); paga = obj.nextFloat();
        tasa = 0.03;
        //Proceso
        pagaBruta = horas * paga;
        impuesto = pagaBruta * tasa;
        pagaNeta = pagaBruta - impuesto;
        //Salida
        System.out.println(String.format("El trabajador %s trabajó %d horas con una paga de %.2f pesos y una tasa de %.2f", nombre,horas,paga,tasa));
        System.out.println(String.format("Paga Bruta        : %.2f", pagaBruta));
        System.out.println(String.format("Impuesto          : %.2f", impuesto));
        System.out.println(String.format("Paga Neta         : %.2f", pagaNeta));
    }
}
