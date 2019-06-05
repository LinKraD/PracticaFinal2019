import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuardaDiario {
    Ambitos ambito;
    JDialog terminaDiario;
    public GuardaDiario(){
        terminaDiario=new JDialog();
        terminaDiario.setLayout(new FlowLayout());

        JPanel informacion=new JPanel(new GridLayout(0,2,5,5));
        JLabel textoAmbito=new JLabel("Seleccione un ámbito");
        JComboBox introduceAmbito=new JComboBox<String>();
        introduceAmbito.addItem(Ambitos.LOCAL.getTipo());
        introduceAmbito.addItem(Ambitos.NACIONAL.getTipo());
        introduceAmbito.addItem(Ambitos.PROVINCIAL.getTipo());
        introduceAmbito.addItem(Ambitos.REGIONAL.getTipo());

        informacion.add(textoAmbito);
        informacion.add(introduceAmbito);


        JPanel boton=new JPanel();
        JButton guardar=new JButton("Guardar");

        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ambito= (Ambitos) introduceAmbito.getSelectedItem();

                terminaDiario.setVisible(false);
                terminaDiario.dispose();
            }
        });
        boton.add(guardar);

        terminaDiario.add(informacion);
        terminaDiario.add(boton);

        terminaDiario.setBounds(50,50,250,250);
        terminaDiario.setModal(true);
        terminaDiario.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        terminaDiario.setLocationRelativeTo(null);
    }


    public Ambitos daAmbito(){

        terminaDiario.setVisible(true);

        return ambito;
    }

}
