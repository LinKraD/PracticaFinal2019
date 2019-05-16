import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {

    private static JTextField contrasenya;

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Inicio");
        ventana.setLayout(new FlowLayout());
        JPanel acceso=new JPanel();
        JPanel datosAcceso=new JPanel();
        contrasenya=new JTextField(13);
        JLabel textoContrasenya=new JLabel("Contraseña");
        datosAcceso.add(textoContrasenya);
        datosAcceso.add(contrasenya);

        JButton entrar=new JButton("Entrar");
        acceso.add(entrar);

        datosAcceso.add(acceso);
        ventana.add(datosAcceso);
        ventana.add(acceso);

        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        JButton nuevo=new JButton("¿Eres nuevo? Registrate ahora");


        ventana.add(nuevo);

        nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PanelUsuario p = new PanelUsuario();
                JDialog dialogo=new JDialog();
                dialogo.add(p);
                dialogo.pack();
                dialogo.setLocationRelativeTo(null);
                dialogo.setVisible(true);

            }
        });

        ventana.setBounds(50,50,250,250);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
