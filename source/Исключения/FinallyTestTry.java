package Исключения;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Student on 26.07.2016.
 */
public class FinallyTestTry {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream(""); FileOutputStream out = new FileOutputStream(" ") ) {
          out.write(in.read());
        }catch (Exception e){

        }
    }
}
