package p120_Vehiculo;

public class sedan extends Maquina implements Familiar {

    public sedan (String nombre){
        super(nombre);
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es un auto tipo familiar con carroceria en tres partes: es un Sedán.");
    }

    @Override
    public void chasisMonocasos() {
        System.out.println("Es de un tipo familiar con chasis monocasco: es un Sedán.");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna: es un Sedán.");
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico: es un Sedán.");
    }
}
