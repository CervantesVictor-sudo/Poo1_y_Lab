import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class p144_Temperaturas extends JFrame implements ActionListener, ChangeListener {
    JLabel lblCentigrados, lblFaranheit, lblResultadoCentigrados, lblResultadoFaranheit, lblResultado;
    JTextField txtCentigrados,txtFaranheit;
    ButtonGroup grpOpciones;
    JRadioButton rbtCentigrados, rbtFaranheit;
    JButton btnCalcular, btnSalir;

    public p144_Temperaturas() {
        super("Calcular temperaturas");
        setLayout(null);

        lblCentigrados = new JLabel("Centigrados: "); lblCentigrados.setBounds(10, 20, 200, 30);
        add(lblCentigrados);
        txtCentigrados = new JTextField(); txtCentigrados.setBounds(120, 20, 200, 30);
        add(txtCentigrados);
        lblFaranheit = new JLabel("Faranheit: "); lblFaranheit.setBounds(10, 50, 200, 30);
        add(lblFaranheit);
        txtFaranheit = new JTextField(); txtFaranheit.setBounds(120, 50, 200, 30);
        add(txtFaranheit);

        grpOpciones = new ButtonGroup();
        rbtFaranheit = new JRadioButton("Faranheit");
        rbtCentigrados = new JRadioButton("Centigrados");
        grpOpciones.add(rbtFaranheit); grpOpciones.add(rbtCentigrados);
        add(rbtFaranheit); add(rbtCentigrados);

        btnCalcular = new JButton("Calcular"); 
        btnCalcular.setBounds(30, 310, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir"); 
        btnSalir.setBounds(250, 310, 100, 40);
        add(btnSalir);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 170, 200, 30);
        add(lblResultado);
        lblResultadoCentigrados = new JLabel();
        lblResultadoCentigrados.setBounds(50, 200, 400, 30);
        add(lblResultadoCentigrados);
        lblResultadoFaranheit = new JLabel();
        lblResultadoFaranheit.setBounds(50, 220, 400, 30);
        add(lblResultadoFaranheit);

        rbtCentigrados.setBounds(10, 100, 200, 30);
        rbtCentigrados.addChangeListener(this);
        rbtFaranheit.setBounds(250, 100, 200, 30);
        rbtFaranheit.addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        txtCentigrados.setEnabled(true);
        txtFaranheit.setEnabled(true);
    
        if (rbtCentigrados.isSelected()) {
            txtFaranheit.setEnabled(false);
            txtFaranheit.setText(null);
            lblResultadoFaranheit.setText(null);
        }
        else {
            txtCentigrados.setEnabled(false);
            txtCentigrados.setText(null);
            lblResultadoCentigrados.setText(null);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            float tempF = Float.parseFloat(txtFaranheit.getText());
            float resC = (( tempF - 32 ) * 5 / 9);
            lblResultadoCentigrados.setText(String.format("%.2f grados Farenheit, equivale a %.2f grados Centigrados", tempF, resC));
            float tempC = Float.parseFloat(txtCentigrados.getText());
            float resF = ( tempC * 9 / 5 ) + 32;
            lblResultadoFaranheit.setText(String.format("%.2f grados Centigrados, equivale a %.2f grados Farenheit", tempC, resF));
        } else if (e.getSource() == btnSalir){
            dispose();
        }
    }

    public static void main(String[] args) {
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(0, 0, 400, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
