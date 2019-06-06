import javax.swing.*;

public class MuestraPeriodicos {
    static JDialog muestra;

    public MuestraPeriodicos(){
        muestra=new JDialog();
        JLabel texto=new JLabel(OpcionesPeriodico.muestraTodos(Ventana.dato));

        muestra.add(texto);
        muestra.setBounds(50,50,250,250);
        muestra.setModal(true);
        muestra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        muestra.setLocationRelativeTo(null);
    }

    public static void muestra(){
        muestra.setVisible(true);
    }
}
