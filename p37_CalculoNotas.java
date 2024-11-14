/**
 * p37_CalculoNotas - Se desea calcular el promedio de 5 calificaciones introducidas por el usuario,
 * luego evaluar el resultado e imprimir un mensaje de acuerdo con el promedio obtenido.
 */

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        
        float prom, cal1, cal2, cal3, cal4, cal5;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Vamos a calcular tu promedio de calificaciones.");
        System.out.print("\nDame la primer calificación: "); cal1 = obj.nextFloat();
        System.out.print("\nDame la segunda calificación: "); cal2 = obj.nextFloat();
        System.out.print("\nDame la tercer calificación: "); cal3 = obj.nextFloat();
        System.out.print("\nDame la cuarta calificación: "); cal4 = obj.nextFloat();
        System.out.print("\nDame la quinta calificación: "); cal5 = obj.nextFloat();

        prom = (cal1+cal2+cal3+cal4+cal5)/5;

        if (prom>0 && prom<6) {
            System.out.printf("\nLo siento, quedas REPROBADO. \nTienes un promedio de: %.2f", prom);
        }
        else if (prom>=6 && prom<=7) {
            System.out.printf("\nPasaste de PANZAZO. \nTienes un promedio de: %.2f", prom);
        }
        else if (prom>7 && prom<=8) {
            System.out.printf("\nMuy bien, puedes mejorar. \nTienes un promedio de: %.2f", prom);
        }
        else if (prom>8 && prom<=9) {
            System.out.printf("\nEXCELENTE, sigue así. \nTienes un promedio de: %.2f", prom);
        }
        else if (prom>9 && prom<=10) {
            System.out.printf("\nPERFECTO, tu esfuerzo valió la pena. \nTienes un promedio de: %.2f", prom);
        }
    }
}