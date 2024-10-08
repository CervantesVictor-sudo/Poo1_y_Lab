package p106_Persona;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Perez", "Sierra de Cardos 123", 41);
        Persona p2 = new Persona("Maria", "Lo de Vega 34", 25);

        Estudiante e1 = new Estudiante("Carlos Castañeda", "Sierra Nevada 123", 25, "Ing Software", 2000, 700);

        System.out.print("\033[H\033[2J");
        System.out.println("Personas");
        System.out.println(p1);
        System.out.println(p2); //No ponerle nada al p2 y p1 automaticamente lo pone a toString.
    }
}
