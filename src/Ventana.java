import javax.swing.*;

public class Ventana {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Ventana de la practica final");

        ventana.setBounds(50,50,500,500);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
