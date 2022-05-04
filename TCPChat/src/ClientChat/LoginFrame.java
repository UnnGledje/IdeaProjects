package ClientChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class LoginFrame  extends JFrame {

    private final ChatClient client;
    JTextField loginField = new JTextField();
    //JPasswordField passwordField = new PasswordField();
     JButton loginButton = new JButton("Login");

     public LoginFrame(){
         super("Login");

         this.client = new ChatClient("localhost", 2222);


         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         JPanel panel = new JPanel();
         panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
         panel.setSize(200,300);
         panel.add(loginField);
         panel.add(loginButton);

         loginButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                    doLogin();
             }

         });

         getContentPane().add(panel, BorderLayout.CENTER);
         setVisible(true);
         setResizable(false);
         pack();

     }
    private void doLogin() {
        String login = loginField.getText();
        if(!Objects.equals(this.loginField.getText(), "")){
        MainGui mg = new MainGui(client, login);
        JFrame frame = new JFrame("Users");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.getContentPane().add(mg, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setResizable(false);

        setVisible(false);
        } else if(Objects.equals(this.loginField.getText(), "")){
            JOptionPane.showMessageDialog(this, "Invalid login");
        }


    }
        public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }
}
