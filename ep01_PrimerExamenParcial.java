/** Victor Manuel Cervantes Carrillo.
 * 
 * 
 * ep01_PrimerExamenParcial - Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
inscripción de los participantes y el dinero recaudado.
 */

import java.util.Scanner;;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char nombre, sexo, tipo, resp;
        int edad, rech=0, TotAl=0, TotMa=0, TotTrab=0, TotGen=0, conEdad=0, totDinGen=0;
        int conH=0, conM=0, totDinAl=0, totDinMae=0, totDinTrab=0, subtotDinAl=0, subtotDinMae=0, subtotDinTrab=0;
        float promEdad=0;
        do {
            do {
                System.out.print("\033[H\033[2J"); System.out.flush();
                System.out.print("Ingrese su nombre: "); nombre = obj.next().charAt(0);
                do {
                    System.out.print("Ingrese [A]lumno, [M]aestro, [T]rabajador : ");
                    tipo = Character.toUpperCase(obj.next().charAt(0));
                } while (tipo!='A'&&tipo!='M'&&tipo!='T');
                do {
                    System.out.print("Ingrese su sexo (H/M): "); sexo = Character.toUpperCase(obj.next().charAt(0));
                } while (sexo!='H' && sexo!='M');
                if (sexo=='H') {
                    conH +=1;
                }else {
                    conM +=1;
                }
                System.out.print("Ingrese su edad: "); edad = obj.nextInt();
                if (edad<23) {
                    System.out.print("No se admiten personas menores de 23 años.");
                    rech += 1;
                }
                conEdad += edad;
            } while (edad<23);
            switch (tipo) {
                case 'A':
                    System.out.printf("\nBienvenido "+nombre+" al ser Alumno deberá pagar $40.");
                    TotAl += 1;
                    subtotDinAl +=1;
                    break;
                case 'M':
                    System.out.printf("\nBienvenido "+nombre+" al ser Maestro deberá pagar $60.");
                    TotMa += 1;
                    subtotDinMae +=1;
                    break;
                case 'T':
                    System.out.print("\nBienvenido "+nombre+" al ser Trabajador deberá pagar $80.");
                    TotTrab += 1;
                    subtotDinTrab +=1;
                    break;
                default:
                    break;
            }
            TotGen = TotAl+TotMa+TotTrab;
            promEdad = conEdad/TotGen;
            System.out.print("\n¿ Deseas hacer otra inscripción (S/N) ? "); 
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.print("\nEl total de Alumnos es de            : "+TotAl);
        System.out.print("\nEl total de Maestros es de           : "+TotMa);
        System.out.print("\nEl total de Trabajadores es de       : "+TotTrab);
        System.out.print("\nEl total de Hombres es de            : "+conH);
        System.out.print("\nEl total de Mujeres es de            : "+conM);
        System.out.print("\nEl total general de participantes es : "+TotGen);
        System.out.print("\nPromedio de edad de los participantes: "+promEdad);
        System.out.print("\nEl total de personas rechazadas es   : "+rech);
        System.out.println("\n--------------------------------------------------------------");
        totDinAl=subtotDinAl*40;
        totDinMae=subtotDinMae*60;
        totDinTrab=subtotDinTrab*80;
        totDinGen=totDinAl+totDinMae+totDinTrab;
        System.out.print("\nEl total de dinero recaudado de Alumnos es de      :"+totDinAl);
        System.out.print("\nEl total de dinero recaudado de Maestros es de     :"+totDinMae);
        System.out.print("\nEl total de dinero recaudado de Trabajadores es de :"+totDinTrab);
        System.out.print("\nEl total de dinero recaudado en general es de      :"+totDinGen);
        System.out.println("\n--------------------------------------------------------------");
        if (totDinGen<50) {
            System.out.println("\nEl evento concluye con ganancias BAJAS");
        }
        else if (totDinGen>=50 && totDinGen<=1000) {
            System.out.println("\nEl evento concluye con ganancias MODERADAS");
        }
        else if (totDinGen>1001){
            System.out.println("\nEl evento concluye con BUENAS ganancias.");
        }
        obj.close();


    }
}