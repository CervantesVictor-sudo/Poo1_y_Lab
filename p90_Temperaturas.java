/**
 * p90_Temperaturas - Declare un arreglo de números flotantes llamado temperaturas y que lo inicialice los elementos: 
 * 2.34 - 44.56 - 7.89 - 0.5 - 2.5 - 4.67 - 40.3 - 22.35 - 56.22. También que muestre el primer elemento, muestre el tercer elemento,
 * muestre los elementos del arreglo, ponga a 0 todos los elementos mayores a 10, muestre nuevamente los elementos del arreglo.
 */

public class p90_Temperaturas {
    public static void Mostrar(float[] x){
        for(int i=0; i<x.length; i++)
            System.out.print(x[i] + "   ");
        System.out.println();
    }

    public static void Nuevo (float [] x){
        for(int i=0; i<x.length; i++)
            if (x[i] > 10.0f){
                x[i] = 0;
                System.out.print(x[i] + "   ");
            }
            else
            System.out.print(x[i] + "   ");
        System.out.println();
    }
    public static void main(String[] args) {
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};
        System.out.print("\033[H\033[2J");
        System.out.println("-Arreglo de temperaturas-");
        System.out.println("El primer elemento es: " + temperaturas [0]);
        System.out.println("El tercer elemento es: " + temperaturas [2]);
        System.out.print("Todos los elementos del arreglo son: "); Mostrar(temperaturas);
        System.out.println("\nSi algun elemento es mayor a 10, se le pondrá un 0.\n");
        System.out.print("Los nuevos elementos son:          "); Nuevo(temperaturas);
    
    }
}