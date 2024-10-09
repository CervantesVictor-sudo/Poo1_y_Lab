package p106_Persona;

public class Apoyo extends Persona {
    private String Descripcion;
    private String Escolaridad;
    private double paga;
    public Apoyo () {}
    
    
    public Apoyo(String nombre, String direccion, int edad, String descripcion, String escolaridad, double paga) {
        super(nombre, direccion, edad);
        Descripcion = descripcion;
        Escolaridad = escolaridad;
        this.paga = paga;
    }


    public String getDescripcion() {
        return Descripcion;
    }


    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }


    public String getEscolaridad() {
        return Escolaridad;
    }


    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }


    public double getPaga() {
        return paga;
    }


    public void setPaga(double paga) {
        this.paga = paga;
    }


    @Override
    public String toString() {
        return "Apoyo [Descripcion=" + Descripcion + ", Escolaridad=" + Escolaridad + ", paga=" + paga + "]";
    }

    
    
}
