// Permite capturar y almacenar en disco una serie de datos.
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class p135_Archivos4 {
    public static void capturarDatos (ArrayList<String> datos) {
        String dato="";
        System.out.println("\nIntroduce un dato y presiona <Enter>, dato vacio para terminar.");
        while (true) {
            dato = new Scanner(System.in).nextLine();
            if (dato.isEmpty()) break;
            datos.add(dato);
        }
    }

    public static void mostrarDatos (ArrayList<String> datos) {
        System.out.println("\nLos datos hasta el momento son:");
        for (String dato : datos)
            System.out.println(dato);
    }

    public static void grabarDatos (String archivo, ArrayList<String> datos) throws IOException {
        BufferedWriter fdatos = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String dato : datos)
            fdatos.write(dato + "\n");
        fdatos.close();  
    }

    public static ArrayList<String> leerDatos (String archivo) throws IOException {
        ArrayList<String> datos = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));
        String dato;
        while ((dato=fdatos.readLine())!=null)
            datos.add(dato);
        return datos;
    }

    public static void main(String[] args) {
        int op;
        Scanner obj = new Scanner(System.in);
        ArrayList<String> datos = new ArrayList<>();
        String archivo = "datos.txt";
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("________ Procesamiento de datos ________");
            System.out.println("Capturar datos ............ ( 1 )");
            System.out.println("Grabar datos en archivo ... ( 2 )");
            System.out.println("Leer datos en archivo ..... ( 3 )");
            System.out.println("Mostrar datos ............. ( 4 )");
            System.out.println("S A L I R ................. ( 5 )");
            System.out.print("Selleciona cualquier opción : "); op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nCaptura datos ...");
                    capturarDatos(datos);
                    break;
                case 2:
                    System.out.println("\nGrabando datos en archivo ...");
                    try {
                        grabarDatos(archivo, datos);
                    } catch (Exception e) {
                        System.out.println("ERROR al grabar el archivo ...");
                    }
                    break;
                case 3:
                    System.out.println("\nLeyendo datos en archivo ...");
                    try {
                        datos = leerDatos(archivo);
                    } catch (Exception e) {
                        System.out.println("ERROR leyendo el archivo ...");
                    }
                    break;
                case 4:
                    System.out.println("\nMostrando datos ...");
                    mostrarDatos(datos);
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema ...");
                    break;
                default:
                    System.out.println("\nOpción inválida ..!!!! ... !!! ... !!!");
                    break;
            }
            System.out.println("\n\n<< Precione cualquier tecla para continuar >>"); obj.nextLine(); obj.nextLine();
        } while (op!=5);
        System.out.println("\nProceso terminado.");
    }
}
