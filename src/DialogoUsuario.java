import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoUsuario {
    String nom;
    String ape;
    String cor;
    String fech;

    public void mostrar() {
        JFrame ventanaPrueba=new JFrame("Panel");
        ventanaPrueba.setLayout(new GridLayout(2,0));
        JPanel panelPrueba=new JPanel();

        JPanel datos=new JPanel(new GridLayout(0,2,5,5));

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

        datos.add(textoNombre);
        datos.add(nombre);
        datos.add(textoApellidos);
        datos.add(apellidos);
        datos.add(textoCorreo);
        datos.add(correo);
        datos.add(textoFecha);
        datos.add(fechaNac);

        botonAceptar.add(aceptar);

        ventanaPrueba.add(datos);
        ventanaPrueba.add(botonAceptar);

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nom=nombre.getText();
                ape=apellidos.getText();
                cor=correo.getText();
                fech=fechaNac.getText();
            }
        });

        ventanaPrueba.setBounds(50,50,250,250);
        ventanaPrueba.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrueba.setLocationRelativeTo(null);
        ventanaPrueba.setVisible(true);
    }


    public Usuario getUsuario() {
        //Usuario u=new Usuario(nom,ape,cor,fech);
        Usuario u=new Usuario("nombre","apellido","correo","fecha");
        return u;
    }
}
