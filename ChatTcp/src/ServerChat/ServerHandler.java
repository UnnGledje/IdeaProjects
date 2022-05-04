package ServerChat;

import java.io.*;
import java.net.Socket;

public class ServerHandler extends Thread {
        private final Server server;
        private final Socket clientSocket;
        private String login = null;
        private OutputStream outputStream;

        public ServerHandler(Server server, Socket cSocket){
            this.server = server;
            this.clientSocket = cSocket;
        }

        public String getLogin() {
            return login;
        }

        void socketHandler() throws IOException {
            InputStream inputStream = clientSocket.getInputStream(); //objectinput,
            this.outputStream = clientSocket.getOutputStream();
            BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));


            while (true) {
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                //String data1 = reader.readLine().trim();
                String message = "Incoming : " + read.readLine().trim() + "\n";
                System.out.println("Received : " + message);
                outputStream.write(message.getBytes());
                writer.write(message);
                writer.flush();
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

