import javax.swing.*;
import java.awt.*;

public class Panel {
    private JPanel panel;

    public Panel(){
        this.panel = new JPanel(new GridLayout(0,2));
        panel.setBorder(BorderFactory.createTitledBorder("Cubo"));

    }
}
