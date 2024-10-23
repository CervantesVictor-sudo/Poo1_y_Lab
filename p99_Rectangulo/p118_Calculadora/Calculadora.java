package p118_Calculadora;

public class Calculadora implements Calcular{

    @Override
    public void mostrarResultado(double Resultado) {
        System.out.println(String.format("%.2f", Resultado));
    }
    @Override
    public void Restar(double x, double y) {
        double res = x - y;
        mostrarResultado(res);
        
    }
    @Override
    public void sumar(double x, double y) {
        double res = x + y;
        mostrarResultado(res);
    }
    @Override
    public void Dividir(double x, double y) {
        double res = x / y;
        mostrarResultado(res);
        
    }
    @Override
    public void multiplicar(double x, double y) {
        double res = x * y;
        mostrarResultado(res);
    }
}
