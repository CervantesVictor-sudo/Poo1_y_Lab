/** Victor Manuel Cervantes Carrillo.
 * 
 * p65_VentaPapeleria - Una empresa fotocopiadora requiere un programa que le permita llevar el 
 * control de su venta de fotocopias. El valor de la copia es: Carta $3, Oficio $4, Doble Oficio $6.
 * Además, debe mostrarse un resumen de ventas con un mensaje de acuerdo a la venta total: si fue <50 
 * mostrar "venta moderada", si fue >=50 y <=100 mostrar "venta frecuente" y si fue >101 mostrar "venta superada".
 */

import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        //Entradas
        Scanner obj = new Scanner(System.in);
        char resp, tipo;
                //can=cantidad, sub=subtotal, car=carta, of=oficio, dob=doble oficio
        int v = 1, cancar=0, canof=0, candob=0, subcar=0, subof=0, subdob=0, cantotal=0, total;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("---------------------------------");
        System.out.println("Papelería la Malena, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("---------------------------------");

        //Proceso
        do {
            System.out.print("\nVenta: "+ v); v += 1;
            System.out.print("\n¿ Tipo de copia (C)arta $3,(O)ficio $4,(D)oble Of $6 ? ");
            tipo = Character.toUpperCase(obj.next().charAt(0));
            switch (tipo) {
                case 'C':
                    System.out.print("\n¿ Cantidad ? "); cancar = obj.nextInt();
                    subcar = cancar * 3;
                    break;
                case 'O':
                    System.out.print("\n¿ Cantidad ? "); canof = obj.nextInt();
                    subof = canof * 4;
                    break;
                case 'D':
                    System.out.print("\n¿ Cantidad ? "); candob = obj.nextInt();
                    subdob = candob * 6;
                    break;
                default:
                    System.out.println("ERROR - Opción inválida");
                    break;
            }

            System.out.print("\n¿ Deseas hacer otra venta (S/N) ? "); 
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');

        //Salidas
        System.out.println("\n---------------------------------");
        System.out.println("Resumen Diario de Ventas.");
        System.out.println("---------------------------------");
        System.out.print("\nVentas realizadas: "+ (v-1));

        System.out.print("\n---------------------------------");
        System.out.printf("\nCarta        :   %d    -   $%d ", cancar, subcar);
        System.out.printf("\nOficio       :   %d    -   $%d ", canof, subof);
        System.out.printf("\nDoble Oficio :   %d    -   $%d ", candob, subdob);
        System.out.println("\n---------------------------------");
        cantotal = cancar+candob+canof;
        total = subcar+subof+subdob;
        System.out.printf("Tot. Ventas  :   %d    -   $%d\n", cantotal, total);

        if (total<50) {
            System.out.println("\nÉsta venta es una : venta moderada.");
        }
        else if (total>=50 && total<=100) {
            System.out.println("\nÉsta venta es una : venta frecuente.");
        }
        else if (total>101){
            System.out.println("\nÉsta venta es una : venta superada.");
        }
        obj.close();
    }
}