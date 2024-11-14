package p147_TercerExamenParcial;

import java.io.Serializable;

public class Jugador implements Serializable {
    String Nombre, EstadoCivil, Descripcion;
    char Sexo;
    int Edad;
    Double Salario;
    public Jugador (){}
    public Jugador(String nombre, int edad, char sexo, String estadoCivil, String descripcion, Double salario) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        EstadoCivil = estadoCivil;
        Descripcion = descripcion;
        Salario = salario;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getEstadoCivil() {
        return EstadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public Double getSalario() {
        return Salario;
    }
    public void setSalario(Double salario) {
        Salario = salario;
    }
}
