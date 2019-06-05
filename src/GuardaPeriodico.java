import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GuardaPeriodico {
    String nombre;
    Tipo tipo;
    Contenido contenido;
    Ambitos ambito;
    double precio;
    JDialog guardar;

    public GuardaPeriodico() {
        guardar=new JDialog();
        guardar.setLayout(new GridLayout(2,0));
        JPanel informacion=new JPanel(new GridLayout(0,2,5,5));

        JLabel nombrePeriodico=new JLabel("Nombre del periodico");
        JTextField introduceNombre=new JTextField(10);
        JLabel tipoPeriodico=new JLabel("Tipo del periodico");
        JComboBox introduceTipo=new JComboBox<String>();
        introduceTipo.addItem(Tipo.IMPRESO.getTipo());
        introduceTipo.addItem(Tipo.DIGITAL.getTipo());
        introduceTipo.addItem(Tipo.AMBOS.getTipo());

        JLabel contenidoPeriodico=new JLabel("Contenido del periodico");
        JComboBox introduceContenido=new JComboBox<String>();
        introduceContenido.addItem(Contenido.ESPECIFICO.getTipoContenido());
        introduceContenido.addItem(Contenido.GENERAL.getTipoContenido());

        JLabel periodoPeriodico=new JLabel("Período del periodico");
        JComboBox introducePeriodo=new JComboBox<String>();
        introducePeriodo.addItem("Diario");
        introducePeriodo.addItem("Semanal");

        JPanel boton=new JPanel();
        JButton aceptar=new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (introducePeriodo.getSelectedIndex()==0){
                    nombre=introduceNombre.getText();
                    tipo= Tipo.valueOf(((String) introduceTipo.getSelectedItem()).toUpperCase());
                    contenido= Contenido.valueOf(((String) introduceContenido.getSelectedItem()).toUpperCase());

                    GuardaDiario diario=new GuardaDiario();

                    ambito=diario.daAmbito();

                    guardar.setVisible(false);
                    guardar.dispose();
                }
            }
        });

        informacion.add(nombrePeriodico);
        informacion.add(introduceNombre);
        informacion.add(tipoPeriodico);
        informacion.add(introduceTipo);
        informacion.add(contenidoPeriodico);
        informacion.add(introduceContenido);
        informacion.add(periodoPeriodico);
        informacion.add(introducePeriodo);

        boton.add(aceptar);

        guardar.add(informacion);
        guardar.add(boton);


        guardar.setBounds(50,50,250,250);
        guardar.setModal(true);
        guardar.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        guardar.setLocationRelativeTo(null);
    }

    public void guarda() {
        guardar.setVisible(true);
    }

    public void creaDiario(File contrasenya){

        Periodicos p=new Diario(nombre,tipo,contenido,ambito);

        OpcionesPeriodico.guardaEnFichero(contrasenya,p);

    }
}
