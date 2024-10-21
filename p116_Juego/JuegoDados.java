package p116_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego {
    private int dado1, dado2;
    private String jugador1, jugador2;
    private Scanner obj = new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.print("Nombre Jugador 1: "); jugador1 = obj.nextLine();
        System.out.print("Nombre Jugador 2: "); jugador2 = obj.nextLine();
        
    }
    @Override
    public void jugar() {
        dado1 = 1 + (int)(Math.random()*6);
        dado2 = 1 + (int)(Math.random()*6);
    }
    @Override
    public void finalizar() {
        System.out.println(jugador1 + " le salió el valor de " + dado1);
        System.out.println(jugador2 + " le salió el valor de " + dado2);
        if (dado1>dado2)
            System.out.println("Ganó " + jugador1 + " con valor de " + dado1);
        else if (dado2>dado1)
            System.out.println("Ganó " + jugador2 + " con valor de " + dado2);
        else 
            System.out.println("Los jugadores empataron con un valor de " + dado1);
        
    }

}
