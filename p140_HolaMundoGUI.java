import java.awt.*;
import javax.swing.*;

public class p140_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public p140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Arial", Font.BOLD, 30));
        lblSaludo.setBounds(10, 20, 200, 30);
        add(lblSaludo);
        setTitle("Mi primer Interfaz Gráfica en Java");
    }

    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
