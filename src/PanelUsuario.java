import javax.swing.*;
import java.awt.*;

public class PanelUsuario {
        Usuario usuario;
        
    JDialog creacionUsuario=new JDialog();

    JPanel datosUsuario=new JPanel(new GridLayout(0,2,5,5));

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

    public String mostrar() {
        return usuario.getNombre();
    }

    public String getUsuario() {
        return usuario.getNombre();
    }

    public PanelUsuario() {
        datosUsuario.add(textoNombre);
        datosUsuario.add(nombre);
        datosUsuario.add(textoApellidos);
        datosUsuario.add(apellidos);
        datosUsuario.add(textoCorreo);
        datosUsuario.add(correo);
        datosUsuario.add(textoFecha);
        datosUsuario.add(fechaNac);

        botonAceptar.add(aceptar);

        creacionUsuario.add(datosUsuario);
    }

    public JDialog getDialogo(){
        return this.creacionUsuario;
    }
}

