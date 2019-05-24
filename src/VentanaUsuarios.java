import javax.swing.*;
import java.awt.*;

public class VentanaUsuarios {
    JDialog ventanaUsuarioRegistrado;
    public VentanaUsuarios(){
        ventanaUsuarioRegistrado=new JDialog();
        ventanaUsuarioRegistrado.setLayout(new GridLayout(2,0));

        JPanel funciones=new JPanel(new GridLayout(0,3,5,5));
        JPanel salida=new JPanel(new FlowLayout());

        JButton ver=new JButton("Ver periódicos");
        JButton anyadir=new JButton("Añadir periódico");
        JButton borrar=new JButton("Borrar periódico");

        funciones.add(ver);
        funciones.add(anyadir);
        funciones.add(borrar);

        JButton salir=new JButton("Desconexión");

        salida.add(salir);

    }
}
