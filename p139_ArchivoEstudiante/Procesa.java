package p139_ArchivoEstudiante;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Procesa {
    public static void capturarDatos (ArrayList<Estudiante> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de un Estudiante");
        while (true) {
            Estudiante estudiante = new Estudiante();
            System.out.println("Datos del estudiante >");
            System.out.print("Nombre           : "); estudiante.setNombre( obj.nextLine() );
            if ( estudiante.getNombre().isEmpty() ) break;
            System.out.print("Edad             : "); estudiante.setEdad( obj.nextInt() );
            System.out.print("Promedio         : "); estudiante.setPromedio( obj.nextDouble() );

            System.out.print("\n[H]=1Sexo   : "); estudiante.setSexo( obj.nextInt() );
            String sex = StringValueOf(estudiante.getSexo);

            datos.add(estudiante);
        }
    }

    public static void mostrarDatos ( ArrayList<Estudiante> datos ) {
        System.out.println("\nLos datos al momento son: ");
        for (Estudiante estudiante : datos) {
            System.out.println(estudiante);
        }
    }

    public static void grabarDatos ( String archivo, ArrayList<Estudiante> datos ) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList<Estudiante> leerDatos ( String archivo ) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Estudiante>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}
