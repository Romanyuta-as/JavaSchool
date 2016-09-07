package Lesson15;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

/**
 * Created by Student on 29.08.2016.
 */
public class Worker implements Runnable {
    private Socket socket;

    public Worker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run()  {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int secretNumber = new Random().nextInt(9);
        System.out.println("Загадали "+secretNumber);
        try {
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(outputStream));
            BW.write("Попробуй угадай!!!!");
            BW.write("\n");
            BW.flush();
            String answer;
            while (true){
                if((answer = bufferedReader.readLine())!=null){
                    if (secretNumber == Integer.parseInt(answer)){
                        BW.write("Угадал");
                        BW.write("\n");
                        BW.flush();
                        break;
                    }
                    else {
                        BW.write("Lox");
                        BW.write("\n");
                        BW.flush();
                    }
                }

            }
            socket.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ///String s = bufferedReader.readLine();
        //System.out.println(s);


    }
}
