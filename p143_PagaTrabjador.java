import javax.swing.*;
import java.awt.event.*;

public class p143_PagaTrabjador extends JFrame implements ActionListener {
    private JLabel lblNombre, lblHoras, lblPagaPorHora;
    private JTextField txtNombre, txtHoras, txtPagoPorHora;
    private JButton btnCalcular, btnSalir;

    public p143_PagaTrabjador() {
        super("Calculando la paga de un trabajador");

        setLayout(null);
        lblNombre = new JLabel("Nombre: ");
        lblNombre.setBounds(10, 20, 200, 30);
        add(lblNombre);

        lblHoras = new JLabel("Horas: ");
        lblHoras.setBounds(10, 50, 200, 30);
        add(lblHoras);

        lblPagaPorHora = new JLabel("Paga por hora:");
        lblPagaPorHora.setBounds(10, 80, 200, 30);
        add(lblPagaPorHora);

        txtNombre = new JTextField();
        txtNombre.setBounds(80, 20, 200, 30);
        add(txtNombre);

        txtHoras = new JTextField();
        txtHoras.setBounds(80, 50, 200, 30);
        add(txtHoras);

        txtPagoPorHora = new JTextField();
        txtPagoPorHora.setBounds(80, 80, 200, 30);
        add(txtPagoPorHora);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 110, 100, 40);
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 110, 100, 40);
        btnSalir.addActionListener(this);
        add(btnSalir);

        lblResultado = new JLabel("[Aquí va el resultado]");
        lblResultado.setBounds(90, 80, 200, 30);
        add(lblResultado);

        btnCalcular.addActionListener(this);
    }

    public float getArea(float base, float altura) {
        return (base * altura ) / 2;
    }

    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa", "Te vas porque quieres", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if ( e.getSource() == btnCalcular ) {
            float base = Float.parseFloat(txtBase.getText());
            float altura = Float.parseFloat(txtAltura.getText());
            //float area = getArea(base, altura);
            lblResultado.setText(String.format("%.2f", area));
        }
    }
    public static void main(String[] args) {
        p141_AreaTrianguloGUI app = new p141_AreaTrianguloGUI();
        app.setBounds(0, 0, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}