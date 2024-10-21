package p117_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        Circulo mCirculo = new Circulo(100);

        System.out.print("\033[H\033[2J");
        System.out.println("Probando círculo: ");
        System.out.println(mCirculo);
        mCirculo.ajustar(0.3);
        System.out.println(mCirculo);

        Rectangulo mRectangulo = new Rectangulo(10, 20);
        System.out.println("\nProbando rectangulo: ");
        System.out.println(mRectangulo);
        mRectangulo.ajustar(0.5);
        System.out.println(mRectangulo);
    }
}
