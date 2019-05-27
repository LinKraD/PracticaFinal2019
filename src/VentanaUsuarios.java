import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaUsuarios {
    JDialog ventanaUsuarioRegistrado;
    public VentanaUsuarios(){
        ventanaUsuarioRegistrado=new JDialog();
        ventanaUsuarioRegistrado.setLayout(new GridLayout(2,0));

        JPanel funciones=new JPanel(new GridLayout(0,3,5,5));
        JPanel salida=new JPanel(new FlowLayout());

        JButton ver=new JButton("Ver periódicos");
        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton anyadir=new JButton("Añadir periódico");
        JButton borrar=new JButton("Borrar periódico");

        funciones.add(ver);
        funciones.add(anyadir);
        funciones.add(borrar);

        JButton salir=new JButton("Desconexión");

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaUsuarioRegistrado.setVisible(false);
                ventanaUsuarioRegistrado.dispose();
            }
        });

        salida.add(salir);

        ventanaUsuarioRegistrado.add(funciones);
        ventanaUsuarioRegistrado.add(salida);

        ventanaUsuarioRegistrado.setBounds(50,50,500,250);
        ventanaUsuarioRegistrado.setModal(true);
        ventanaUsuarioRegistrado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        ventanaUsuarioRegistrado.setLocationRelativeTo(null);

    }
}
