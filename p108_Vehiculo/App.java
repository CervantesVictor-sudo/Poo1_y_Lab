package p108_Vehiculo;


public class App {
    public static void main(String[] args) {
        Compacto compa1 = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        Compacto compa2 = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);

        Camioneta cam1 = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        Camioneta cam2 = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

    

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("__________________________________________________________________________________________");
        System.out.println(compa1);
        System.out.println(compa2);
        System.out.println(cam1);
        System.out.println(cam2);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Calculando el total de precio de todos los veichulos ");
        System.out.println(compa1.getPrecio());
        System.out.println(compa2.getPrecio());
        System.out.println(cam1.getPrecio());
        System.out.println(cam2.getPrecio());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("La suma total de precios es de " + (compa1.getPrecio() + compa2.getPrecio() + cam1.getPrecio() + cam2.getPrecio()));

    }
}
