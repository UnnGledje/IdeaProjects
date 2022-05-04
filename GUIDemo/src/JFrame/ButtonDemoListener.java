package JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

public class ButtonDemoListener extends JFrame implements ActionListener {
    JLabel label = new JLabel("Hello");
    JButton button = new JButton("Press Here");

    ButtonDemoListener() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        button.addActionListener(this);
        this.add(p);
        p.add(label);
        p.add(button);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(label.getText().equalsIgnoreCase("Hello")){
            label.setText("Jump");
        }
        else{
            label.setText("Hello");
        }
    }

}
