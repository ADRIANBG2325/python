import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CuentaUser2 extends JFrame implements ActionListener{
    private JTextField jtausuario;
    private JPasswordField pscontrasenia;
    
    public CuentaUser2() {
        
        add(botonCancelar());

        JLabel usuario = new JLabel("Nombre de Usuario: ");
        usuario.setBounds(30, 30, 200, 20);
        add (usuario);

        JLabel contrasenia = new JLabel("Contrasenia (Numeros): ");
        contrasenia.setBounds(30, 80, 200, 20);
        add(contrasenia);

        jtausuario = new JTextField();
        jtausuario.setBounds(200, 30, 150, 20);
        add(jtausuario);

        pscontrasenia = new JPasswordField();
        pscontrasenia.setBounds(200, 80, 150, 20);
        //pscontrasenia.setEchoChar('0');
        add(pscontrasenia);

        JButton botonAceptar = new JButton("ACEPTAR");
        botonAceptar.setBounds(250, 125, 100, 25); 
        botonAceptar.addActionListener(this); 
        add(botonAceptar);
        
    }
    int A=0;
    public void actionPerformed(ActionEvent ae) {
        String A1, A21;
        try{
        int A2;
        A1 = jtausuario.getText();
        A21 = pscontrasenia.getText();
        A2 = Integer.parseInt(A21);
        A += 1;
        if ("Omar".equals(A1)){
            if (A2 == 123){
                Pantalla pantalla = new Pantalla();
                dispose();
                A=0;
            }else{
                JOptionPane.showMessageDialog(null,"Contrasenia y/o Usuario incorrecto, intenta nuevamente\n"+(3-A)+" intentos restantes");
                jtausuario.setText(null);
                pscontrasenia.setText(null);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Contrasenia y/o Usuario incorrecto, intenta nuevamente\n"+(3-A)+" intentos restantes");
            jtausuario.setText(null);
            pscontrasenia.setText(null);
        }
        if (A == 3){
            dispose();
            JOptionPane.showMessageDialog(null,"Cuenta Bloqueada!");
        }
        }catch(NumberFormatException nfe){
            System.out.println(" Dijita Unicamente numeros en la contrasenia "+nfe);
        }
    }
    
    public JButton botonCancelar(){
        JButton botonCancelar = new JButton("CANCELAR");
        botonCancelar.setBounds(50, 125, 100, 25);

        CuentaUser2.EventoBoton2 evento2 = new CuentaUser2.EventoBoton2();
        botonCancelar.addActionListener(evento2); 
        return botonCancelar;
    }

    private class EventoBoton2 implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }
    }

    public static void main(String[] args) {
        
        CuentaUser2 ventana = new CuentaUser2();
        ventana.setLayout(null);
        ventana.setTitle("Iniciar Sesion");
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,200); 
        ventana.setVisible(true);
    }
}

