package ClientChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MainGui extends JFrame {
    private final ChatClient client;
    private final String login;
    JFrame frame = new JFrame(" Chat Window");
    JPanel p, p1, p2, p3;
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> messageList = new JList<>(listModel);
    private JTextField inputField = new JTextField();
    private JButton send = new JButton("Send");
    private JButton disconnect = new JButton("Disconnect");

    private JList<String> usernameListUI;
    private DefaultListModel<String> usernameListModel;

    BufferedWriter writer;
    public MainGui(ChatClient client, String login){ //ParamehatClient client

        this.client = client;
        this.login = login;
        //this.client.addUserStatusListener(this);

        this.p = new JPanel();
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();

        p.setLayout(new BorderLayout());
        //p1.setLayout(new BorderLayout());
       // p2.setLayout(new BorderLayout());

        this.p1.setLayout(new BorderLayout());
        messageList.setOpaque(true);
        messageList.setBackground(Color.lightGray);
        inputField.setOpaque(true);
        inputField.setBackground(Color.white);
        this.p1.add(new JScrollPane(messageList), BorderLayout.CENTER);
        this.p1.add(inputField, BorderLayout.SOUTH);
       // this.p1.add(send, BorderLayout.EAST);

        this.p2.setLayout(new GridLayout(2,1));
        this.p2.add(send);
        this.p2.add(disconnect);

        usernameListModel = new DefaultListModel<>();
        usernameListUI = new JList<>(usernameListModel);
        this.p3.setLayout(new BorderLayout());
        this.p3.add(new JScrollPane(usernameListUI), BorderLayout.CENTER);

        this.p.add(p1, BorderLayout.CENTER);
        this.p.add(p2, BorderLayout.SOUTH);
        this.p.add(p3, BorderLayout.EAST);

        //String login = usernameListUI.getSelectedValue();
        //MessagePane mp = new MessagePane();
        //UserListPane ulp = new UserListPane();

        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 400);
        frame.getContentPane().add(p, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();

        try{
            Socket socketClient= new Socket("localhost",5555);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
        }catch(Exception e){e.printStackTrace();}

        send.addActionListener(new ActionListener(){
                                 public void actionPerformed(ActionEvent ev){
                                     String s=login+" : "+ inputField.getText();
                                     inputField.setText("");
                                     try{
                                         writer.write(s);
                                         writer.write("\r\n");
                                         writer.flush();
                                     }catch(Exception e){e.printStackTrace();}
                                 }
                             }
        );
       /* usernameListUI.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() > 1){

                    String login = usernameListUI.getSelectedValue();
                    MessagePane mp = new MessagePane(client, login);

                    String login = usernameListUI.getSelectedValue();
                    //MessagePane mp = new MessagePane();
                    UserListPane ulp = new UserListPane();

                    JFrame frame = new JFrame(" Chat Window");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setSize(600, 400);
                    frame.getContentPane().add(ulp, BorderLayout.CENTER);
                    frame.setResizable(false);
                    frame.setVisible(true);
                }
            }
        });

        */

    }

    public static void main(String[] args) {
        ChatClient client = new ChatClient("localhost", 2222);

        MainGui ulp = new MainGui(client , " "); // Parameter --> client
        JFrame frame = new JFrame("Users online");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 800);

        frame.getContentPane().add(ulp, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
