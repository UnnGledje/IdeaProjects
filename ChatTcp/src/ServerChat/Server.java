package ServerChat;

import java.io.*;
import java.net.*;
import java.util.*;

class Server extends Thread{
       private int serverPort;
        //public static Vector clients=new Vector(); // Should Be list
        private ArrayList<ServerHandler> usernameList = new ArrayList<>();
        public Server(int serverPort){
            this.serverPort = serverPort;
        }
        /*public Server(){
            try{
                System.out.println("Client Got Connected  " );
                connectionSocket=s;
            }catch(Exception e){e.printStackTrace();}
        }
         */
        public void run(){
           try {
               ServerSocket serverSocket = new ServerSocket(serverPort);

               while(true){
                   System.out.println("Trying to accept client connection.....");
                   Socket clientSocket = serverSocket.accept();
                   ServerHandler serverHandler = new ServerHandler(this, clientSocket);
                   System.out.println("ACCEPTED" + clientSocket);
                   ServerHandler handler = new ServerHandler(this, clientSocket);

                   usernameList.add(handler);
                   Thread serverThread = new Thread(serverHandler);
                   serverThread.start();
                   handler.start();
               }
           }catch(Exception e){e.printStackTrace();}

            }
            public void removeUser(ServerHandler handler){
            usernameList.remove(handler);
            }

         }

                /*
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                BufferedWriter writer=
                        new BufferedWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
                Socket cSocket = sSocket.accept();
                ServerHandler user = new ServerHandler(this, connectionSocket);
                usernameList.add(user);
                user.start();


                while(true){
                    String data1 = reader.readLine().trim();
                    System.out.println("Received : "+data1);

                    for (int i=0;i<usernameList.size();i++){
                        try{
                            BufferedWriter bw= (BufferedWriter)usernameList.get(i);
                            bw.write(data1);
                            bw.write("\r\n");
                            bw.flush();
                        }catch(Exception e){e.printStackTrace();}
                    }
                }

             */




        /*public static void main(String argv[]) throws Exception{
           /* System.out.println("Threaded Chat Server is Running  " );
            ServerSocket mysocket = new ServerSocket(5555);
            while(true){
                Socket sock = mysocket.accept();
                Server server=new Server(sock);
                Thread serverThread=new Thread(server);
                serverThread.start();
            }

            *

        }

         */


