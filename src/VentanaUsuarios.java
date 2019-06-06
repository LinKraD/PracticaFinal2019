import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaUsuarios {
    String contrasenya;
    JDialog ventanaUsuarioRegistrado;
    public VentanaUsuarios(){
        ventanaUsuarioRegistrado=new JDialog();
        ventanaUsuarioRegistrado.setLayout(new GridLayout(2,0));

        JPanel funciones=new JPanel(new GridLayout(0,2,5,5));
        JPanel salida=new JPanel(new FlowLayout());

        JButton ver=new JButton("Ver periódicos");
        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,OpcionesPeriodico.muestraTodos(Ventana.dato));

            }
        });
        JButton anyadir=new JButton("Añadir periódico");
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuardaPeriodico guardar=new GuardaPeriodico();
                guardar.guarda();
            }
        });

        funciones.add(ver);
        funciones.add(anyadir);

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
