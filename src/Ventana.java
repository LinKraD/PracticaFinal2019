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
                JFrame creacionUsuario=new JFrame();
                creacionUsuario.setLayout(new GridLayout(2,0,15,10));

                JPanel datosUsuario=new JPanel(new GridLayout(0,2,5,5));

                JLabel textoNombre=new JLabel("Nombre");
                JLabel textoApellidos=new JLabel("Apellidos");
                JLabel textoCorreo=new JLabel("Correo electronico");
                JLabel textoFecha=new JLabel("Fecha de nacimiento");

                JTextField nombre=new JTextField(10);
                JTextField apellidos=new JTextField(10);
                JTextField correo=new JTextField(10);
                JTextField fechaNac=new JTextField(10);


                datosUsuario.add(textoNombre);

                datosUsuario.add(nombre);

                datosUsuario.add(textoApellidos);

                datosUsuario.add(apellidos);

                datosUsuario.add(textoCorreo);

                datosUsuario.add(correo);

                datosUsuario.add(textoFecha);

                datosUsuario.add(fechaNac);

                creacionUsuario.add(datosUsuario);

                JPanel botonAceptar=new JPanel(new FlowLayout());
                JButton aceptar=new JButton("Aceptar");

                botonAceptar.add(aceptar);

                creacionUsuario.add(botonAceptar);

                creacionUsuario.setBounds(50,50,250,250);
                creacionUsuario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                creacionUsuario.setLocationRelativeTo(null);
                creacionUsuario.setVisible(true);
            }
        });

        ventana.setBounds(50,50,250,250);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
