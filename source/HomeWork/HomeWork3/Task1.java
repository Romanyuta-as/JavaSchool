package HomeWork.HomeWork3;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by AlexRS on 21.07.2016.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        Set<File> files = new HashSet<>();
        FileFirstLoad.init(files);
        FileFirstLoad.print(files);
        System.out.println(files.size());

    }
}
