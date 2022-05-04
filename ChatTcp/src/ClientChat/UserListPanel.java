package ClientChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class UserListPanel extends JPanel implements UserListPanelInterface {

        private final Client client;
        private JList<String> userListUI;
        private DefaultListModel<String> userListModel;

        public UserListPanel(Client client) {
            this.client = client;

            userListModel = new DefaultListModel<>();
            userListUI = new JList<>(userListModel);
            setLayout(new BorderLayout());
            add(new JScrollPane(userListUI), BorderLayout.CENTER);

           /* userListUI.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    if (e.getClickCount() > 1) {
                        String login = userListUI.getSelectedValue();
                        Client c = null;
                        try {
                            c = new Client();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                        JFrame f = new JFrame("Message: " + login);
                        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        f.setSize(500, 500);
                        f.getContentPane().add(c, BorderLayout.CENTER);
                        f.setVisible(true);
                    }
                }
            });
            */
            userListUI.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() > 1) {
                        String login = userListUI.getSelectedValue();
                        MessagePanel messagePanel = new MessagePanel(client, login);

                        JFrame f = new JFrame("Message: " + login);
                        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        f.setSize(500, 500);
                        f.getContentPane().add(messagePanel, BorderLayout.CENTER);
                        f.setVisible(true);
                    }
                }
            });
        }

        public static void main(String[] args) throws IOException {
           Client client = new Client("localhost", 5555);

            UserListPanel userListPanel = new UserListPanel(client);
            JFrame frame = new JFrame("User List");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 600);

            frame.getContentPane().add(userListPanel, BorderLayout.CENTER);
            frame.setVisible(true);

        }

        @Override
        public void online(String login) {
            userListModel.addElement(login);
        }

        @Override
        public void offline(String login) {
            userListModel.removeElement(login);
        }
    }



