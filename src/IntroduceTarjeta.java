import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroduceTarjeta {
    String numTarjeta;
    JDialog ventanaTarjeta;

    public IntroduceTarjeta(){
        ventanaTarjeta=new JDialog();
        ventanaTarjeta.setLayout(new GridLayout(2,0));

        JPanel datosTarjeta=new JPanel(new GridLayout(0,2,5,5));

        JLabel textoTarjeta=new JLabel("Pase la tarjeta");
        JTextField tarjeta=new JTextField(13);

        JPanel botonAceptarTarjeta=new JPanel(new FlowLayout());

        JButton aceptarTarjeta=new JButton("Registrarse");

        datosTarjeta.add(textoTarjeta);
        datosTarjeta.add(tarjeta);

        botonAceptarTarjeta.add(aceptarTarjeta);

        ventanaTarjeta.add(datosTarjeta);
        ventanaTarjeta.add(botonAceptarTarjeta);
        aceptarTarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numTarjeta=tarjeta.getText();

                ventanaTarjeta.setVisible(false);
                ventanaTarjeta.dispose();
            }
        });

        ventanaTarjeta.setBounds(50,50,250,250);
        ventanaTarjeta.setModal(true);
        ventanaTarjeta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        ventanaTarjeta.setLocationRelativeTo(null);
    }

    public String daContrasenya(){
        ventanaTarjeta.setVisible(true);

        return numTarjeta;
    }
}
