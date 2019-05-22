import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;

public class PanelUsuario extends JPanel{
        
    JDialog creacionUsuario=new JDialog();

    JLabel textoNombre=new JLabel("Nombre");
    JLabel textoApellidos=new JLabel("Apellidos");
    JLabel textoCorreo=new JLabel("Correo electronico");
    JLabel textoFecha=new JLabel("Fecha de nacimiento");

    JTextField nombre=new JTextField(10);
    JTextField apellidos=new JTextField(10);
    JTextField correo=new JTextField(10);
    JTextField fechaNac=new JTextField(10);

    JPanel botonAceptar=new JPanel(new FlowLayout());
    JButton aceptar=new JButton("Aceptar");

    public PanelUsuario() {
        add(textoNombre);
        add(nombre);
        add(textoApellidos);
        add(apellidos);
        add(textoCorreo);
        add(correo);
        add(textoFecha);
        add(fechaNac);

        botonAceptar.add(aceptar);

        add(botonAceptar);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario usuario=new Usuario(nombre.getText(),apellidos.getText(),correo.getText(),fechaNac.getText());


                JDialog dialogo=new JDialog();
                dialogo.pack();
                dialogo.setLocationRelativeTo(null);
                dialogo.setVisible(true);
            }
        });

    }

    public JDialog getDialogo(){
        return this.creacionUsuario;
    }
}

