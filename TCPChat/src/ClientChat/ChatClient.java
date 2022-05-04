package ClientChat;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {

    private final String address;
    private final int port;
    private Socket socket;
    private OutputStream outStream;
    private BufferedReader bufferIn;

    public ChatClient(String address, int port){
        this.address = address;
        this.port = port;
    }


    public static void main(String[] args) {
        ChatClient client = new ChatClient("localhost", 2222);
    }
}
