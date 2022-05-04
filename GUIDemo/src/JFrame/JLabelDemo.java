package JFrame;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    JLabelDemo() {
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        pack();
        setLocation(10000, 5000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
