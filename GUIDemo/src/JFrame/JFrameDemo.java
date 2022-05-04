package JFrame;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;

public class JFrameDemo extends JFrame{

    JFrameDemo() {
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         /*
            JFrame frame = new JFrame("JFrame Example");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            JLabel label = new JLabel("JFrame By Example");
            JButton button = new JButton();
            JButton button2 = new JButton();
            button.setText("Button");
            panel.add(label);
            panel.add(button);
            panel.add(button2);
            frame.add(panel);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

         */
    }


    public static void main(String[] args) {
        //JFrameDemo g = new JFrameDemo();
       // JLabelDemo h = new JLabelDemo();
       // ButtonDemoNoListener b = new ButtonDemoNoListener();
        ButtonDemoListener b = new ButtonDemoListener();
        /*
        JFrame f = new JFrame("The Frame");
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        f.add(p);
        p.add(new JLabel("Hej1"), NORTH);
        p.add(new JButton("Hej2"), SOUTH);
        p.add(new JLabel("Hej3"), EAST);
        p.add(new JButton("Hej 4"), WEST);
        p.add(new JButton("hej5"), CENTER);
        f.pack();
        f.setLocation(1000, 500);
        f.setVisible(true);
           */
        /*
        JFrame f = new JFrame("The Frame");
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        f.add(p);
        p.add(new JLabel("Hej1"));
        p.add(new JButton("Hej2"));
        p.add(new JLabel("Hej3"));
        p.add(new JButton("Hej 4"));
        p.add(new JButton("hej5"));
        f.pack();
        f.setLocation(1000, 500);
        f.setVisible(true);
         */

        /*
        JFrame f = new JFrame("The Frame");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2));
        f.add(p);
        p.add(new JLabel("Hej1"));
        p.add(new JButton("Hej2"));
        p.add(new JLabel("Hej3"));
        p.add(new JButton("Hej 4"));
        p.add(new JButton("hej5"));
        f.pack();
        f.setLocation(1000, 500);
        f.setVisible(true);
        */
    }
}
