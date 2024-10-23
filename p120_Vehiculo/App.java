package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        sedan mSedan = new sedan("Nombre=Vochito, Propietario=Victor Cervantes, Pasajeros=4]");
        suv mSuv = new suv("Nombre=Mamalona, Propietario=Joaquin Martinez, Pasajeros=6 ]");

        System.out.print("\033[H\033[2J");
        System.out.println("Máquina [ " + mSedan.getNombre() + "\n");
        mSedan.sistemaElectrico();
        mSedan.combustionInterna();
        mSedan.carroceriaTres();
        mSedan.chasisMonocasos();
        mSedan.reposar();
        mSedan.arrancar();
        mSedan.frenar();
        System.out.println("");

        System.out.println("Máquina [ " + mSuv.getNombre() + "\n");
        mSuv.sistemaElectrico();
        mSuv.combustionInterna();
        mSuv.traccion4x4();
        mSuv.chasisIndependiente();
        mSuv.reposar();
        mSuv.arrancar();
        mSuv.frenar();
    }
}
