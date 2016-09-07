package Lesson15;

import java.io.*;
import java.net.Socket;

/**
 * Created by Student on 29.08.2016.
 */
public class MyClient {
public static final String HOST = "localhost";
public static final int PORT = 4444;
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(HOST,PORT);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
//
        InputStream inputStream = socket.getInputStream();
        BufferedReader BR = new BufferedReader((new InputStreamReader(inputStream,"UTF-8")));
        System.out.println(BR.readLine());
        BufferedReader consoleReader = new BufferedReader( new InputStreamReader(System.in));
        String answer;
        while (true){
            if((answer = consoleReader.readLine())!=null) {
                BW.write(answer);
                BW.write("\n");
                BW.flush();
                String fromServer = BR.readLine();
                System.out.println(fromServer);
                if(fromServer.equals("Угадал")){

                    break;
                }
                else
                {

                }
            }
        }

        //socket.close();
    }
}
