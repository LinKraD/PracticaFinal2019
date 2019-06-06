import javax.swing.*;

public class MuestraPeriodicos {
    static JDialog muestra;

    public MuestraPeriodicos(){

        JOptionPane.showMessageDialog(OpcionesPeriodico.muestraTodos(null,Ventana.dato));

        muestra.setBounds(50,50,300,250);
        muestra.setModal(true);
        muestra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        muestra.setLocationRelativeTo(null);
    }

    public static void muestra(){
        muestra.setVisible(true);
    }
}
