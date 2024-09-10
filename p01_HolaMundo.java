/**
 *p01_HolaMundo -  Manda una salida a la pantalla
 */
public class p01_HolaMundo {
    public static void main (String[] args) {
        String amigo = "Hugo";
        String hermano = "Manuel";
String mensaje = String.format("Tanto %s como %s desean aprender java", hermano, amigo);

        System.out.println("Hola mundo en el lenguaje java");
        System.out.println("\nHola amigo " + amigo + " mi hermano es " + hermano);
        System.out.println("\n" + mensaje);
    }
}