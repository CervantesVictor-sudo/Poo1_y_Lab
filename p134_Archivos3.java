// Utiliza streams para leer datos de un archivo

import java.io.*;
import java.util.ArrayList;

public class p134_Archivos3 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        File arch = new File("ciudades.txt");
        ArrayList<String> ciudades = new ArrayList<String>();

        if ( arch.exists() ) {
            try {
                    BufferedReader fciudades = new BufferedReader(new FileReader(arch));
                    String lineas;

                    while ((lineas = fciudades.readLine()) !=null ) {
                        System.out.println(lineas);
                        ciudades.add(lineas);
                    }
                    fciudades.close();
                    System.out.println("\nLas ciudades que están ya en el arreglo.");
                    for (String ciudad : ciudades) {
                        System.out.println(ciudad);
                    }

                } catch (Exception e) {
            }
            
        } else System.out.println("No existe el archivo.");
    }
}
