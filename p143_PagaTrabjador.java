import javax.swing.*;
import java.awt.event.*;

public class p143_PagaTrabjador extends JFrame implements ActionListener {
    private JLabel lblNombre, lblHoras, lblPagaPorHora, lblResultado, lblResultadoPagaBruta, lblResultadoImpuesto, lblResultadoPagaNeta;
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
        txtNombre.setBounds(120, 20, 200, 30);
        add(txtNombre);

        txtHoras = new JTextField();
        txtHoras.setBounds(120, 50, 200, 30);
        add(txtHoras);

        txtPagoPorHora = new JTextField();
        txtPagoPorHora.setBounds(120, 80, 200, 30);
        add(txtPagoPorHora);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 310, 100, 40);
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(250, 310, 100, 40);
        btnSalir.addActionListener(this);
        add(btnSalir);

        lblResultado = new JLabel("Nomina de [NOMBRE]: ");
        lblResultado.setBounds(100, 120, 200, 30);
        add(lblResultado);
        lblResultadoPagaBruta = new JLabel();
        lblResultadoPagaBruta.setBounds(100, 160, 200, 30);
        add(lblResultadoPagaBruta);
        lblResultadoImpuesto = new JLabel();
        lblResultadoImpuesto.setBounds(100, 200, 200, 30);
        add(lblResultadoImpuesto);
        lblResultadoPagaNeta = new JLabel();
        lblResultadoPagaNeta.setBounds(100, 240, 200, 30);
        add(lblResultadoPagaNeta);

        btnCalcular.addActionListener(this);
    }

    public double getPagaBruta(double horas, double paga) {
        return (horas * paga );
    }
    public double getImpuesto(double pagaBruta, double tasa){
        return (tasa * pagaBruta);
    }
    public double getPagaNeta(double pagaBruta, double impuesto) {
        return(pagaBruta - impuesto);
    }

    public void actionPerformed(ActionEvent e) {

        if ( e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa", "Salida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if ( e.getSource() == btnCalcular ) {
            String nom = txtNombre.getText();
            double horas = Double.parseDouble(txtHoras.getText());
            double paga = Double.parseDouble(txtPagoPorHora.getText());
            double tasa = 0.03;
            double PagaBruta = getPagaBruta(horas, paga);
            double Impuesto = getImpuesto(PagaBruta, tasa);
            double PagaNeta = getPagaNeta(PagaBruta, Impuesto);
            lblResultado.setText(String.format("Nomina de %s:", nom));
            lblResultadoPagaBruta.setText(String.format("Paga Bruta        : %.2f", PagaBruta));
            lblResultadoImpuesto.setText(String.format("Impuesto           : %.2f", Impuesto));
            lblResultadoPagaNeta.setText(String.format("Paga Neta          : %.2f", PagaNeta));
        }
    }
    public static void main(String[] args) {
        p143_PagaTrabjador app = new p143_PagaTrabjador();
        app.setBounds(0, 0, 400, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}