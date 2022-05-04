package JFrame;

import javax.swing.*;
import java.awt.*;

public class ButtonDemoNoListener extends JFrame{
    JLabel label = new JLabel("Hello");
    JButton button1 = new JButton("Press Here");
    JButton button2 = new JButton("Press Here");

    ButtonDemoNoListener(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        this.add(p);
        p.add(label);
        p.add(button1);
        p.add(button2);
        //this.pack();
        this.setLocation(1000, 500);
        setSize(1000, 1000);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
