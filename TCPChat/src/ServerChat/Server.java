package ServerChat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread { //Serializeable

    private final int sPort;
    private ArrayList<ServerHandler> usernameList = new ArrayList<>();
    public Server(int sPort){
        this.sPort =sPort;
    }

    public List<ServerHandler> getUserList(){
        return usernameList;
    }

    @Override
    public void run() {public class ServerHandler {
    public class ServerHandler extends Thread {

        private final Server server;
        private final Socket cSocket;
        private String login = null;
        private OutputStream outputStream;

        public ServerHandler(Server server, Socket cSocket) {
            this.server = server;
            this.cSocket = cSocket;
        }

        public String getLogin() {
            return login;
        }

        void socketHandler() throws IOException {
            InputStream inputStream = cSocket.getInputStream(); //objectinput,
            this.outputStream = cSocket.getOutputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
            BufferedWriter writer =
               new BufferedWriter(new OutputStreamWriter(cSocket.getOutputStream()));

            while (true) {
                //String data1 = reader.readLine().trim();
                String message = "Incoming : " + read.readLine().trim() + "\n";
                System.out.println("Received : " + message);
                outputStream.write(message.getBytes());

            }
        }

        @Override
        public void run() {
            try {
                socketHandler();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
        try {
            ServerSocket sSocket = new ServerSocket(sPort);
            while(true) {
                System.out.println("Trying to accept connection....");
                Socket cSocket = sSocket.accept();
                System.out.println("Accepted connection from " + cSocket);
                ServerHandler user = new ServerHandler(this, cSocket);
                usernameList.add(user);
                user.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }


    public void removeUser(ServerHandler serverUser){
        usernameList.remove(serverUser);
    }
}
