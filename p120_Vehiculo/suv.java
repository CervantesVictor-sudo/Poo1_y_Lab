package p120_Vehiculo;

public class suv extends Maquina implements TodoTerreno {
    public suv (String nombre){
        super(nombre);    
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente; es una SUV.");
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un automóvil con tracción 4x4: es una SUV.");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil con combustión interna: es una SUV.");
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico: es una SUV.");
    }   
}
