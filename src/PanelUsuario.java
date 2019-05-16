import javax.swing.*;
import java.awt.*;

public class PanelUsuario extends JPanel{
        Usuario usuario;
        


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
        add(textoNombre);
        add(nombre);
        add(textoApellidos);
        add(apellidos);
        add(textoCorreo);
        add(correo);
        add(textoFecha);
        add(fechaNac);

        botonAceptar.add(aceptar);

    }

}

