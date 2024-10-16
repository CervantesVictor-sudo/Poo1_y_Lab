package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;
    private double Total;
    public JugadorActivo (String nombre, char sexo, String descripcion, double salario, int partidos, int goles, double total) {
        super (nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
        Total = total;
        Total = salario + bono;
    }
    @Override
    public double getBono() {
        bono = (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
        return bono;
    }
    @Override
    public String toString() {
        return "JugadorActivo ["+ super.toString() +"Partidos=" + Partidos + ", Goles=" + Goles + ", Bono=" + getBono() + "]";
    }
    
}
