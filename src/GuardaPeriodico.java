import javax.swing.*;
import java.awt.*;

public class GuardaPeriodico {
    JDialog guardar;

    public GuardaPeriodico() {
        guardar=new JDialog();
        guardar.setLayout(new GridLayout(2,0));
        JPanel informacion=new JPanel(new GridLayout(0,2,5,5));

        JLabel nombrePeriodico=new JLabel("Nombre del periodico");
        JTextField nombre=new JTextField(10);
        JLabel tipoPeriodico=new JLabel("Tipo del periodico");
        JComboBox tipo=new JComboBox<String>();
        tipo.addItem(Tipo.IMPRESO.getTipo());
        tipo.addItem(Tipo.DIGITAL.getTipo());
        tipo.addItem(Tipo.AMBOS.getTipo());

        JLabel contenidoPeriodico=new JLabel("Contenido del periodico");
        JComboBox contenido=new JComboBox<String>();
        contenido.addItem(Contenido.ESPECIFICO.getTipoContenido());
        contenido.addItem(Contenido.GENERAL.getTipoContenido());

        JLabel periodoPeriodico=new JLabel("Período del periodico");
        JComboBox periodo=new JComboBox<String>();
        periodo.addItem("Diario");
        periodo.addItem("Semanal");

        JPanel boton=new JPanel();
        JButton aceptar=new JButton("Aceptar");

        informacion.add(nombrePeriodico);
        informacion.add(nombre);
        informacion.add(tipoPeriodico);
        informacion.add(tipo);
        informacion.add(contenidoPeriodico);
        informacion.add(contenido);
        informacion.add(periodoPeriodico);
        informacion.add(periodo);

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
}
