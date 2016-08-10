package HomeWork.HomeWork9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 1 on 10.08.2016.
 */
public class StructureChat {
    static class Message implements Serializable{
        long id;
        String user;
        String message;

        public Message(String user, String message) {
            this.id = System.currentTimeMillis();
            this.user = user;
            this.message = message;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "user='" + user + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }

        String getKey(){
            return ""+message.length()+user+id;
        }
    }

    static class  Client {
    public static void main(String[] args) {
        try {
            Socket socket;
            socket = new Socket("127.0.0.1", 1234);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Scanner console = new Scanner(System.in);
//            if (console == null) {
//                throw new IllegalStateException("Can't use console");
//            }
            System.out.print("Enter your username: ");
            String username = console.nextLine();
//

            String line;

            System.out.print("Enter message:");
            line = console.nextLine();

            System.out.println("End client!");
            Message ms = new Message(username,line);
            outputStream.writeObject(ms);
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    }
    public static class ClientThread extends Thread{
    private Socket socket;
    private String message;

    public ClientThread(Socket socket) {
        this.socket = socket;
        this.run();
    }

    public void run() {
        try {
            final ObjectOutputStream outputStream = new ObjectOutputStream(this.socket.getOutputStream());
            final ObjectInputStream inputStream = new ObjectInputStream(this.socket.getInputStream());

            Message msg = (Message) inputStream.readObject();
            message = msg.toString();
            System.out.println(message);
            inputStream.close();
            outputStream.close();
            socket.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
    static  class  Serverr {

        public static void main(String[] args) {
            try {
                ServerSocket socketListner = new ServerSocket(1234);

                while (true) {
                    Socket client = null;
                    while (client == null) {
                        client = socketListner.accept();
                    }
                    new ClientThread(client);
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
