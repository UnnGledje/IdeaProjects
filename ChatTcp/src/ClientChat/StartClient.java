package ClientChat;

public class StartClient {

    public static void main(String [] args){
        try{
            System.out.println("Hello ");
            Client c = new Client("localhost", 5559);
            Thread t1 = new Thread((Runnable) c);
            t1.start();
        }catch(Exception e){e.printStackTrace();}

    }
    }

