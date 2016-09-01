package Lesson15;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Student on 29.08.2016.
 */
//написать чат с определенным количеством людей, если подключилось больше то говорить клиенту чтобы он ожидал(широковещательный)"Использовать симафоры"
public class MyServer {
    public static final int DEFAULT_PORT = 4444;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(DEFAULT_PORT);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (true) {
            Socket accept = serverSocket.accept();
//            //InputStream inputStream = accept.getInputStream();
//            OutputStream outputStream = accept.getOutputStream();
//            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//            ///String s = bufferedReader.readLine();
//            //System.out.println(s);
//
//            BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(outputStream));
//            BW.write((new Date()).toString());
//            BW.write("\n");
//            BW.flush();
//            accept.close();
//            outputStream.close();
            executorService.execute(new Worker(accept));
        }
     }
}
