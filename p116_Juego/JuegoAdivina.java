package p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intento;
    
    @Override
    public void iniciar() {
        num = 1 + (int) (Math.random()*100);
    }
    
    @Override
    public void jugar() {
        int num=0;
        do {
            System.out.println("\nDame un número entre el 1 y el 100: "); num = new Scanner(System.in).nextInt();
            if (this.num < num) 
                System.out.println("Más abajo ...");
            else if (this.num > num) 
                System.out.println("Más ariba ...");
            intento++;
            
        } while (this.num != num);
    }
    
    @Override
    public void finalizar() {
        System.out.println("\n"+this.num + " era el número !!, ganaste después de " + intento + " intentos.");
        
    }
}
