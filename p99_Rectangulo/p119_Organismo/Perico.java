package p119_Organismo;

public class Perico extends Organismo implements Ave{
    public Perico(String nombre){
    super(nombre);    
    }
    @Override
    public void dosPatas() {
        System.out.println("Es un Ave que camina en dos patas > es un perico");  
    }
    @Override
    public void volar() {
        System.out.println("Es un Ave que vuela > es un perico");     
    }
    @Override
    public void multiCalcular() {
        System.out.println("Es un Anima multicelular > es un perico");  
    }

    @Override
    public void sangreCaliente() {
        System.out.println("Es un Animal de sangre caliente > es un perico");  
    }
}
