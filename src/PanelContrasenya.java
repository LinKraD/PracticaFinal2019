import javax.swing.*;
import java.awt.*;

public class PanelContrasenya extends JPanel{
    JDialog ponerContrasenya=new JDialog();

    JPanel contrasenya=new JPanel();

    JLabel textoCont=new JLabel("Contrasenya");
    JTextField cont=new JTextField(13);

    JButton aceptar=new JButton("Aceptar");

    public PanelContrasenya() {
        contrasenya.add(textoCont);
        contrasenya.add(cont);
        add(contrasenya);
        add(aceptar);
    }
}
