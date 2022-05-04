package ClientChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MessagePanel extends JPanel {
    private final Client client;
    private final String login;

    JPanel p, p1, p2, p3;
    // private DefaultListModel<String> listModel = new DefaultListModel<>();
    // private JList<String> messageList = new JList<>(listModel);
    public static JTextArea textArea = new JTextArea(4, 7);
    //JScrollPane scrollTextArea;
    private JTextField inputField = new JTextField();
    private JButton send = new JButton("Send");
    private JButton disconnect = new JButton("Disconnect");



    /* private JList<String> usernameListUI;
     private DefaultListModel<String> usernameListModel;
     */
    public MessagePanel(Client client, String login) {
        this.client = client;
        this.login = login;

        this.p = new JPanel();
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();


        this.p1.setLayout(new BorderLayout());
        textArea.setOpaque(true);
        textArea.setBackground(Color.lightGray);
        inputField.setOpaque(true);
        inputField.setBackground(Color.white);
        this.p1.add(new JScrollPane(textArea), BorderLayout.CENTER);
        this.p1.add(inputField, BorderLayout.SOUTH);
        // this.p1.add(new JScrollPane(usernameListUI), BorderLayout.EAST);
        // this.p1.add(send, BorderLayout.EAST);

        this.p2.setLayout(new GridLayout(2, 1));
        this.p2.add(send);
        this.p2.add(disconnect);

        this.p3.setLayout(new FlowLayout());

        this.p.add(p1, BorderLayout.CENTER);
        this.p.add(p2, BorderLayout.NORTH);
        this.p.add(p3, BorderLayout.SOUTH);

        //String login = usernameListUI.getSelectedValue();
        //MessagePane mp = new MessagePane();
        //UserListPane ulp = new UserListPane();
        JFrame frame = new JFrame(" Chat Window");
        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.getContentPane().add(p, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();

        send.addActionListener(new ActionListener(){
                                   public void actionPerformed(ActionEvent ev){
                                       String s= null;
                                       try {
                                          /* s = "username should be here"+" : "+inputField.getText() + reader.readLine();
                                           writer.write(s);
                                           writer.write("\r\n");
                                           writer.flush();
                                           */
                                           String text = inputField.getText();
                                           MessagePanel.this.client.msg(MessagePanel.this.login, text);
                                       } catch (IOException e) {
                                           throw new RuntimeException(e);
                                       }
                                       inputField.setText("");
                                   }
                               }
        );

        disconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }

}