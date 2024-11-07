import java.io.*;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] deportes = {"Fútbol", "Béisbol", "Ciclismo", "Atletimso", "Natación", "Motociclismo"};
        File arch = new File("deportes.txt");

        System.out.print("\033[H\033[2J");

        if ( ! arch.exists() ) {
            try {
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String deporte : deportes) {
                    fdeportes.write(deporte + "\n");
                }
                fdeportes.close();
                System.out.println("El archivo fue creado con éxito. Esto contiene:\n");
                System.out.println(fdeportes);
            } catch (Exception e) {
                System.out.println("Hubo un error al manipular el archivo " + e.getMessage());
            }
        } else
            System.out.println("El archivo ya existe... Esto contiene:\n");
            for (String dep : deportes) 
                System.out.println(dep);


                
    }
}