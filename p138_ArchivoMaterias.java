import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class p138_ArchivoMaterias {

    public static void capturarDatos (ArrayList<String> materias) {
        String mate="";
        System.out.println("\nIntroduce una materia y presiona <Enter>, dato vacio para terminar.");
        while (true) {
            mate = new Scanner(System.in).nextLine();
            if (mate.isEmpty()) break;
            materias.add(mate);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> materias = new ArrayList<>();
        File arch = new File("materias.txt");
        System.out.print("\033[H\033[2J");
        capturarDatos(materias);

        if ( ! arch.exists() ) {
            System.out.println("No existe el archivo, por lo tanto lo vamos a crear.");
            try {
                BufferedWriter fmaterias = new BufferedWriter(new FileWriter(arch));
                for (String materia : materias) {
                    fmaterias.write(materia + "\n");
                }
                fmaterias.close();
                System.out.println("El archivo fue creado con éxito. Las materias que ingresaste son:\n");
            } catch (Exception e) {
                System.out.println("Hubo un error al manipular el archivo " + e.getMessage());
            }
        } else
            System.out.println("Las materias que ingresaste son:\n");
            System.out.println(materias);
    }
}
