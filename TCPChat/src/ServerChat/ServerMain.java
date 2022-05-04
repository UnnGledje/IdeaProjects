package ServerChat;

public class ServerMain {

    public static void main(String[] args) {
        int port = 2222;
        Server s = new Server(port);
        s.start();

    }



}
