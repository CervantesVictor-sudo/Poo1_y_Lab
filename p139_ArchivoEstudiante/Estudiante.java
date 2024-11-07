package p139_ArchivoEstudiante;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String Nombre, Sexo;
    private int Edad;
    private double Promedio;
    public Estudiante() {}

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public double getPromedio() {
        return Promedio;
    }
    public void setPromedio(double promedio) {
        Promedio = promedio;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String sexo) {
        Sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "Estudiante [Nombre= " + Nombre + ", Edad= " + Edad + ", Promedio= " + Promedio + ", Sexo= " + Sexo + "]";
    }
    
}
