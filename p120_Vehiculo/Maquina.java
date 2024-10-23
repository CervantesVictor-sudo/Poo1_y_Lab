package p120_Vehiculo;

public class Maquina {
    private String nombre;

    public Maquina (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void reposar(){
        System.out.println("Reposando...");
    }
    public void arrancar(){
        System.out.println("Arrancando...");
    }
    public void frenar(){
        System.out.println("Frenando...");
    }
}
