package p115_Telefono;

public class Telefono implements GPS, Radio {

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas (0,0)... Estás en casa ...");
        
    }

    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo Radio ...");
        
    }

    @Override
    public void iniciarRadio() {
        System.out.println("Iniciando Radio en la Super G ...");
        
    }
    
}
