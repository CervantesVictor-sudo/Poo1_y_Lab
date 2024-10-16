package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugadores;

    public Equipo (){}
    public Equipo (String nombre, String liga) {
        Jugadores = new ArrayList<>();
        Nombre = nombre;
        Liga = liga;
    }
    public void agregarJugadores(Jugador jugador){
        Jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total = total + jugador.getTotal();
        }

        return total;

    }
}
