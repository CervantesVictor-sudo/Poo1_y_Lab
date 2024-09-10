// p05_OperacionesMatematicas - Realiza operaciones matemáticas básicas

public class p05_OperacionesMatematicas {

    public static void main(String[] args) {
        double x, y, suma, resta, multi, div, res, pot;
        x = 10.5;
        y = 2.5;
        suma = x + y;
        resta = x - y;
        multi = x * y;
        div = x / y;
        res = x % y;
        pot = Math.pow(x, y);
        
        System.out.println(String.format("Los números son: %.2f, %.2f", x, y));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("El de la Suma: %.2f\nEl de la Resta: %.2f",suma,resta));
        System.out.println(String.format("El de la Multiplicacion: %.2f\nEl de la Division: %.2f",multi,div));
        System.out.println(String.format("El del Residuo: %.2f\nEl de la Potencia: %.2f",res,pot));

    }
}