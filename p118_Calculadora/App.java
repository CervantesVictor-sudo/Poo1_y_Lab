package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora Maizoro = new Calculadora();

        System.out.print("\033[H\033[2J");
        Maizoro.sumar(10,20);
        Maizoro.Restar(100, 50);
        Maizoro.multiplicar(100, 100);
        Maizoro.Dividir(150000, 25);
    }
    
}
