import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;

public class GuardaSemanal {
    double precio;
    JDialog terminaSemanal;
    public GuardaSemanal(){
        terminaSemanal=new JDialog();
        terminaSemanal.setLayout(new FlowLayout());

        JPanel informacion=new JPanel(new GridLayout(0,2,5,5));
        JLabel textoPrecio=new JLabel("Escriba el precio");
        JTextField introducePrecio=new JTextField();


        informacion.add(textoPrecio);
        informacion.add(introducePrecio);


        JPanel boton=new JPanel();
        JButton guardar=new JButton("Guardar");

        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                precio=parseDouble(introducePrecio.getText());

                terminaSemanal.setVisible(false);
                terminaSemanal.dispose();
            }
        });
        boton.add(guardar);

        terminaSemanal.add(informacion);
        terminaSemanal.add(boton);

        terminaSemanal.setBounds(50,50,250,250);
        terminaSemanal.setModal(true);
        terminaSemanal.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        terminaSemanal.setLocationRelativeTo(null);
    }

    public double daPrecio(){

        terminaSemanal.setVisible(true);

        return precio;
    }
}
