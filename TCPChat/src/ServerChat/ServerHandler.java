package ServerChat;


import java.io.*;
import java.net.Socket;

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
        //BufferedWriter writer =
        //        new BufferedWriter(new OutputStreamWriter(cSocket.getOutputStream()));

        while (true) {
                //String data1 = reader.readLine().trim();
                String message = "Incoming : " + read.readLine().trim() + "\n";
                System.out.println("Received : " + message);
                outputStream.write(message.getBytes());

        /*InputStream inputStream = cSocket.getInputStream(); //objectinput,
        this.outputStream = cSocket.getOutputStream();

        BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line = read.readLine()) != null){
            String[] splits = line.split(" ");
            System.out.println(line);
            if(splits != null && splits.length > 0) {
                String command = splits[0];
                if ("exit".equalsIgnoreCase(command.trim())) {
                    handleDisconnect();
                } else if ("login".equalsIgnoreCase(command.trim())) {
                   handleLogin(outputStream, splits);
                } else if ("input".equalsIgnoreCase(command)) {

                   // handleMsg(splits);
                    //String message = login + command + "\n";
                    //outputStream.write(message.getBytes());
                } else {
                    String message = "unknown " + command + "\n";
                    outputStream.write(message.getBytes());
                }
            }

         */

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




   /* private void handleLogin(OutputStream outputStream, String[] splits) throws IOException {
       if(splits.length == 2)

        if(login.equals(null)){
            String outMsg ="Put in username to login\n";
            outputStream.write(outMsg.getBytes());

        }else{
            String outMsg = login + " sucessfully logged in \n";
            outputStream.write(outMsg.getBytes());
            this.login = login;
        }
    }

    private void handleMsg(StringTokenizer tokens) throws IOException {
        String login = tokens.nextToken();
        String msgBody = tokens.nextToken();

        List<ServerHandler> usernameList = server.getUserList();
        for(ServerHandler user : usernameList) {
            String messageOut = login + msgBody + "\n";
            user.sendMessage(messageOut);
        }
    }

    private void handleDisconnect() throws IOException {
        server.removeUser(this);
        List<ServerHandler> userList = server.getUserList();

        String goingOff = login + " is offline \n";
        for(ServerHandler user : userList) {
            if (!login.equals(user.getLogin())) {
                user.sendMessage(goingOff);
            }
        }
       cSocket.close();
    }

    void sendMessage(String message) throws IOException{
        if(login != null){
            try{
                outputStream.write(message.getBytes());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }


    */

