package ServerChat;

public class ServerMain extends Thread{
    public static void main(String[] args) {
        int port = 2229;
        Server server = new Server(port);
        server.start();
    }

}
