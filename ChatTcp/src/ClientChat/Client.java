package ClientChat;

import javax.swing.*;
import java.io.*;
import java.net.*;

public class Client {

    /* public JTextField tx;
     public JTextArea ta;
     public String login=" ";
     BufferedWriter writer;
     BufferedReader reader;
     */
       /* JPanel p, p1, p2, p3;
       // private DefaultListModel<String> listModel = new DefaultListModel<>();
       // private JList<String> messageList = new JList<>(listModel);
        public JTextArea textArea = new JTextArea(4, 7);
        //JScrollPane scrollTextArea;
        private JTextField inputField = new JTextField();
        private JButton send = new JButton("Send");
        private JButton disconnect = new JButton("Disconnect");

         private final String serverName;
    private final int serverPort;
    private Socket socket;
    private InputStream serverIn;
    private OutputStream serverOut;
    private BufferedReader bufferedIn;

        */
    BufferedWriter writer;
    BufferedReader reader;
    private String IPAdress;
    private int port;


    public Client(String IPAdress, int port) throws IOException {
        this.IPAdress = IPAdress;
        this.port = port;
    }

    /*

        try {
            Socket socketClient = new Socket("localhost", 5555);
            writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));

            reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));


        } catch (Exception e) {
            e.printStackTrace();
        }
        public void run(){
            try {
                String serverMsg = "";
                while ((serverMsg = reader.readLine()) != null) {
                    System.out.println("from server: " + serverMsg);
                    MessagePanel.textArea.append(serverMsg + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

     */

    public void msg(String login, String text) throws IOException {
        String name = "";
        String body = " ";
        String msgOut = name + " :" + body + "\n";
        writer.write(msgOut);
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost", 2224);
    }


}
        //login=l;

           /* JFrame f=new JFrame("my chat");
            f.setSize(400,400);
            JPanel p1=new JPanel();
            p1.setLayout(new BorderLayout());
            JPanel p2=new JPanel();
            p2.setLayout(new BorderLayout());
            tx=new JTextField();
            p1.add(tx, BorderLayout.CENTER);
            JButton b1=new JButton("Send");
            p1.add(b1, BorderLayout.EAST);
            ta=new JTextArea();
            p2.add(ta, BorderLayout.CENTER);
            p2.add(p1, BorderLayout.SOUTH);
            f.setContentPane(p2);
           */
        //  usernameListModel = new DefaultListModel<>();
        // usernameListUI = new JList<>(usernameListModel);

          /*  this.p = new JPanel();
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

           */

        /*try {
            Socket socketClient = new Socket("localhost", 5555);
            writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));

            reader = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));


        } catch (Exception e) {
            e.printStackTrace();
        }
        public void run(){
            try {
                String serverMsg = "";
                while ((serverMsg = reader.readLine()) != null) {
                    System.out.println("from server: " + serverMsg);
                    MessagePanel.textArea.append(serverMsg + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void msg(String login, String text) throws IOException {
        String name = "";
        String body = " ";
        String msgOut = name + " :" + body + "\n";
        writer.write(msgOut);
    }
}

           /* send.addActionListener(new ActionListener(){
                                     public void actionPerformed(ActionEvent ev){
                                         String s= null;
                                         try {
                                             s = "username should be here"+" : "+inputField.getText() + reader.readLine();
                                             writer.write(s);
                                             writer.write("\r\n");
                                             writer.flush();
                                         } catch (IOException e) {
                                             throw new RuntimeException(e);
                                         }
                                         inputField.setText("");
                                     }
                                 }
            );'

            */

          /*  disconnect.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   System.exit(0);
                }
            });

           */

        // f.setVisible(true);
          /*  public void msg(String name, String body){
                String name = "";
                String body = " ";
                String msgOut = name + " :" + body + "\n";
                writer.write(msgOut);

            }
        }

           */
