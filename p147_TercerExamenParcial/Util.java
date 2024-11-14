package p147_TercerExamenParcial;

import java.io.FileOutputStream;
import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
    ArrayList<Jugador> datos = new ArrayList<>();
    datos.add(new Jugador("Victor Cervantes",23,'H',"Soltero", "Portero", 10000.00));
    datos.add(new Jugador("Luis Moran",22,'H',"Casado", "Delantero", 15000.00));
    datos.add(new Jugador("Bernardo Bautista",25,'H',"Delantero", "Portero", 14000.00));
    return datos;
    }
    public static void grabarDatos ( String archivo, ArrayList<Jugador> datos ) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}
